$(document).ready(function(){
    $('#start, #right').click(function () {
        $("#box").animate({left: '+=250px'},3000,'linear');
    });

    $('#stop').click(function () {
        $("#box").stop();
    });

    $('#back , #left').click(function () {
        $("#box").animate({left: '-=250px'},3000,'linear');
    });

    $('#top').click(function () {
        $("#box").animate({top: '-=250px'},3000,'linear');
    });

    $('#bottom').click(function () {
        $("#box").animate({top: '+=250px'},3000,'linear');
    });

});
