$(document).ready(function(){
    $("#name").change(fnShowName);
    $("#age").change(fnShowAge);
    $("#address").change(fnShowAddress);
});

function fnShowName() {
    var ans = $('#name').val();
    $('#result').append("Name : " + ans+"<br/>");
    $('#name').animate({backgroundColor: "red"}, 1000);
    $('#name').animate({backgroundColor: "white"}, 1000);
}

function fnShowAge() {
    var ans = $('#age').val();
    $('#result').append("Age : " +ans+"<br/>");
    $('#age').animate({backgroundColor: "red"}, 1000);
    $('#age').animate({backgroundColor: "white"}, 1000);
}

function fnShowAddress() {
    var ans = $('#address').val();
    $('#result').append("Address : " +ans+"<br/>");
    $('#address').animate({backgroundColor: "red"}, 1000);
    $('#address').animate({backgroundColor: "white"}, 1000);
}
