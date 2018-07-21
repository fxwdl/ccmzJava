<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>	
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>


<t:layoutpage title="长春市医疗救助管理系统" module="首页" functionName="首页" smallTitle="">
    <jsp:attribute name="header">
      
    </jsp:attribute>
    <jsp:attribute name="footer">

    </jsp:attribute>
    
    <jsp:body>
      <div class="error-page">
        <h2 class="headline text-green">OK</h2>

        <div class="error-content">
          <h3><i class="fa fa-warning text-green"></i> 操作成功.</h3>

          <p>
            点击链接返回首页 <a href="${pageContext.request.contextPath}/">返回首页</a> 
          </p>

        </div>
      </div>

    </jsp:body>   
</t:layoutpage>

