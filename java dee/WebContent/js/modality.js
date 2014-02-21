(function startUp() {
	
}) (window);
    
function show(elementId, backgroundId) {
	
	easyOn(elementId);
	var modalEl = document.getElementById(backgroundId);	
	modalEl.setAttribute("style", "display: block; height:" + getClientHeight() + "px;");
}

function hide(elementId, backgroundId) {
	
	easyOff(elementId);
	easyOff(backgroundId);            
}

function easyOn(id) {
	
	var element = document.getElementById(id);
	element.style.display = '';
}

function easyOff(id) {
	
    var element = document.getElementById(id);
    element.style.display = 'none';
}

function getClientHeight() {
	
	var body = document.body,
    html = document.documentElement;
	var height = Math.max( body.scrollHeight, body.offsetHeight, 
						   html.clientHeight, html.scrollHeight, html.offsetHeight );
	return height;
}