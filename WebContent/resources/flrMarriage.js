$(document).ready(function () {
    $("#flrMarriageBack").click(function() {
        $.get("index.jsp",function(data){
        	onFlrMarriageBackClicked();
        });
    });
});

function onFlrMarriageBackClicked(data) {
	//$("#checklistContainer").hide()
	//$("#checklistContainer").empty();
	$("#flrMarriageBanner").hide();
	$("#flrMarriageContent").hide();
	$("#visaPanel").show();
	$("#welcomeBanner").show();
}

$(function() {
	    $( "#applicantPassportContainer" ).buttonset();
	    $( "#applicantBirthCertificateContainer" ).buttonset();
	    $( "#sponsorPassportContainer" ).buttonset();
	    $( "#marriageCertificateContainer" ).buttonset();
	    $( "#applicantOverviewContainer" ).buttonset();
	    $( "#sponsorOverviewContainer" ).buttonset();
	    $( "#employmentContainer").buttonset();
	  });
	
		var form = $('#flrMarriageForm');
	
		
		$("#flrMarriageSubmission").click(function() {
		    
			var requestParams = {};
			requestParams.applicantPassportPresent = $('#applicantPassportYes').is(':checked');
			requestParams.applicantPassportPicsTotal = $('#applicantPassportPics').val();
			requestParams.applicantBirthCertificatePresent = $('#applicantBirthCertificateYes').is(':checked');
			requestParams.sponsorPassportPresent = $('#sponsorPassportYes').is(':checked');
			requestParams.marriageCertificatePresent = $('#marriageCertificateYes').is(':checked');
			requestParams.addressDocumentsTotal = $('#proofOfAddress').val();
			requestParams.earningsTotal = $('#earnings').val();
			requestParams.letterOfEmploymentPresent = $('#employmentYes').is(':checked');
			requestParams.bankStatementMonthsTotal = $('#numberOfBankStatements').val();
			requestParams.payslipMonthsTotal = $('#numberOfPayslips').val();
			requestParams.applicantOverviewLetterPresent = $('#applicantOverviewYes').is(':checked');
			requestParams.sponsorOverviewLetterPresent = $('#sponsorOverviewYes').is(':checked');
			
			
			
			
			$.ajax({
				type: 'POST',//form.attr('method'),
			    url: form.attr('action'),
			    data: JSON.stringify(requestParams),
			    datatype: 'json',
		        success: function (data) {
			        if(data != null) {
						var isValid = data.isValid;
			        	var message = data.validationMessage;
			        	$("#adviceBar").html(message);
			        }
//			        $('#result').attr("value",result);
			    },
		        failure: function (data) {
			        var result=data;
//			        $('#result').attr("value",result);
			    }
		    });
	        //return false;
	     });