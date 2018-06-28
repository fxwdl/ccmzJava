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
      	<script src="${pageContext.request.contextPath}/bower_components/axios/dist/axios.js"></script>
      	<script src="${pageContext.request.contextPath}/my_app/myApp.js"></script>
      	<script type="text/javascript">
      		
	        $(function () {
	            $('.input-group.date').datepicker({
	                format: "yyyy/mm/dd",
	                clearBtn: true,
	                language: "zh-CN",
	                autoclose: true,
	                todayHighlight: true
	            });
	
	            $('.form-control.numberic').inputmask('numeric', {
	                groupSeparator: '',
	                autoGroup: true,
	                digits: 2,
	                digitsOptional: false,
	                prefix: '',
	                placeholder: '0'
	            });
	            //$('#ds_ylzfy').inputmask('0.00', { reverse: true });
	
	            $(".modal").on("hidden", function () {
	                $(this).removeData('modal');
	            });
	        });      	
      		var vm=new Vue({
      			el:'#app',
      			data:{
                    d:{
	                    ID: '', Apply_Hospital_ID: '', Reim_NO: '', Sfzh: '', Medicare_State: 1, Person_Code: '', Reim_Source: 2, TreatmentHosptial_Code: '', TreatmentHosptial: '',
	                    Treatment_NO: '', Reim_Type_ID: 15, In_Date: '', Out_Date: '', Medicare_Date: '', TypeIn_Date: '', Medicare_Line: 0, StdDisease_Code: '', StdDisease_Name: '',
	                    ZL_Money: 0, ZF_Money: 0, YLZ_Money: 0, GR_Money: 0, YBBX_Money: 0, XNH_Money: 0, Family_Code: '', Apply_Date: '', DBBX_Money: 0, Card_NO: '', Finish_Flag: 0,
	                    SfLb: '', JGBM: '', PrintCount: 0, Operator_ID: '', Create_Time: '', Pay_Operator_ID: '', Finish_Date: '', SelfBaseMoney: 0, YLJZ_Money: '', Cancel_Date: '', Cancel_Operator_ID: '',
	                    YBHG_Money: '', SelfBaseMoney_Total: '', YLJZ_Money_Total: '', Spec_BN: 0, CYDBBC_Money: 0, IdentityType_ID: '', SelBaseMoney_ZY_Total: 0, GR_Accout_Pay: 0, YB_Other_Pay: 0,
	                    Name: '', Ry_Zt: '', Operator_Name: '', Pay_Operator_Name: '', Cancel_Operator_Name: '', IdentityType_Name: '', Apply_Hospital_Name: ''
                    },
                    errArray:[],
                    ReimSourceList:[{ id: 1, name: '本院' }, { id: 2, name: '外转' }],
                    ReimTypeList : [{ id: 15, name: '大病门诊' }, { id: 21, name: '住院' }, { id: 99, name: '特殊疾病' }],
                    SpecBNList : [{ id: 0, name: '无' }, { id: 1, name: '单次单报' }, { id: 2, name: '未参加基本医疗保险' }, { id: 3, name: '单病种定额付费/低自付大病补助' }, { id: 4, name: '医疗费用包干' }, { id: 5, name: '按床日付费' }]
      			},
      			computed:{
      				calFinishiFlag:function(){
      		            var r = { css: '', str: '' };
      		            switch (this.d.Finish_Flag) {
      		                case 0:
      		                    r.str = '未报销';
      		                    r.css = 'label bg-blue';
      		                    break;
      		                case 1:
      		                    r.str = '已报销';
      		                    r.css = 'label bg-green';
      		                    break;
      		                case 2:
      		                    r.str = '已作废';
      		                    r.css = 'label bg-red';
      		                    break;
      		                default:
      		                    break;
      		            }
      		            return r; 
      				}
      			},
      			methods:{
      				hideError:function($event){
      					this.errArray=new Array();      					
      				},
      				loadPerson:function($event){
      					axios.get("${pageContext.request.contextPath}/DictFamilyMember/GetData/" + this.d.Sfzh).
                        then(
                        function (r) {
                            if (r.data === "") {
                                $.showErr('此人未录入到系统中')
                                vm.reset();
                            }
                            else {
                            	vm.d.Name = r.data.name;
                            	vm.d.SfLb = r.data.sfLb;
                            	vm.d.Family_Code = r.data.ry_Jtbh;
                                vm.d.Ry_Zt = r.data.ry_Zt;
                                $('#ds_bxlx').focus();
                            }
                        }, function (r) {
                            $.showErr('获取信息发生错误');
                        });
      				},
      				reimSourceChange:function($event){
      					alert(this.d.Reim_Source);
      				},
      				selDisease($event){      					
      		            if (this.d.Finish_Flag > 0) {
      		                return;
      		            }
      		            var p = {
      		                  rt_id: this.d.Reim_Type_ID,
      		                  callback: function (row) {
  		                          vm.d.StdDisease_Code = row.code;
  		                          vm.d.StdDisease_Name = row.name;
      		                  }
      		              };
      		              $.myApp.showSelDisease(p);      		            
      				},
      				doSubmit($event){
      					alert('submit');
      				},
      				reset($event){
      					alert('reset');
      				}
      			}
      		});
      	</script>
    </jsp:attribute>
    
    <jsp:body>
		<div class="row">		
		    <!-- right column -->
		    <div class="col-md-12" id="app">
		        <!-- Horizontal Form -->
		        <div class="box box-info" style="margin-bottom:-15px;">
		            <div class="box-header with-border" style="text-align:center">
		                <span style="font-size:x-large">长春市城镇医疗救助</span>
		                <small v-cloak :class="calFinishiFlag.css">{{calFinishiFlag.str}}</small>		
		            </div>
		            <div id="divError" v-cloak class="alert alert-danger" role="alert" v-if="errArray.length">
		                <a class="close" data-dismiss="alert" v-on:click.stop="hideError($event)">×</a>		                
		                <p v-for="s in errArray">{{s}}</p>
		            </div>
		
		            <!-- /.box-header -->
		            <!-- form start -->
					<form class="form-horizontal" novalidate role="form" name="myForm" id="myForm">
		                <div class="box-body" style="padding-bottom:0px;">
		                    <div class="form-group">
		                        <label class="col-sm-1 control-label myLabel" for="ds_sfzh">身份证号：</label>
		                        <div class="col-sm-2 myForm">
		                            <input v-cloak class="form-control" required id="ds_sfzh" name="ds_sfzh" type="text" placeholder="" :disabled="d.Finish_Flag>0" v-model="d.Sfzh" v-on:keyup.enter="loadPerson($event)" />
		                        </div>
		
		                        <label class="col-sm-1 control-label myLabel" for="ds_name">姓名：</label>
		                        <div class="col-sm-2 myForm">
		                            <label v-cloak class="form-control displayOnly" name="ds_name">{{d.Name}}</label>
		                        </div>
		                        <label class="col-sm-1 control-label myLabel" for="ds_sflb">身份类别：</label>
		                        <div class="col-sm-2 myForm">
		                            <label v-cloak class="form-control displayOnly" name="ds_sflb">{{d.SfLb}}</label>
		                        </div>
		                        <label class="col-sm-1 control-label myLabel" for="ds_ryzt">人员状态：</label>
		                        <div class="col-sm-2 myForm">
		                            <label v-cloak class="form-control displayOnly" name="ds_ryzt">{{d.Ry_Zt}}</label>
		                        </div>
		                    </div>
		
		                    <div class="form-group">
		                        <label class="col-sm-1 control-label myLabel" for="ds_bxlx">报销类型：</label>
		                        <div class="col-sm-2 myForm">
		                            <select v-cloak v-enter2tab id="ds_bxlx" name="ds_bxlx" class="form-control" :disabled="d.Finish_Flag>0" v-model="d.Reim_Source" v-on:change="reimSourceChange($event)">
		                            	<option v-for="item in ReimSourceList" :value="item.id">{{item.name}}</option>
		                            </select>
		                        </div>
		                        <label class="col-sm-1 control-label myLabel" for="ds_djh">单据号：</label>
		                        <div class="col-sm-2 myForm">
		                            <input v-cloak v-enter2tab class="form-control" required name="ds_djh" type="text" placeholder="" :disabled="d.Finish_Flag>0" v-model="d.BillNO" />
		                        </div>
		
		                        <label class="col-sm-1 control-label myLabel" for="ds_jzyy">就诊医院：</label>
		                        <div class="col-sm-2 myForm">
		                            <input v-cloak v-enter2tab class="form-control" required name="ds_jzyy" type="text" placeholder="" :disabled="d.Finish_Flag>0" v-model="d.TreatmentHosptial" />
		                        </div>
		
		                        <label class="col-sm-1 control-label myLabel" for="ds_yllb">医疗类别：</label>
		                        <div class="col-sm-2 myForm">
		                            <select v-cloak v-enter2tab name="ds_yllb" class="form-control" :disabled="d.Finish_Flag>0" v-model="d.Reim_Type_ID">
		                            	<option v-for="item in ReimTypeList" :value="item.id">{{item.name}}</option>
		                            </select>
		                        </div>
		                    </div>
		
		                    <div class="form-group">
		                        <label class="col-sm-1 control-label myLabel" for="ds_rysj">入院时间：</label>
		                        <div class="col-sm-2 myForm">
		                            <div class="input-group date">
		                                <input v-cloak v-enter2tab type="text" required class="form-control" name="ds_rysj" :disabled="d.Finish_Flag>0" v-model="d.In_Date">
		                                <span class="input-group-addon"><i class="fa fa-calendar"></i></span>
		                            </div>
		                        </div>
		
		                        <label class="col-sm-1 control-label myLabel" for="ds_cysj">出院时间：</label>
		                        <div class="col-sm-2 myForm">
		                            <div class="input-group date">
		                                <input v-cloak v-enter2tab type="text" required class="form-control" name="ds_cysj" :disabled="d.Finish_Flag>0" v-model="d.Out_Date">
		                                <span class="input-group-addon"><i class="fa fa-calendar"></i></span>
		                            </div>
		                        </div>
		
		                        <label class="col-sm-1 control-label myLabel" for="ds_jsrq">结算日期：</label>
		                        <div class="col-sm-2 myForm">
		                            <div class="input-group date">
		                                <input v-cloak v-enter2tab type="text" required class="form-control" name="ds_jsrq" :disabled="d.Finish_Flag>0" v-model="d.Medicare_Date">
		                                <span class="input-group-addon"><i class="fa fa-calendar"></i></span>
		                            </div>
		                        </div>
		
		                        <label class="col-sm-1 control-label myLabel" for="ds_lrrq">录入日期：</label>
		                        <div class="col-sm-2 myForm">
		                            <div class="input-group date">
		                                <input v-cloak v-enter2tab type="text" required class="form-control" name="ds_lrrq" :disabled="d.Finish_Flag>0" v-model="d.TypeIn_Date">
		                                <span class="input-group-addon"><i class="fa fa-calendar"></i></span>
		                            </div>
		                        </div>
		                    </div>
		
		                    <div class="form-group">
		                        <label class="col-sm-1 control-label myLabel" for="ds_ylbzh">医疗保障号：</label>
		                        <div class="col-sm-2 myForm">
		                            <input v-cloak v-enter2tab class="form-control" name="ds_ylbzh" type="text" placeholder="" :disabled="d.Finish_Flag>0" v-model="d.Card_NO" />
		                        </div>
		
		                        <label class="col-sm-1 control-label myLabel" for="ds_jbdm">疾病代码：</label>
		                        <div class="col-sm-2 myForm">
		                            <div class="input-group">
		                                <input v-cloak v-enter2tab type="text" readonly="readonly" class="form-control" name="ds_jbdm" :disabled="d.Finish_Flag>0" v-model="d.StdDisease_Code">
		                                <span class="input-group-addon"><i class="glyphicon glyphicon-search" v-on:click="selDisease()"></i></span>
		                            </div>
		                        </div>
		
		                        <label class="col-sm-1 control-label myLabel" for="ds_jbmc">疾病名称：</label>
		                        <div class="col-sm-2 myForm">
		                            <input v-cloak v-enter2tab class="form-control" required name="ds_jbmc" type="text" placeholder="" :disabled="d.Finish_Flag>0" v-model="d.StdDisease_Name" />
		                        </div>
		
		                        <label class="col-sm-1 control-label myLabel" for="ds_jtbm">家庭编码：</label>
		                        <div class="col-sm-2 myForm">
		                            <input v-cloak v-enter2tab class="form-control" name="ds_jtbm" type="text" placeholder="" :disabled="d.Finish_Flag>0" v-model="d.Family_Code" />
		                        </div>
		                    </div>
		
		                    <div class="form-group">
		                        <label class="col-sm-1 control-label myLabel" for="ds_ylzfy">医疗总费用：</label>
		                        <div class="col-sm-2 myForm">
		                            <input v-cloak v-enter2tab type="number" min="0" step="0.01" required class="form-control numberic" name="ds_ylzfy" placeholder="" :disabled="d.Finish_Flag>0" v-model="d.YLZ_Money" />
		                        </div>
		
		                        <label class="col-sm-1 control-label myLabel" for="ds_zlfy">自理费用：</label>
		                        <div class="col-sm-2 myForm">
		                            <input v-cloak v-enter2tab class="form-control numberic" required step="0.01" name="ds_zlfy" type="number" placeholder="" :disabled="d.Finish_Flag>0" v-model="d.ZL_Money" />
		                        </div>
		
		                        <label class="col-sm-1 control-label myLabel" for="ds_zfje">自费金额：</label>
		                        <div class="col-sm-2 myForm">
		                            <input v-cloak v-enter2tab required class="form-control numberic" step="0.01" name="ds_zfje" type="number" placeholder="" :disabled="d.Finish_Flag>0" v-model="d.ZF_Money" />
		                        </div>
		
		                        <label class="col-sm-1 control-label myLabel" for="ds_qfx">起付线：</label>
		                        <div class="col-sm-2 myForm">
		                            <input v-cloak v-enter2tab required class="form-control numberic" step="0.01" name="ds_qfx" type="number" placeholder="" :disabled="d.Finish_Flag>0" v-model="d.Medicare_Line" />
		                        </div>
		                    </div>
		
		                    <div class="form-group">
		                        <label class="col-sm-1 control-label myLabel" for="ds_dbbx">大病保险补偿金额：</label>
		                        <div class="col-sm-2 myForm">
		                            <input v-cloak v-enter2tab required type="number" min="0" step="0.01" class="form-control numberic" name="ds_dbbx" placeholder="" :disabled="d.Finish_Flag>0" v-model="d.DBBX_Money" />
		                        </div>
		
		                        <label class="col-sm-1 control-label myLabel" for="ds_ybbx">医保(农合)报销：</label>
		                        <div class="col-sm-2 myForm">
		                            <input v-cloak v-enter2tab type="number" min="0" step="0.01" required class="form-control numberic" name="ds_ybbx" placeholder="" :disabled="d.Finish_Flag>0" v-model="d.YBBX_Money" />
		                        </div>
		
		                        <label class="col-sm-1 control-label myLabel" for="ds_xnhcybc">新农合参与补偿金额：</label>
		                        <div class="col-sm-2 myForm">
		                            <input v-cloak v-enter2tab required class="form-control numberic" step="0.01" name="ds_xnhcybc" type="number" placeholder="" :disabled="d.Finish_Flag>0" v-model="d.XNH_Money" />
		                        </div>
		
		                        <label class="col-sm-1 control-label myLabel" for="ds_xnhcydbbc">新农合参与大病补偿：</label>
		                        <div class="col-sm-2 myForm">
		                            <input v-cloak v-enter2tab required class="form-control numberic" step="0.01" name="ds_xnhcydbbc" type="number" placeholder="" :disabled="d.Finish_Flag>0" v-model="d.CYDBBC_Money" />
		                        </div>
		                    </div>
		
		                    <div class="form-group">
		                        <label class="col-sm-1 control-label myLabel" for="ds_grzhzf">个人账户支付：</label>
		                        <div class="col-sm-2 myForm">
		                            <input v-cloak v-enter2tab type="number" min="0" step="0.01" required class="form-control numberic" name="ds_grzhzf" placeholder="" :disabled="d.Finish_Flag>0" v-model="d.GR_Accout_Pay" />
		                        </div>
		
		                        <label class="col-sm-1 control-label myLabel" for="ds_ybqtzf">医保其它支付：</label>
		                        <div class="col-sm-2 myForm">
		                            <input v-cloak v-enter2tab required type="number" min="0" step="0.01" required class="form-control numberic" name="ds_ybqtzf" placeholder="" :disabled="d.Finish_Flag>0" v-model="d.YB_Other_Pay" />
		                        </div>
		
		                        <label class="col-sm-1 control-label myLabel" for="ds_grcd">个人承担：</label>
		                        <div class="col-sm-2 myForm">
		                            <input v-cloak v-enter2tab required class="form-control numberic" step="0.01" name="ds_grcd" type="number" placeholder="" :disabled="d.Finish_Flag>0" v-model="d.GR_Money" />
		                        </div>
		
		                        <label class="col-sm-1 control-label myLabel" for="ds_tsqk">特殊情况：</label>
		                        <div class="col-sm-2 myForm">
		                            <select v-cloak v-enter2tab name="ds_tsqk" class="form-control" :disabled="d.Finish_Flag>0" v-model="d.Spec_BN">
		                            	<option v-for="item in SpecBNList" :value="item.id">{{item.name}}</option>
		                            </select>
		                        </div>
		                    </div>
		
		                    <div class="form-group">
		                        <label class="col-sm-1 control-label myLabel" for="ds_bxsj">报销时间：</label>
		                        <div class="col-sm-2 myForm">
		                            <div class="input-group date">
		                                <input v-cloak v-enter2tab type="text" class="form-control" name="ds_bxsj" :disabled="d.Finish_Flag>0" v-model="d.Apply_Date">
		                                <span class="input-group-addon"><i class="fa fa-calendar"></i></span>
		                            </div>
		                        </div>
		                    </div>
		
		                    <div class="form-group">
		                        <label class="col-sm-1 control-label myLabel">录入操作员：</label>
		                        <div class="col-sm-2 myForm">
		                            <label v-cloak  class="form-control displayOnly" name="ds_lrczy">{{d.Operator_Name}}</label>
		                        </div>
		                        <label class="col-sm-1 control-label myLabel">创建时间：</label>
		                        <div class="col-sm-2 myForm">
		                            <label v-cloak class="form-control displayOnly" name="ds_cjsj">{{d.Create_Time}}</label>
		                        </div>
		                        <label class="col-sm-1 control-label myLabel">报销操作员：</label>
		                        <div class="col-sm-2 myForm">
		                            <label v-cloak class="form-control displayOnly" name="ds_bxczy">{{d.Pay_Operator_Name}}</label>
		                        </div>
		                        <label class="col-sm-1 control-label myLabel">报销时间：</label>
		                        <div class="col-sm-2 myForm">
		                            <label v-cloak class="form-control displayOnly" name="ds_bxsj">{{d.Finish_Date}}</label>
		                        </div>
		                    </div>
		
		                    <div class="form-group">
		                        <label class="col-sm-1 control-label myLabel">报销基数：</label>
		                        <div class="col-sm-2 myForm">
		                            <label v-cloak class="form-control displayOnly" name="ds_bxjs">{{d.SelfBaseMoney}}</label>
		                        </div>
		                        <label class="col-sm-1 control-label myLabel">救助金额：</label>
		                        <div class="col-sm-2 myForm">
		                            <label v-cloak class="form-control displayOnly" name="ds_jzje">{{d.YLJZ_Money}}</label>
		                        </div>
		                        <label class="col-sm-1 control-label myLabel">作废操作员：</label>
		                        <div class="col-sm-2 myForm">
		                            <label v-cloak class="form-control displayOnly" name="ds_zfczy">{{d.Cancel_Operator_Name}}</label>
		                        </div>
		                        <label class="col-sm-1 control-label myLabel">作废日期：</label>
		                        <div class="col-sm-2 myForm">
		                            <label v-cloak class="form-control displayOnly" name="ds_zfrq">{{d.Cancel_Date}}</label>
		                        </div>
		                    </div>
		
		                </div>
		                <!-- /.box-body -->
		                <div class="box-footer text-center">
		                    <button type="button" class="btn btn-info" v-on:click="doSubmit()" :disabled="!(d.Finish_Flag==0)">提交</button>
		                    <button type="button" class="btn btn-default" v-on:click="reset()" :disabled="!(d.Finish_Flag==0)">重置</button>
		                    <button type="button" class="btn btn-success" :disabled="!(d.Finish_Flag==0 && d.ID!='')">报销</button>
		                    <button type="button" class="btn bg-purple" :disabled="!(d.Finish_Flag==1)">打印凭证</button>
		                    <button type="button" class="btn btn-danger" :disabled="!(d.Finish_Flag==1)">作废</button>
		                </div>
		                <!-- /.box-footer -->
		            </form>		            
		        </div>
		
		    </div>
		    <!--/.col (right) -->
		</div>
    </jsp:body>   
</t:layoutpage>

