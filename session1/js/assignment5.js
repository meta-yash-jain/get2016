$(document).ready(init);
function init()
{
    $('#first').click(function() {
            $('img').parent().css(
                {
                    'border':'solid 5px brown'
                });
        }
    );

    $('#second').click(function() {
            $('img').parents().css(
                {
                    'border':'solid 3px gray'
                });
        }
    );

    $('#third').click(function() {
            $('#parent1').siblings().css(
                {
                    'background-color':'brown'
                });
        }
    );

    $('#fourth').click(function() {
            $('img').parentsUntil('#parent1').css(
                {
                    'background-color':'pink'
                });
        }
    );

    $('#fifth').click(function() {
            $('img').closest('#parent1').css(
                {
                    'background-color':'pink'
                });
        }
    );

    $('#sixth').click(function() {
            $('#parent1').children().css(
                {
                    'background-color':'pink'
                });
        }
    );

    $('#seventh').click(function() {
            $('#parent1').find('p').css(
                {
                    'background-color':'red'
                });
        }
    );
}