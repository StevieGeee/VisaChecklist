package Validators;

import VisaType.FLRM;

public class FLRMValidator {

	public static final String SUCCESS = "Congratulations! You have supplied all documents that are required for an FLR(M) application!";
	
	public static FLRM validate(FLRM visa) {
		
		if(visa == null) {
			return null;
		}
		
		if(visa.isApplicantPassportPresent() == false) {
			visa.setValid(false);
			visa.setValidationMessage("You must supply the applicant's original passport");
			return visa;
		}
		if(visa.getApplicantPassportPicsTotal() < 3) {
			visa.setValid(false);
			visa.setValidationMessage("You have less than the number of required applicant passport photos. "
					+ "You need at least 2");
			return visa;
		}
		if(visa.isApplicantBirthCertificatePresent() == false) {
			visa.setValid(false);
			visa.setValidationMessage("You must supply the applicant's original birth certificate");
			return visa;
		}
		if(visa.isSponsorPassportPresent() == false) {
			visa.setValid(false);
			visa.setValidationMessage("You must supply the sponsor's original passport");
			return visa;
		}
		if(visa.isMarriageCertificatePresent() == false) {
			visa.setValid(false);
			visa.setValidationMessage("You must supply an original marriage certificate");
			return visa;
		}
		if(visa.getAddressDocumentsTotal() < 13) {
			visa.setValid(false);
			visa.setValidationMessage("You have less than the number of required documents to "
					+ "provide proof of address. You need at least 12");
			return visa;
		}
		if(visa.getEarningsTotal() < 18200) {
			visa.setValid(false);
			visa.setValidationMessage("Your total earnings need to be above £18,200");
			return visa;
		}
		if(visa.isLetterOfEmploymentPresent() == false) {
			visa.setValid(false);
			visa.setValidationMessage("You must supply a letter from your employer, detailing your employment status");
			return visa;
		}
		if(visa.getBankStatementMonthsTotal() < 7) {
			visa.setValid(false);
			visa.setValidationMessage("Your must supply a minimum of 6 months bank statement history");
			return visa;
		}
		if(visa.getPayslipMonthsTotal() < 7) {
			visa.setValid(false);
			visa.setValidationMessage("Your must supply a minimum of 6 months worth of original payslips");
			return visa;
		}
		if(visa.isApplicantOverviewLetterPresent() == false) {
			visa.setValid(false);
			visa.setValidationMessage("You must supply a letter which gives a detailed account of your application");
			return visa;
		}
		if(visa.isSponsorOverviewLetterPresent() == false) {
			visa.setValid(false);
			visa.setValidationMessage("You must supply a letter which gives a detailed account of your sponsors willingness to sponsor you");
			return visa;
		}
		
		visa.setValid(true);
		visa.setValidationMessage(SUCCESS);
		return visa;
	}
}
