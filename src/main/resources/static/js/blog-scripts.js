$(function () {
    $('#messages').find('li').click(function() {
        $(this).fadeOut();
    });

    setTimeout(function () {
        $('#messages').find('li.info').fadeOut();
    }, 3000);
});