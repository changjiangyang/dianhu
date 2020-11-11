package com.hltx.dianhu.config;

import com.hltx.dianhu.beans.Users;
import com.hltx.dianhu.service.UsesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description:
 * @author: ycj
 * @create: 2020-11-11 11:44
 **/
@Component
public class URLInterceptor implements HandlerInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(URLInterceptor.class);

    @Autowired
    UsesService usesService;

    /**
     * 请求前置处理（后置处理同理）
     *
     * @param request
     * @param response
     * @param handler
     * @return boolean
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String path = request.getServletPath();
        logger.info(path);
        if (path.matches("/callList/addCallList")) {
            logger.info("requestUrl: {}", path);
            String id=request.getParameter("userid");
            Users users= usesService.getByid(id);
            if (users==null){
                return false;
            }else {
                if (users.getStatus()==0){
                    return false;
                }
            }
            // 进行前置处理
            return true;
            // 或者 return false; 禁用某些请求
        } else {
            return true;
        }
    }
}
