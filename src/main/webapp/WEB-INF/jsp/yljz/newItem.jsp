<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>	
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>


<t:layoutpage title="长春市医疗救助管理系统" module="医疗救助" functionName="域外患者报销" smallTitle="">
    <jsp:attribute name="header">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/bower_components/bootstrap-datepicker/dist/css/bootstrap-datepicker3.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/bower_components/bootstrap-table/dist/bootstrap-table.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/bower_components/bootstrap-dialog/dist/css/bootstrap-dialog.css">
	    <style type="text/css">
	        .myLabel {
	            font-weight: 400;
	            padding-left: 0px;
	            padding-right: 0px;
	        }
	
	        .myForm {
	            padding-left: 0px;
	            padding-right: 10px;
	        }
	
	        .form-group {
	            margin-bottom: 3px;
	        }
	
	        .input-group-addon {
	            cursor: pointer;
	        }
	
	        .displayOnly {
	            border: 0px;
	        }
	
	        .modal-body {
	            padding: 0px;
	        }
	
	        label {
	            font-weight: normal;
	        }
	    </style>		
    </jsp:attribute>
    <jsp:attribute name="footer">
	    <script src="${pageContext.request.contextPath}/bower_components/bootstrap-datepicker/dist/js/bootstrap-datepicker.js"></script>
	    <script src="${pageContext.request.contextPath}/bower_components/bootstrap-datepicker/dist/locales/bootstrap-datepicker.zh-CN.min.js"></script>

	    <script src="${pageContext.request.contextPath}/bower_components/inputmask/dist/jquery.inputmask.bundle.js"></script>
	
	    <script src="${pageContext.request.contextPath}/bower_components/bootstrap-table/dist/bootstrap-table.js"></script>
	    <script src="${pageContext.request.contextPath}/bower_components/bootstrap-table/dist/locale/bootstrap-table-zh-CN.js"></script>
	
		<script src="${pageContext.request.contextPath}/bower_components/bootstrap-dialog/dist/js/bootstrap-dialog.js"></script>
		<script src="${pageContext.request.contextPath}/my_app/bootstrap-dialog-zh-CN.js"></script>
		<script src="${pageContext.request.contextPath}/my_app/bootstrap-dialog-Ext.js"></script>
        
      	<script src="${pageContext.request.contextPath}/bower_components/vue/dist/vue.js"></script>
      	<script type="text/javascript">
      		var vm=new Vue({
      			el:'#row',
      			data:{
      				text:'Welcome!!!'
      			}
      		});
      	</script>
    </jsp:attribute>
    
    <jsp:body>
		<div class="row" id="row">
			{{text}} 
		</div>
    </jsp:body>   
</t:layoutpage>

