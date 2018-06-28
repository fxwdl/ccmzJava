'use strict';
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
            if (index > -1 && (index + 1) < fields.length)
                fields.eq(index + 1).focus();
        }
    });	
});