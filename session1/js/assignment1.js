function displaybtn(){
    var div = document.getElementById('btn1');
    div.value = div.value == 'Show' ? 'Hide' : 'Show';

    var div = document.getElementById('spn1');
    div.style.display = div.style.display == 'none' ? 'block' : 'none';
}
