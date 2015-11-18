<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="resources/flrMarriage.js"></script>
</head>

	<div id="flrMarriageBanner" class="navBanner">
		<input id="flrMarriageBack" type="submit" value="Back">
		Further Leave to Remain (Marriage)
	</div>

	<div id="flrMarriageContent">
			
		<form id="flrMarriageForm" method="POST" action="validator">

			<div id="identityDocuments">
				
				<div id="applicantPassportContainer">
					<label>Have you included the applicants passport?</label>
					<input type="radio" id="applicantPassportYes"
						name="applicantPassport"><label for="applicantPassportYes">Yes</label>
					<input type="radio" id="applicantPassportNo" name="applicantPassport"
						checked="checked"><label for="applicantPassportNo">No</label>
				</div>
				
				<div>
					<label for="applicantPassportPics">Number of applicant passport photos included: </label>					
					<input id="applicantPassportPics" type="number" autocomplete="off">
				</div>
				
				<div id="applicantBirthCertificateContainer">
					<label>Have you included the applicants <strong>original</strong> birth certificate?</label>
					<input type="radio" id="applicantBirthCertificateYes"
						name="applicantBirthCertificate"><label for="applicantBirthCertificateYes">Yes</label>
					<input type="radio" id="applicantBirthCertificateNo" name="applicantBirthCertificate"
						checked="checked"><label for="applicantBirthCertificateNo">No</label>
				</div>
					
				<div id="sponsorPassportContainer">
					<label>Have you included the sponsors passport?</label>
					<input type="radio" id="sponsorPassportYes"
						name="sponsorPassport"><label for="sponsorPassportYes">Yes</label>
					<input type="radio" id="sponsorPassportNo" name="sponsorPassport"
						checked="checked"><label for="sponsorPassportNo">No</label>
				</div>
			</div>
			
			<div id="marriageDocuments">
				<div id="marriageCertificateContainer">
					<label>Have you included your <strong>original</strong> marriage certificate?</label>
					<input type="radio" id="marriageCertificateYes"
						name="marriageCertificate"><label for="marriageCertificateYes">Yes</label>
					<input type="radio" id="marriageCertificateNo" name="marriageCertificate"
						checked="checked"><label for="marriageCertificateNo">No</label>
				</div>
			</div>

			<div id="accomodationDocuments">
				<label for="proofOfAddress">Number of documents to prove address: </label>
				<input id="proofOfAddress" type="number" autocomplete="off">
			</div>
			
			<div id="financialDocuments">
				<label for="earnings">What is your total income per annum? </label>
				<input id="earnings" type="number" autocomplete="off">
				
				<div id="employmentContainer">
					<label>Have you included a letter from your employer stating your permanent employment?</label>
					<input type="radio" id="employmentYes"
						name="employment"><label for="employmentYes">Yes</label>
					<input type="radio" id="employmentNo" name="employment"
						checked="checked"><label for="employmentNo">No</label>
				</div>
				
				<div>
					<label for="numberOfBankStatements">How many months bank statements are you providing? </label>
					<input id="numberOfBankStatements" type="number" autocomplete="off">
				</div>
				
				<div>
					<label for="numberOfPayslips">How many months payslips are you providing? </label>
					<input id="numberOfPayslips" type="number" autocomplete="off">				
				</div>
			</div>
			
			<div id="miscDocuments">
				<div id="applicantOverviewContainer">
					<label>Have you included the an overview letter from the applicant?</label>
					<input type="radio" id="applicantOverviewYes"
						name="applicantOverview"><label for="applicantOverviewYes">Yes</label>
					<input type="radio" id="applicantOverviewNo" name="applicantOverview"
						checked="checked"><label for="applicantOverviewNo">No</label>
				</div>
			
				<div id="sponsorOverviewContainer">
					<label>Have you included the an overview letter from the applicant?</label>
					<input type="radio" id="sponsorOverviewYes"
						name="sponsorOverview"><label for="sponsorOverviewYes">Yes</label>
					<input type="radio" id="sponsorOverviewNo" name="sponsorOverview"
						checked="checked"><label for="sponsorOverviewNo">No</label>
				</div>			
			</div>
	</form>
	
	<div id="flrMarriageSubmitContainer">
		<input id="flrMarriageSubmission" type="submit" value="Check my documents!">
	</div>
	
		<div id="adviceBar" />
	
	</div>

<!--	<script type="text/javascript">
	
	
/* 	Applicant passport --
	Applicant birth certificate --
	Applicant passport picture --
	Sponsor passport --
	Our son birth certificate with both applicant and sponsors name on it
	Applicants letter --
	Sponsor letter
	Marriage certificate --
	Divorce papers from previous divorce for sponsor

	Accommodation 

	Deeds for house
	Mortgage statement 
	Council tax letter in both applicant and sponsor name

	Financial requirements --
	6 months bank statements --
	6 months payslips --
	both previous to maternity leave
	Letter from employer
	Letter stating sponsor on maternity leave and date of return to work
	P60
	Contract of employment  */
	
	
	
	
	
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
		
	</script> -->

</html>