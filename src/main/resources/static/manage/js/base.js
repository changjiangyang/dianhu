var host = "http://localhost:8300/";

 /**
 * @param {number} num
 */
function formatTen(num) { 
	return num > 9 ? (num + "") : ("0" + num); 
} 

/**
 * 时间戳 格式化
 * @param {string} date
 */
function formatDate(date) { 
	var date = new Date(date)
	var year = date.getFullYear(); 
	var month = date.getMonth() + 1; 
	var day = date.getDate(); 
	var hour = date.getHours(); 
	var minute = date.getMinutes(); 
	var second = date.getSeconds(); 
	return year + "-" + formatTen(month) + "-" + formatTen(day)+ " " +formatTen(hour)+ ":" +formatTen(minute)+ ":" +formatTen(second); 
}

/**
 * 读取地址栏参数
 * @param {String} name 参数名
 */
function GetQueryString(name)
{
     var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
     var r = window.location.search.substr(1).match(reg);
     if(r!=null)return  unescape(r[2]); return null;
}