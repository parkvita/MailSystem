var main ={
    init : function(){
        var _this = this;
        $('#btn-send').on('click',function(){
            _this.send()
        });
    },
    send : function (){
        var data = {
            address: $('#address').val(),
            title: $('#title').val(),
            content: $('#content').val()
        };

        $.ajax({
            type: 'POST',
            url: '/mail',
            dataType:'text',
            contentType:'application/json; charset=utf-8',
            data:JSON.stringify(data)
        }).done(function(){
            alert('글이 등록 되었습니다.');
            window.location.href = '/';
        }).fail(function(error){
            alert(JSON.stringify(error));
        });
    }
}

main.init();