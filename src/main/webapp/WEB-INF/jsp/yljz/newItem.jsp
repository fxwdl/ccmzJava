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
      	<script src="${pageContext.request.contextPath}/bower_components/es6-promise/es6-promise.min.js"></script>
      	<script src="${pageContext.request.contextPath}/bower_components/es6-promise/es6-promise.auto.min.js"></script>
      	<script src="${pageContext.request.contextPath}/bower_components/axios/dist/axios.js"></script>
      	<!-- <script src="${pageContext.request.contextPath}/bower_components/q/q.js"></script> -->
      	
      	<script src="${pageContext.request.contextPath}/bower_components/vuelidate/dist/vuelidate.min.js"></script>
      	<script src="${pageContext.request.contextPath}/bower_components/vuelidate/dist/validators.min.js"></script>
      	
      	<script src="${pageContext.request.contextPath}/my_app/MyCommon.js"></script>
      	<script src="${pageContext.request.contextPath}/my_app/myApp.js"></script>
      	
      	<script type="text/javascript">
      		
	        $(function () {
	
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
	        Vue.use(window.vuelidate.default);
      		var vm=new Vue({
      			el:'#app',
      			data:{
                    d:[],
                    errArray:[],
                    ReimSourceList:Bn_TreatmentReimburse.ReimSourceList,
                    ReimTypeList : Bn_TreatmentReimburse.ReimTypeList,
                    SpecBNList : Bn_TreatmentReimburse.SpecBNList,
                    status:'提交'
      			},
      			created:function(){

      			},
      			mounted:function(){
      				var cfg={
        	                format: "yyyy/mm/dd",
        	                clearBtn: true,
        	                language: "zh-CN",
        	                autoclose: true,
        	                todayHighlight: true
        	            };
    	            $('#div_rysj').datepicker(cfg).on("changeDate", function() {vm.d.in_Date = $('#ds_rysj').val();});
    	            $('#div_cysj').datepicker(cfg).on("changeDate", function() {vm.d.out_Date = $('#ds_cysj').val();});
    	            $('#div_jsrq').datepicker(cfg).on("changeDate", function() {vm.d.medicare_Date = $('#ds_jsrq').val();});
    	            $('#div_lrrq').datepicker(cfg).on("changeDate", function() {vm.d.typeIn_Date = $('#ds_lrrq').val();});
    	            $('#div_bxsj').datepicker(cfg).on("changeDate", function() {vm.d.apply_Date = $('#ds_bxsj').val();});
      			},      			
      			computed:{
      				calFinishiFlag:function(){
      		            var r = { css: '', str: '' };
      		            switch (this.d.finish_Flag) {
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
				validations: {
					  d:{
					  	sfzh: {
						  	required:validators.required,
						    minLength: validators.minLength(18)
						},
						billNO:{
							required:validators.required
						},
						treatmentHosptial:{
							required:validators.required
						},
						in_Date:{
							required:validators.required
						},
						out_Date:{
							required:validators.required
						},
						medicare_Date:{
							required:validators.required
						},
						typeIn_Date:{
							required:validators.required
						},		
						stdDisease_Name:{
							required:validators.required
						},			
						stdDisease_Code:{
							required:function(value,$params){
								if((value===null || value==='') && !($params.reim_Type_ID===21)){
									return false;
								}
								else{
									return true;
								}
							}
						},
						ylz_Money:{
							required:validators.required
						},	
						zl_Money:{
							required:validators.required
						},	
						zf_Money:{
							required:validators.required
						},	
						medicare_Line:{
							required:validators.required
						},
						dbbx_Money:{
							required:validators.required
						},
						ybbx_Money:{
							required:validators.required
						},
						xnh_Money:{
							required:validators.required
						},
						cydbbc_Money:{
							required:validators.required
						},
						gr_Accout_Pay:{
							required:validators.required
						},
						yb_Other_Pay:{
							required:validators.required
						},	
						gr_Money:{
							required:validators.required
						}				
					  }
				},      			
      			methods:{
      				hideError:function(e){
      					this.errArray=new Array();      					
      				},
      				loadPerson:function(e){
      					axios.get("${pageContext.request.contextPath}/DictFamilyMember/GetData/" + this.d.sfzh).
                        then(
                        function (r) {
                            if (r.data === "") {
                                $.showErr('此人未录入到系统中')
                                vm.reset();
                            }
                            else {
                            	vm.d.name = r.data.name;
                            	vm.d.sfLb = r.data.sfLb;
                            	vm.d.family_Code = r.data.ry_Jtbh;
                                vm.d.ry_Zt = r.data.ry_Zt;
                                $('#ds_bxlx').focus();
                            }
                        }, function (r) {
                            $.showErr('获取信息发生错误');
                        });
      				},
      				reimSourceChange:function(e){
      		            if (vm.d.reim_Source == 2) {
      		                vm.d.treatmentHosptial_Code = '';
      		                vm.d.treatmentHosptial = '';
      		            }
      		            else {
      		            	var def=UserService.getCurUser();
      		            	/*
      		            	//这种使用then的方式也是可以的
      		                def.then(function (u) {
      		                    vm.d.treatmentHosptial_Code = u.dictHospital.code;
      		                    vm.d.treatmentHosptial = u.dictHospital.name;
      		                }, function (reson) {
      		                    $.showErr(reson);
      		                });
      		            	*/
							def.done(function (u) {
      		                    vm.d.treatmentHosptial_Code = u.dictHospital.code;
      		                    vm.d.treatmentHosptial = u.dictHospital.name;
      		                })
							.fail(function (reson) {
      		                    $.showErr(reson);
      		                });
      		            }
      				},
      				selDisease:function(e){      					
      		            if (this.d.finish_Flag > 0) {
      		                return;
      		            }
      		            var p = {
      		                  rt_id: this.d.reim_Type_ID,
      		                  callback: function (row) {
  		                          vm.d.stdDisease_Code = row.code;
  		                          vm.d.stdDisease_Name = row.name;
      		                  }
      		              };
      		              $.myApp.showSelDisease(p);      		            
      				},
      				checkForm:function(e){
      					this.$v.d.$touch();
      					this.errArray=[];
      					if(this.$v.$anyError){
      						if(!this.$v.d.sfzh.required){
      							this.errArray.push('请输入身份证号');
      						}      						
      						if(!this.$v.d.sfzh.minLength){
      							this.errArray.push('身份证号必需'+this.$v.d.sfzh.$params.minLength.min+'位长');
      						}
      						if(!this.$v.d.billNO.required){
      							this.errArray.push('请输入单据号');
      						} 
      						if(!this.$v.d.treatmentHosptial.required){
      							this.errArray.push('请输入就诊医院');
      						}
      						if(!this.$v.d.in_Date.required){
      							this.errArray.push('请输入入院时间');
      						}     
      						if(!this.$v.d.out_Date.required){
      							this.errArray.push('请输入出院时间');
      						}
      						if(!this.$v.d.medicare_Date.required){
      							this.errArray.push('请输入结算日期');
      						}
      						if(!this.$v.d.typeIn_Date.required){
      							this.errArray.push('请输入录入日期');
      						}    
      						if(!this.$v.d.stdDisease_Code.required){
      							this.errArray.push('请选择疾病代码');
      						}  
      						if(!this.$v.d.stdDisease_Name.required){
      							this.errArray.push('请输入疾病名称');
      						}  
      						if(!this.$v.d.ylz_Money.required){
      							this.errArray.push('请输入医疗总费用');
      						}   
      						if(!this.$v.d.zl_Money.required){
      							this.errArray.push('请输入自理费用');
      						}  
      						if(!this.$v.d.zf_Money.required){
      							this.errArray.push('请输入自费费用');
      						}  
      						if(!this.$v.d.medicare_Line.required){
      							this.errArray.push('请输入起付线');
      						}
      						if(!this.$v.d.dbbx_Money.required){
      							this.errArray.push('请输入大病保险补偿金额');
      						}  
      						if(!this.$v.d.ybbx_Money.required){
      							this.errArray.push('请输入医保(农合)报销');
      						} 
      						if(!this.$v.d.xnh_Money.required){
      							this.errArray.push('请输入新农合参与补偿金额');
      						} 
      						if(!this.$v.d.cydbbc_Money.required){
      							this.errArray.push('请输入新农合参与大病补偿');
      						} 
      						if(!this.$v.d.gr_Accout_Pay.required){
      							this.errArray.push('请输入个人账户支付');
      						} 
      						if(!this.$v.d.yb_Other_Pay.required){
      							this.errArray.push('请输入医保其它支付');
      						}   
      						if(!this.$v.d.gr_Money.required){
      							this.errArray.push('请输入个人承担');
      						}      						
      					}      					
      				},
      				doSubmit:function(e){      					
      					this.checkForm(e);
      					if(this.errArray.length>0){
      						e.preventDefault();
      						return;
      					}
      					vm.status='正在提交';
          				Bn_TreatmentReimburse.save(vm.d)
                    	.done(function (data) {                    		
                    		vm.d = data;
                    		$.showSuccess('数据提交成功！');
                        })
                        .fail(function (msg) {
                            $.showErr(msg);
                        })
                        .always(function(){
          					vm.status='提交';
          				});	
      					e.preventDefault();
      				},
      				reset:function(e){
      					$('#ds_sfzh').focus(); 
          				Bn_TreatmentReimburse.load('${param.id}')
                        	.done(function (data) {
                        		vm.d = data;
                            })
                            .fail(function (msg) {
                                $.showErr(msg);
                            });						
      				}
      			}
      		});
      		
      		vm.reset();
      		//$watchAll是自定义的，参考：https://github.com/vuejs/vue/issues/844
      		//field是固定通过bind时传入的；newValue,oldVal是Vue进行正常回调时传入的参数。因为callback.bind实际返回的是一个包装器，所以可以实现这样的功能
      		//具体看文档https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Function/bind
      		vm.$watchAll(["d.ylz_Money", "d.ybbx_Money","d.dbbx_Money","d.gr_Accout_Pay","d.yb_Other_Pay"], function(field, newVal, oldVal){
      			//console.log(newVal+','+oldVal);
      			vm.d.gr_Money = vm.d.ylz_Money - vm.d.ybbx_Money - vm.d.dbbx_Money - vm.d.gr_Accout_Pay - vm.d.yb_Other_Pay;
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
		                            <input v-cloak class="form-control" required id="ds_sfzh" name="ds_sfzh" type="text" placeholder="" :disabled="d.finish_Flag>0" v-model="d.sfzh" v-on:keyup.enter="loadPerson($event)" />
		                        </div>
		
		                        <label class="col-sm-1 control-label myLabel" for="ds_name">姓名：</label>
		                        <div class="col-sm-2 myForm">
		                            <label v-cloak class="form-control displayOnly" name="ds_name">{{d.name}}</label>
		                        </div>
		                        <label class="col-sm-1 control-label myLabel" for="ds_sflb">身份类别：</label>
		                        <div class="col-sm-2 myForm">
		                            <label v-cloak class="form-control displayOnly" name="ds_sflb">{{d.sfLb}}</label>
		                        </div>
		                        <label class="col-sm-1 control-label myLabel" for="ds_ryzt">人员状态：</label>
		                        <div class="col-sm-2 myForm">
		                            <label v-cloak class="form-control displayOnly" name="ds_ryzt">{{d.ry_Zt}}</label>
		                        </div>
		                    </div>
		
		                    <div class="form-group">
		                        <label class="col-sm-1 control-label myLabel" for="ds_bxlx">报销类型：</label>
		                        <div class="col-sm-2 myForm">
		                            <select v-cloak v-enter2tab id="ds_bxlx" name="ds_bxlx" class="form-control" :disabled="d.finish_Flag>0" v-model="d.reim_Source" v-on:change="reimSourceChange($event)">
		                            	<option v-for="item in ReimSourceList" :value="item.id">{{item.name}}</option>
		                            </select>
		                        </div>
		                        <label class="col-sm-1 control-label myLabel" for="ds_djh">单据号：</label>
		                        <div class="col-sm-2 myForm">
		                            <input v-cloak v-enter2tab class="form-control" required name="ds_djh" type="text" placeholder="" :disabled="d.finish_Flag>0" v-model="d.billNO" />
		                        </div>
		
		                        <label class="col-sm-1 control-label myLabel" for="ds_jzyy">就诊医院：</label>
		                        <div class="col-sm-2 myForm">
		                            <input v-cloak v-enter2tab class="form-control" required name="ds_jzyy" type="text" placeholder="" :disabled="d.finish_Flag>0" v-model="d.treatmentHosptial" />
		                        </div>
		
		                        <label class="col-sm-1 control-label myLabel" for="ds_yllb">医疗类别：</label>
		                        <div class="col-sm-2 myForm">
		                            <select v-cloak v-enter2tab name="ds_yllb" class="form-control" :disabled="d.finish_Flag>0" v-model="d.reim_Type_ID">
		                            	<option v-for="item in ReimTypeList" :value="item.id">{{item.name}}</option>
		                            </select>
		                        </div>
		                    </div>
		
		                    <div class="form-group">
		                        <label class="col-sm-1 control-label myLabel" for="ds_rysj">入院时间：</label>
		                        <div class="col-sm-2 myForm">
		                            <div class="input-group date" id="div_rysj">
		                                <input v-cloak v-enter2tab type="text" required class="form-control" id="ds_rysj" name="ds_rysj" :disabled="d.finish_Flag>0" v-model="d.in_Date">
		                                <span class="input-group-addon"><i class="fa fa-calendar"></i></span>
		                            </div>
		                        </div>
		
		                        <label class="col-sm-1 control-label myLabel" for="ds_cysj">出院时间：</label>
		                        <div class="col-sm-2 myForm">
		                            <div class="input-group date" id="div_cysj">
		                                <input v-cloak v-enter2tab type="text" required class="form-control" id="ds_cysj" name="ds_cysj" :disabled="d.finish_Flag>0" v-model="d.out_Date">
		                                <span class="input-group-addon"><i class="fa fa-calendar"></i></span>
		                            </div>
		                        </div>
		
		                        <label class="col-sm-1 control-label myLabel" for="ds_jsrq">结算日期：</label>
		                        <div class="col-sm-2 myForm">
		                            <div class="input-group date" id="div_jsrq">
		                                <input v-cloak v-enter2tab type="text" required class="form-control" id="ds_jsrq" name="ds_jsrq" :disabled="d.finish_Flag>0" v-model="d.medicare_Date">
		                                <span class="input-group-addon"><i class="fa fa-calendar"></i></span>
		                            </div>
		                        </div>
		
		                        <label class="col-sm-1 control-label myLabel" for="ds_lrrq">录入日期：</label>
		                        <div class="col-sm-2 myForm">
		                            <div class="input-group date" id="div_lrrq">
		                                <input v-cloak v-enter2tab type="text" required class="form-control" id="ds_lrrq" name="ds_lrrq" :disabled="d.finish_Flag>0" v-model="d.typeIn_Date">
		                                <span class="input-group-addon"><i class="fa fa-calendar"></i></span>
		                            </div>
		                        </div>
		                    </div>
		
		                    <div class="form-group">
		                        <label class="col-sm-1 control-label myLabel" for="ds_ylbzh">医疗保障号：</label>
		                        <div class="col-sm-2 myForm">
		                            <input v-cloak v-enter2tab class="form-control" name="ds_ylbzh" type="text" placeholder="" :disabled="d.finish_Flag>0" v-model="d.card_NO" />
		                        </div>
		
		                        <label class="col-sm-1 control-label myLabel" for="ds_jbdm">疾病代码：</label>
		                        <div class="col-sm-2 myForm">
		                            <div class="input-group">
		                                <input v-cloak v-enter2tab type="text" readonly="readonly" class="form-control" name="ds_jbdm" :disabled="d.finish_Flag>0" v-model="d.stdDisease_Code">
		                                <span class="input-group-addon"><i class="glyphicon glyphicon-search" v-on:click="selDisease()"></i></span>
		                            </div>
		                        </div>
		
		                        <label class="col-sm-1 control-label myLabel" for="ds_jbmc">疾病名称：</label>
		                        <div class="col-sm-2 myForm">
		                            <input v-cloak v-enter2tab class="form-control" required name="ds_jbmc" type="text" placeholder="" :disabled="d.finish_Flag>0" v-model="d.stdDisease_Name" />
		                        </div>
		
		                        <label class="col-sm-1 control-label myLabel" for="ds_jtbm">家庭编码：</label>
		                        <div class="col-sm-2 myForm">
		                            <input v-cloak v-enter2tab class="form-control" name="ds_jtbm" type="text" placeholder="" :disabled="d.finish_Flag>0" v-model="d.family_Code" />
		                        </div>
		                    </div>
		
		                    <div class="form-group">
		                        <label class="col-sm-1 control-label myLabel" for="ds_ylzfy">医疗总费用：</label>
		                        <div class="col-sm-2 myForm">
		                            <input v-cloak v-enter2tab type="number" min="0" step="0.01" required class="form-control numberic" name="ds_ylzfy" placeholder="" :disabled="d.finish_Flag>0" v-model="d.ylz_Money" />
		                        </div>
		
		                        <label class="col-sm-1 control-label myLabel" for="ds_zlfy">自理费用：</label>
		                        <div class="col-sm-2 myForm">
		                            <input v-cloak v-enter2tab class="form-control numberic" required step="0.01" name="ds_zlfy" type="number" placeholder="" :disabled="d.finish_Flag>0" v-model="d.zl_Money" />
		                        </div>
		
		                        <label class="col-sm-1 control-label myLabel" for="ds_zfje">自费金额：</label>
		                        <div class="col-sm-2 myForm">
		                            <input v-cloak v-enter2tab required class="form-control numberic" step="0.01" name="ds_zfje" type="number" placeholder="" :disabled="d.finish_Flag>0" v-model="d.zf_Money" />
		                        </div>
		
		                        <label class="col-sm-1 control-label myLabel" for="ds_qfx">起付线：</label>
		                        <div class="col-sm-2 myForm">
		                            <input v-cloak v-enter2tab required class="form-control numberic" step="0.01" name="ds_qfx" type="number" placeholder="" :disabled="d.finish_Flag>0" v-model="d.medicare_Line" />
		                        </div>
		                    </div>
		
		                    <div class="form-group">
		                        <label class="col-sm-1 control-label myLabel" for="ds_dbbx">大病保险补偿金额：</label>
		                        <div class="col-sm-2 myForm">
		                            <input v-cloak v-enter2tab required type="number" min="0" step="0.01" class="form-control numberic" name="ds_dbbx" placeholder="" :disabled="d.finish_Flag>0" v-model="d.dbbx_Money" />
		                        </div>
		
		                        <label class="col-sm-1 control-label myLabel" for="ds_ybbx">医保(农合)报销：</label>
		                        <div class="col-sm-2 myForm">
		                            <input v-cloak v-enter2tab type="number" min="0" step="0.01" required class="form-control numberic" name="ds_ybbx" placeholder="" :disabled="d.finish_Flag>0" v-model="d.ybbx_Money" />
		                        </div>
		
		                        <label class="col-sm-1 control-label myLabel" for="ds_xnhcybc">新农合参与补偿金额：</label>
		                        <div class="col-sm-2 myForm">
		                            <input v-cloak v-enter2tab required class="form-control numberic" step="0.01" name="ds_xnhcybc" type="number" placeholder="" :disabled="d.finish_Flag>0" v-model="d.xnh_Money" />
		                        </div>
		
		                        <label class="col-sm-1 control-label myLabel" for="ds_xnhcydbbc">新农合参与大病补偿：</label>
		                        <div class="col-sm-2 myForm">
		                            <input v-cloak v-enter2tab required class="form-control numberic" step="0.01" name="ds_xnhcydbbc" type="number" placeholder="" :disabled="d.finish_Flag>0" v-model="d.cydbbc_Money" />
		                        </div>
		                    </div>
		
		                    <div class="form-group">
		                        <label class="col-sm-1 control-label myLabel" for="ds_grzhzf">个人账户支付：</label>
		                        <div class="col-sm-2 myForm">
		                            <input v-cloak v-enter2tab type="number" min="0" step="0.01" required class="form-control numberic" name="ds_grzhzf" placeholder="" :disabled="d.finish_Flag>0" v-model="d.gr_Accout_Pay" />
		                        </div>
		
		                        <label class="col-sm-1 control-label myLabel" for="ds_ybqtzf">医保其它支付：</label>
		                        <div class="col-sm-2 myForm">
		                            <input v-cloak v-enter2tab required type="number" min="0" step="0.01" required class="form-control numberic" name="ds_ybqtzf" placeholder="" :disabled="d.finish_Flag>0" v-model="d.yb_Other_Pay" />
		                        </div>
		
		                        <label class="col-sm-1 control-label myLabel" for="ds_grcd">个人承担：</label>
		                        <div class="col-sm-2 myForm">
		                            <input v-cloak v-enter2tab required class="form-control numberic" step="0.01" name="ds_grcd" type="number" placeholder="" :disabled="d.finish_Flag>0" v-model="d.gr_Money" />
		                        </div>
		
		                        <label class="col-sm-1 control-label myLabel" for="ds_tsqk">特殊情况：</label>
		                        <div class="col-sm-2 myForm">
		                            <select v-cloak v-enter2tab name="ds_tsqk" class="form-control" :disabled="d.finish_Flag>0" v-model="d.spec_BN">
		                            	<option v-for="item in SpecBNList" :value="item.id">{{item.name}}</option>
		                            </select>
		                        </div>
		                    </div>
		
		                    <div class="form-group">
		                        <label class="col-sm-1 control-label myLabel" for="ds_bxsj">报销时间：</label>
		                        <div class="col-sm-2 myForm">
		                            <div class="input-group date" id="div_bxsj">
		                                <input v-cloak v-enter2tab type="text" class="form-control" id="ds_bxsj" name="ds_bxsj" :disabled="d.finish_Flag>0" v-model="d.apply_Date">
		                                <span class="input-group-addon"><i class="fa fa-calendar"></i></span>
		                            </div>
		                        </div>
		                    </div>
		
		                    <div class="form-group">
		                        <label class="col-sm-1 control-label myLabel">录入操作员：</label>
		                        <div class="col-sm-2 myForm">
		                            <label v-cloak  class="form-control displayOnly" name="ds_lrczy">{{d.operator_Name}}</label>
		                        </div>
		                        <label class="col-sm-1 control-label myLabel">创建时间：</label>
		                        <div class="col-sm-2 myForm">
		                            <label v-cloak class="form-control displayOnly" name="ds_cjsj">{{d.create_Time}}</label>
		                        </div>
		                        <label class="col-sm-1 control-label myLabel">报销操作员：</label>
		                        <div class="col-sm-2 myForm">
		                            <label v-cloak class="form-control displayOnly" name="ds_bxczy">{{d.pay_Operator_Name}}</label>
		                        </div>
		                        <label class="col-sm-1 control-label myLabel">报销时间：</label>
		                        <div class="col-sm-2 myForm">
		                            <label v-cloak class="form-control displayOnly" name="ds_bxsj">{{d.finish_Date}}</label>
		                        </div>
		                    </div>
		
		                    <div class="form-group">
		                        <label class="col-sm-1 control-label myLabel">报销基数：</label>
		                        <div class="col-sm-2 myForm">
		                            <label v-cloak class="form-control displayOnly" name="ds_bxjs">{{d.selfBaseMoney}}</label>
		                        </div>
		                        <label class="col-sm-1 control-label myLabel">救助金额：</label>
		                        <div class="col-sm-2 myForm">
		                            <label v-cloak class="form-control displayOnly" name="ds_jzje">{{d.yljz_Money}}</label>
		                        </div>
		                        <label class="col-sm-1 control-label myLabel">作废操作员：</label>
		                        <div class="col-sm-2 myForm">
		                            <label v-cloak class="form-control displayOnly" name="ds_zfczy">{{d.cancel_Operator_Name}}</label>
		                        </div>
		                        <label class="col-sm-1 control-label myLabel">作废日期：</label>
		                        <div class="col-sm-2 myForm">
		                            <label v-cloak class="form-control displayOnly" name="ds_zfrq">{{d.cancel_Date}}</label>
		                        </div>
		                    </div>
		
		                </div>
		                <!-- /.box-body -->
		                <div class="box-footer text-center">
		                    <button v-cloak type="button" class="btn btn-info" v-on:click="doSubmit($event)" :disabled="!(d.finish_Flag==0) || status==='正在提交'">{{status}}</button>
		                    <button type="button" class="btn btn-default" v-on:click="reset($event)" :disabled="!(d.finish_Flag==0)">重置</button>
		                    <button type="button" class="btn btn-success" :disabled="!(d.finish_Flag==0 && d.ID!='' && d.ID!=null)">报销</button>
		                    <button type="button" class="btn bg-purple" :disabled="!(d.finish_Flag==1)">打印凭证</button>
		                    <button type="button" class="btn btn-danger" :disabled="!(d.finish_Flag==1)">作废</button>
		                </div>
		                <!-- /.box-footer -->
		            </form>		            
		        </div>
		
		    </div>
		    <!--/.col (right) -->
		</div>
    </jsp:body>   
</t:layoutpage>

