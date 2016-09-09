
$(document).ready(init);

function init() {
    $('#employeeName').change(getDetails);
}

function getDetails() {
    $.getJSON('json/employeeDetail.json',function(data) {
        display(data);
    });
}

function display(data) {
    $('table').css("display", "block");
    switch($('#employeeName').val()) {
        case "abcd" :
            $('#name').text(data.abcd.name);
            $('#email').text(data.abcd.email);
            $('#dob').text(data.abcd.dob);
            $('#address').text(data.abcd.address);
            break;
        case "lmno" :
            $('#name').text(data.lmno.name);
            $('#email').text(data.lmno.email);
            $('#dob').text(data.lmno.dob);
            $('#address').text(data.lmno.address);
            break;
        case "xyz" :
            $('#name').text(data.xyz.name);
            $('#email').text(data.xyz.email);
            $('#dob').text(data.xyz.dob);
            $('#address').text(data.xyz.address);
            break;
        default :
            $('table').css("display", "none");
            $('.error').css({
                'display': 'block',
                'text': 'Please select a employee name'
            });
    }
}