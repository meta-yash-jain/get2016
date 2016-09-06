$(document).ready(function(){
    $('#btn1').click(function () {

        if($('#btn1').val() == 'Hide'){
            $('#spn1').hide();
            $('#btn1').val('Show');
        }else{
            $('#spn1').show();
            $('#btn1').val('Hide');
        }
    });
});
