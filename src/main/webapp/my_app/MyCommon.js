//日期格式化成
Date.prototype.Format = function (fmt) { //author: meizz 
    if (this-new Date(0)==0){
    	return "";
    }
	var o = {
        "M+": this.getMonth() + 1, //月份 
        "d+": this.getDate(), //日 
        "h+": this.getHours(), //小时 
        "m+": this.getMinutes(), //分 
        "s+": this.getSeconds(), //秒 
        "q+": Math.floor((this.getMonth() + 3) / 3), //季度 
        "S": this.getMilliseconds() //毫秒 
    };
    if (/(y+)/.test(fmt)) fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
    for (var k in o)
    if (new RegExp("(" + k + ")").test(fmt)) fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
    return fmt;
}  
Date.prototype.addDays = function(d){
	this.setDate(this.getDate() + d);
};
Date.prototype.addWeeks = function(w){
	this.addDays(w * 7);
};
Date.prototype.addMonths= function(m){
	var d = this.getDate();
	this.setMonth(this.getMonth() + m);
	if (this.getDate() < d)
		this.setDate(0);
	};
Date.prototype.addYears = function(y){
	var m = this.getMonth();
	this.setFullYear(this.getFullYear() + y);
	if (m < this.getMonth()) {
		this.setDate(0);
	}
};


function getParameterByName(name, url) {
    if (!url) url = unescape(window.location.href);
    name = name.replace(/[\[\]]/g, "\\$&");
    var regex = new RegExp("[?&]" + name + "(=([^&#]*)|&|#|$)"),
        results = regex.exec(url);
    if (!results) return null;
    if (!results[2]) return '';
    return decodeURIComponent(results[2].replace(/\+/g, " "));
}      

function getCurrentLoginName(){
	//var w=_spPageContextInfo.systemUserKey.split("|");
	//return w[w.length-1];
	var name=getParameterByName("tname");
	return name;
}

//js获取项目根路径，如： http://localhost:8083/uimcardprj
function getRootPath(){
    //获取当前网址，如： http://localhost:8083/uimcardprj/share/meun.jsp
    var curWwwPath=window.document.location.href;
    //获取主机地址之后的目录，如： uimcardprj/share/meun.jsp
    var pathName=window.document.location.pathname;
    var pos=curWwwPath.indexOf(pathName);
    //获取主机地址，如： http://localhost:8083
    var localhostPaht=curWwwPath.substring(0,pos);
    //获取带"/"的项目名，如：/uimcardprj
    var projectName=pathName.substring(0,pathName.substr(1).indexOf('/')+1);
    return(localhostPaht);
}

function formatDate(t){
	var d=new Date(t);
	return d.Format("yyyyMMddhhmmss");
}


//转换SharePoint返回日unicode字符
function unicodeToChar(text) {
   return text.replace(/\\u[\dA-F]{4}/gi, 
          function (match) {
               return String.fromCharCode(parseInt(match.replace(/\\u/g, ''), 16));
          });
}

function cloneDate(d){
	var r=new Date();
	r.setTime(d.getTime());
	return r;
}

function convertMSDate(obj,dtProperties,fdtProperties) {
    var pattern = /Date\(([^)]+)\)/;
    Object.getOwnPropertyNames(obj).forEach(function (val, idx, array) {
        var results = pattern.exec(obj[val]);
        if (results != null) {
            var dt = new Date(parseFloat(results[1]));
            obj[val] = dt;
            if (keyExists(val,dtProperties)) {
                obj[val] = dt.Format('yyyy/MM/dd');
            }
            else if (keyExists(val,fdtProperties))  {
                obj[val] = dt.Format('yyyy/MM/dd hh:mm:ss');
            }
        }
    });
}

function keyExists(key, search) {
    if (!search || (search.constructor !== Array && search.constructor !== Object)) {
        return false;
    }
    for (var i = 0; i < search.length; i++) {
        if (search[i] === key) {
            return true;
        }
    }
    return key in search;
}
function isNumber(value) {return typeof value === 'number';}