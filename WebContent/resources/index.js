$(document).ready(function () {
    $("#load_FLR_M").click(function() {
        $.get("FLR_M.jsp",function(data){
        	onFLRMClicked(data);
        });
    });
});

function onFLRMClicked(data) {
	$("#checklistContainer").html(data);
	$("#visaPanel").hide();
	$("#welcomeBanner").hide();
}