$(document).ready(init);

function init() {
    tooltipPosition();
    $('#myModal').on('shown.bs.modal', function() {
        $('.accordProfile').on("shown.bs.collapse hidden.bs.collapse", function() {
            $('span',this).toggleClass("glyphicon-plus glyphicon-minus");
        });
    });
}

function tooltipPosition() {
    if($(document).width() < 766) {
        $('[data-toggle="tooltip"]').tooltip('destroy').tooltip({placement:'right'});
    } else {
        $('[data-toggle="tooltip"]').tooltip('destroy').tooltip({placement:'right'});
    }
}
