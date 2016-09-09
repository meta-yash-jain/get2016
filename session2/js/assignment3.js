$(document).ready(function(){
    $('#start, #right').click(function () {
        $("#box").animate({left: '+=250px'},3000,'linear');
    });

    $('#right').click(function () {
        $("#box").animate({left: '+=50px'},3000,'linear');
    });

    $('#stop').click(function () {
        $("#box").stop();
    });

    $('#back , #left').click(function () {
        $("#box").animate({left: '-=250px'},3000,'linear');
    });

    $('#left').click(function () {
        $("#box").animate({left: '-=50px'},3000,'linear');
    });

    $('#top').click(function () {
        $("#box").animate({top: '-=50px'},3000,'linear');
    });

    $('#bottom').click(function () {
        $("#box").animate({top: '+=50px'},3000,'linear');
    });

});
