(function (){
	var Modality = new function () {
		
	};
	var ModalForm = new function() {
		
	};
	ModalForm.prototype.inputFields = {};
	ModalForm.prototype.textareaFields = {};
	Modality.prototype.createModal = function(id, type) {
		return new ModalForm(id, type);
	};
	
	
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


function post_to_url(path, params, method) {
    method = method || "post"; // Set method to post by default if not specified.

    // The rest of this code assumes you are not using a library.
    // It can be made less wordy if you use one.
    var form = document.createElement("form");
    form.setAttribute("method", method);
    form.setAttribute("action", path);

    for(var key in params) {
        if(params.hasOwnProperty(key)) {
            var hiddenField = document.createElement("input");
            hiddenField.setAttribute("type", "hidden");
            hiddenField.setAttribute("name", key);
            hiddenField.setAttribute("value", params[key]);

            form.appendChild(hiddenField);
         }
    }

    document.body.appendChild(form);
    form.submit();
}