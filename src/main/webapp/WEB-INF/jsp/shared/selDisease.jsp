<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%
	String tblId=UUID.randomUUID().toString();
%>
<div class="box-body">
    <table id="<%=tblId %>"
           data-toggle="table" 
           data-cache="false" 
           data-pagination="true" 
           data-side-pagination="server"
           data-search="true" 
           data-search-on-enter-key="false" 
           data-show-refresh="true" 
           data-show-pagination-switch="true"
           data-id-field="Code" 
           data-click-to-select="true" 
           data-single-select="true" 
           data-striped="true" 
           data-sort-name="Code" 
           data-sort-order="asc" 
           data-show-columns="true"
           data-select-item-name="myRadioName"
           data-url="${pageContext.request.contextPath}/DictStdDisease/GetData" 
           data-query-params="queryParams" 
           >
        <thead>
            <tr>
                <th data-field="state" data-radio="true"></th>
                <th data-field="code" data-halign="center" data-align="left">代码</th>
                <th data-field="shortName" data-halign="center" data-align="left">简称</th>
                <th data-field="name" data-halign="center" data-align="left">名称</th>
            </tr>
        </thead>
    </table>
</div>

<script type="text/javascript">


    $('#<%=tblId %>').bootstrapTable();

    function queryParams(params) {

        var o = $.extend(params, { rt_id:  ${param.rt_id}});
        return o;
    }

    $('#<%=tblId %>').on('dbl-click-row.bs.table', function (e, row, $element) {
        var dialog=BootstrapDialog.getDialog('${param.dialogId}');
        if (dialog!=null){
            if(typeof dialog.getData('callback') === 'function') {
                dialog.getData('callback').call(this,row);
            }
            dialog.close();
        }
    });

</script>
