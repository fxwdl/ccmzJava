<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>	
<%
	String title="长春市医疗救助管理系统";
	pageContext.setAttribute("title", title);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">
<!-- 使用EL表达式输出变量,未指定范围则依次从Page、Request、Session、Application查找 -->
<title>${title}</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/bower_components/bootstrap/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/bower_components/fontAwesome/css/font-awesome.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/bower_components/ionicons/css/ionicons.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/bower_components/adminLTE/dist/css/AdminLTE.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/bower_components/adminLTE/plugins/iCheck/square/blue.css">
<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
<script src="${pageContext.request.contextPath}/bower_components/html5shiv/disk/html5shiv.min.js"></script>
<script src="${pageContext.request.contextPath}/bower_components/respond/dest/respond.min.js"></script>
<![endif]-->
</head>
<body class="hold-transition login-page">
    <div class="login-box" style="width:400px;">
        <div class="login-logo">
            <b>长春市医疗救助管理系统</b>
        </div>
        <!-- /.login-logo -->
        <div class="login-box-body">
            <p class="login-box-msg">请输入用户名和密码登录系统</p>
            <form:form action="${pageContext.request.contextPath}/logincheck" method="post" class="form-horizontal" role="form" onsubmit="onSubmit()" modelAttribute="user">
            	<c:if test="${not empty param.error }">            	
                    <div class="alert alert-danger" role="alert">
                        <a class="close" data-dismiss="alert">×</a>
	            		<p>用户名或密码错误</p>
                    </div>                                
            	</c:if>
                <div class="form-group has-feedback">
                	<form:input path="userName" class="form-control" placeholder="用户名"/>               
                    <span class="glyphicon glyphicon-user form-control-feedback"></span>
                </div>
                <div class="form-group has-feedback">
                	<form:password path="password" class="form-control" placeholder="密码"/>   
                    <span class="glyphicon glyphicon-lock form-control-feedback"></span>
                </div>
                <div class="row">
                    <div class="col-xs-8">
                        <div class="checkbox icheck">
                            <label>                                
                                <input type="checkbox" id="RememberMe">记住我
                            </label>
                        </div>
                    </div>
                    <!-- /.col -->
                    <div class="col-xs-4">
                        <button type="submit" class="btn btn-primary btn-block btn-flat">登录</button>
                    </div>
                    <!-- /.col -->
                </div>            	
            </form:form>
            
        </div>
        <!-- /.login-box-body -->
    </div>
    <!-- /.login-box -->
    <script src="${pageContext.request.contextPath}/bower_components/jquery/dist/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/bower_components/jquery-cookie/jquery.cookie.js"></script>
    <script src="${pageContext.request.contextPath}/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/bower_components/adminLTE/plugins/iCheck/icheck.min.js"></script>
    
    <script src="${resourceRoot}/test.js"></script>
    
    <script>
          $(function () {
            $('input').iCheck({
              checkboxClass: 'icheckbox_square-blue',
              radioClass: 'iradio_square-blue',
              increaseArea: '20%' // optional
            });
            //判断之前是否有设置cookie，如果有，则设置【记住我】选择框
            if ($.cookie("fonour_userName") != undefined) {
                //$("#RememberMe").attr("checked", "checked");
                $("#RememberMe").iCheck('check');
            }
            else {
                //$("#RememberMe").removeAttr("checked");
                $("#RememberMe").iCheck('uncheck');
            }
              //读取cookie
            if ($("#RememberMe:checked").length > 0) {
                $("#UserName").val($.cookie("fonour_userName"));
                $("#Password").val($.cookie("fonour_password"));
            }

            $('#RememberMe').on('ifChecked', function (event) {
                //alert(event.target.value); // alert value
            });
          });
          //根据是否勾选记住我记录或清除cookie
          function onSubmit() {
              if ($("#RememberMe:checked").length > 0) {//设置cookie
                  $.cookie("fonour_userName", $("#UserName").val());
                  $.cookie("fonour_password", $("#Password").val());
              }
              else {//清除cookie
                  $.removeCookie("fonour_userName");
                  $.removeCookie("fonour_password");
              }
          };
    </script>
</body>
</html>