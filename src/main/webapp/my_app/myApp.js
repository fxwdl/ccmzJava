'use strict';
Vue.prototype.$watchAll = function(props, callback) {
	  props.forEach(prop => {
	    // Pass the prop as the first argument to our callback
		// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Function/bind
		// 这种用法可以固定传送prop到回调函数的参数上，上面的文档也说明了这是bind的一个用法之一
	    this.$watch(prop, callback.bind(null, prop));  
	  });
	};
	
$.myApp = {
    showSelDisease: function (params) {
        var dialogId = BootstrapDialog.newGuid();

        var showOpt = {
            id: dialogId,
            buttons: [{
                icon: 'glyphicon glyphicon-saved',
                label: '确定',
                cssClass: 'btn-primary',
                action: function (dialog) {
                    if (typeof dialog.getData('callback') === 'function') {
                        var tbl = $(dialog.getModalContent()).find('table[data-toggle="table"]');
                        var selArray = tbl.bootstrapTable('getSelections');
                        for (var row = 0; row < selArray.length; row++) {
                            dialog.getData('callback').call(this, selArray[row]);
                        }
                    }
                    dialog.close();
                }
            }, {
                icon: 'glyphicon glyphicon-ban-circle',
                label: '取消',
                action: function (dialog) {
                    dialog.close();
                }
            }],
            data: {
                'pageToLoad': ctx+'/DictStdDisease/SelDisease?rt_id=' + params.rt_id + '&dialogId=' + dialogId
            },
            message: function (dialog) {
                var $d = $('<div></div>');
                var page = dialog.getData('pageToLoad');
                $d.load(page);

                return $d;
            },
            title: '选择疾病代码',
            draggable: true,
            closeByBackdrop: true
        };
        var dialog = new BootstrapDialog(showOpt);
        if (params.callback != undefined && params.callback != null && typeof params.callback === 'function') {
            dialog.setData('callback', params.callback);
        }
        return dialog.open();
        //BootstrapDialog.show(showOpt);
    }
};

Vue.directive('enter2tab', function(el,binding){
    $(el).on("keydown keypress", function (event) {
        if (event.which === 13) {
            event.preventDefault();
            var fields = $(this).parents('form:eq(0),body').find('input, textarea, select');
            var index = fields.index(this);
            if (index > -1 && (index + 1) < fields.length){ 
            	fields.eq(index + 1).focus();
            	fields.eq(index + 1).select();
            }
                
        }
    });	
});

function Bn_TreatmentReimburse(){	
}

Bn_TreatmentReimburse.ReimSourceList=[{ id: 1, name: '本院' }, { id: 2, name: '外转' }];
Bn_TreatmentReimburse.ReimTypeList=[{ id: 15, name: '大病门诊' }, { id: 21, name: '住院' }, { id: 99, name: '特殊疾病' }];
Bn_TreatmentReimburse.SpecBNList=[{ id: 0, name: '无' }, { id: 1, name: '单次单报' }, { id: 2, name: '未参加基本医疗保险' }, { id: 3, name: '单病种定额付费/低自付大病补助' }, { id: 4, name: '医疗费用包干' }, { id: 5, name: '按床日付费' }];

Bn_TreatmentReimburse.load=function(id){
	var defererd = jQuery.Deferred();
    axios.get(ctx+'/YLJZ/GetTRItemById', {
        params: {
            id: id,
            _dt: new Date().getTime()
        }
    }).then(function (r) {
        if (r.data.success === true) {
            defererd.resolve(r.data.data);
        }
        else {
            defererd.reject(r.data.msg);
        }
    }), function (r) {
        defererd.notify('获取数据发生错误');
    };
    return defererd.promise();
}

Bn_TreatmentReimburse.save=function(data){
	var defererd = jQuery.Deferred();
	
    axios.post(ctx+'/YLJZ/SaveTRItem', data).then(
    	function (r) {
	        if (r.data.success === true) {
	            defererd.resolve(r.data.data);
	        }
	        else {
	            defererd.reject(r.data.msg);
	        }
    }), function (r) {
        defererd.notify('提交表单发生错误');
    };
    return defererd.promise();
}



function UserService(){	
}
UserService.getCurUser=function(){
	var defererd = jQuery.Deferred();
	//var deferred = Q.defer();
    axios.get(ctx+'/Account/GetCurUserInfo', {
        params: {
            _dt: new Date().getTime()
        }
    }).then(function (r) {
        if (r.data.success === true) {
            defererd.resolve(r.data.data);
        }
        else {
            defererd.reject(r.data.msg);
        }
    }), function (r) {
        defererd.notify('获取数据发生错误');
    };
    return defererd.promise();	
}
