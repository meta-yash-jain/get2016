$(document).ready(init);

function init(){
	
	$('button#foldButton').click(defineFolding);
}

function defineFolding(){
	
	var oriDomi = new OriDomi('div#myDiv');
	oriDomi.setRipple(1).curl(50).collapse().setSpeed(2000).stairs(-29).foldUp().unfold();

}