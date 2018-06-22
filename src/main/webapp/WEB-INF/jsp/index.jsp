<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>	
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>


<t:layoutpage title="长春市医疗救助管理系统" module="首页" functionName="首页" smallTitle="">
    <jsp:attribute name="header">
      
    </jsp:attribute>
    <jsp:attribute name="footer">
      	<script src="${pageContext.request.contextPath}/bower_components/vue/dist/vue.js"></script>
    </jsp:attribute>
    
    <jsp:body>
    	<h1>Welcome!!!!</h1>
    </jsp:body>   
</t:layoutpage>

