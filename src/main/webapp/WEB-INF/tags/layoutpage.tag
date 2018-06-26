<%@ tag language="java" pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%@attribute name="title" required="true"%>
<%@attribute name="module" required="false"%>
<%@attribute name="functionName" required="false"%>
<%@attribute name="smallTitle" required="false"%>

<%@attribute name="header" fragment="true" %>
<%@attribute name="footer" fragment="true" %>
<!DOCTYPE html>
<html style="height: auto;" ng-app="myApp">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>${title }</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <!-- Bootstrap 3.3.6 -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bower_components/bootstrap/dist/css/bootstrap.min.css">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bower_components/fontAwesome/css/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bower_components/Ionicons/css/ionicons.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bower_components/adminLTE/dist/css/AdminLTE.min.css">

    <!-- AdminLTE Skins. Choose a skin from the css/skins folder instead of downloading all of them to reduce the load. -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bower_components/adminLTE/dist/css/skins/_all-skins.min.css">
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="${pageContext.request.contextPath}/bower_components/html5shiv/dist/html5shiv.min.js"></script>
    <script src="${pageContext.request.contextPath}/bower_components/respond/dest/respond.min.js"></script>
    <![endif]-->

    <jsp:invoke fragment="header"/>

</head>
<!-- body加了一个style，用来控制滚动条不自动隐藏，否则会使得页面右侧顶到头，滚动条与其覆盖 -->
<body class="hold-transition skin-blue-light sidebar-mini" style="-ms-overflow-style: scrollbar">
    
    <div class="wrapper">

        <header class="main-header">
            <!-- Logo -->
            <a href="index" class="logo" style="height:52px;">
                <!-- mini logo for sidebar mini 50x50 pixels -->
                <span class="logo-mini"><b>A</b>LT</span>
                <!-- logo for regular state and mobile devices -->
                <span class="logo-lg"><b>医疗救助管理系统</b></span>
            </a>
            <!-- Header Navbar: style can be found in header.less -->
            <nav class="navbar navbar-static-top">
                <!-- Sidebar toggle button-->
                <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </a>

                <div class="navbar-custom-menu">
                    <!-- 放机构名、用户名、退出、返回主页面功能-->
                    <ul class="nav navbar-nav">
                        <!-- User Account: -->
                        <li class="dropdown user user-menu">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                <img src="${pageContext.request.contextPath}/images/user2-160x160.jpg" class="user-image" alt="User Image">
                                <span class="hidden-xs">${user }</span>
                            </a>
                            <ul class="dropdown-menu">
                                <!-- User image -->
                                <li class="user-header">
                                    <img id="user-header" src="${pageContext.request.contextPath}/images/user2-160x160.jpg" class="img-circle" alt="User Image">
                                    <p>${user }</p>
                                </li>
                                <!-- Menu Footer-->
                                <li class="user-footer">
                                    <div class="pull-left">
                                        <a id="systemsettingBtn" href="javascript:void(0)" class="btn btn-default btn-flat">修改密码</a>
                                    </div>
                                    <div class="pull-right">
                                        <a href="/Account/Logout" class="btn btn-default btn-flat">注销</a>
                                    </div>
                                </li>
                            </ul>
                        </li>
                        <!-- Control Sidebar Toggle Button -->
                        <li>
                            <a href="#" data-toggle="control-sidebar">
                                <i class="fa fa-gears"></i>
                            </a>
                        </li>
                    </ul>
                </div>
            </nav>
        </header>
        <!-- Left side column. contains the logo and sidebar -->
        <aside class="main-sidebar">
            <!-- sidebar: style can be found in sidebar.less -->
            <section class="sidebar">
                <!-- sidebar menu: : style can be found in sidebar.less -->
                <ul class="sidebar-menu"  data-widget="tree">
            	<c:if test="${not empty menu }">                 		            	
	           		<c:forEach items="${menu}" var="m">
	           			<c:set var="cssClass" value="fa fa-dashboard"/>
	           			<c:set var="isMActive" value="treeview"/>
	           			<c:if test="${not empty m.cssClass }">
	           				<c:set var="cssClass" value="${m.cssClass}"/>    
	           			</c:if>
	           			<c:if test="${m.title == moudle}">
	           				<c:set var="isMActive" value="active treeview"/>
	           			</c:if>
	           			<li class="${isMActive}">
					        <a href="#">
					            <i class="${cssClass}"></i> <span>${m.title}</span>
					            <span class="pull-right-container">
					                <i class="fa fa-angle-left pull-right"></i>
					            </span>
					        </a>
					        <ul class="treeview-menu">
					        	<c:forEach items="${m.systemFunctions}" var="i">
					        		<c:set var="isFActive" value=""/>
				           			<c:if test="${i.permissionDisplayName == functionName}">
				           				<c:set var="isFActive" value="active"/>
				           			</c:if>
				           			<li class="${isFActive }"><a href="${i.page }" data-href="${i.page }" data-title="${i.permissionDisplayName }" data-my-type="menu" data-my-menu-id="${i.permissionName }"><i class="fa fa-circle-o"></i>${i.permissionDisplayName }</a></li>
					        	</c:forEach>
					        </ul>
				        </li>   			
	           		</c:forEach>	
	           		
            	</c:if>
                </ul>
            </section>
            <!-- /.sidebar -->
        </aside>

        <!-- Content Wrapper. Contains page content -->
        <div class="content-wrapper">
            <!-- Content Header (Page header) -->
            <section class="content-header">
                <h1>
                	${functionName }
                    
                    <small>${smallTitle }</small>
                </h1>
                <ol class="breadcrumb">
                    <li><a href="#"><i class="fa fa-dashboard"></i> 主页</a></li>
                    <li><a href="#">${module }</a></li>
                    <li class="active">${functionName }</li>
                </ol>
            </section>

            <!-- Main content -->
            <section class="content">
                <div class="row">
                    <jsp:doBody/>
                </div>
                <!-- /.row -->
            </section>
            <!-- /.content -->
        </div>
        <!-- /.content-wrapper -->


        <!-- Control Sidebar -->

        <!-- /.control-sidebar -->
        <!-- Add the sidebar's background. This div must be placed
             immediately after the control sidebar -->
        <div class="control-sidebar-bg"></div>
    </div>

    <!-- ./wrapper -->
    <script src="${pageContext.request.contextPath}/bower_components/jquery/dist/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/bower_components/jquery-cookie/jquery.cookie.js"></script>
    <script src="${pageContext.request.contextPath}/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
    <!-- FastClick -->
    <script src="${pageContext.request.contextPath}/bower_components/fastclick/lib/fastclick.js"></script>
    <!-- AdminLTE App -->
    <script src="${pageContext.request.contextPath}/bower_components/adminLTE/dist/js/adminlte.js"></script>
    <!-- AdminLTE for demo purposes -->
    <script src="${pageContext.request.contextPath}/bower_components/adminLTE/dist/js/demo.js"></script>
    
     <jsp:invoke fragment="footer"/>
</body>
</html>