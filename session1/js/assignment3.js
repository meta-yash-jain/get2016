$(document).ready(question1);
$(document).ready(question2);
$(document).ready(question3);
$(document).ready(question4);
$(document).ready(question5);
$(document).ready(question6);
$(document).ready(question7);
$(document).ready(question8);
$(document).ready(question9);
$(document).ready(question10);

function question1(){
    $('#btn1').click(function () {
        $(".message").css("color", "red");
    });
}

function question2(){
    $('#btn2').click(function () {
        $("div.box:first").css("background", "rgba(73, 188, 13, 1)");
    });
}
function question3(){
    $('#btn3').click(function () {
        $(":button").css("color", "red");
    });
}
function question4(){
    $('#btn4').click(function () {
        $("img[alt='hello']").css("color", "red");
    });
}

function question5(){
    $('#btn5').click(function () {
        $("#myDiv").find("input[type='text']").css("border", "red solid 1px");
    });
}

function question6(){
    $('#btn6').click(function () {
        $( "input[name^='txt']" ).css("border", "red solid 1px");
    });
}

function question7(){
    $('#btn7').click(function () {
        $( "p:not('.box')" ).css("border", "red solid 1px");
    });
}

function question8(){
    $('#btn8').click(function () {
        $( ".box , .error" ).css("background", "rgba(188, 43, 45, 1)");
    });
}

function question9(){
    $('#btn9').click(function () {
        $( ".box.error" ).css("background", "rgba(100, 34, 54, 1)");
    });
}

function question10(){
    $('#btn10').click(function () {
        $( "div#myDiv span.info " ).css("color", "red");
    });
}