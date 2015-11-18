package VisaType;

public class FLRM {

	private boolean isValid;
	private String validationMessage;
	
	private boolean applicantPassportPresent;
	private int applicantPassportPicsTotal;
	private boolean applicantBirthCertificatePresent;
	private boolean sponsorPassportPresent;
	private boolean marriageCertificatePresent;
	private int addressDocumentsTotal;
	private int earningsTotal;
	private boolean letterOfEmploymentPresent;
	private int bankStatementMonthsTotal;
	private int payslipMonthsTotal;
	private boolean applicantOverviewLetterPresent;
	private boolean sponsorOverviewLetterPresent;

	public String getValidationMessage() {
		return validationMessage;
	}

	public void setValidationMessage(String validationMessage) {
		this.validationMessage = validationMessage;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

	public boolean isApplicantPassportPresent() {
		return applicantPassportPresent;
	}

	public void setApplicantPassportPresent(boolean applicantPassportPresent) {
		this.applicantPassportPresent = applicantPassportPresent;
	}
	
	public int getApplicantPassportPicsTotal() {
		return applicantPassportPicsTotal;
	}

	public void setApplicantPassportPicsTotal(int applicantPassportPicsTotal) {
		this.applicantPassportPicsTotal = applicantPassportPicsTotal;
	}

	public boolean isApplicantBirthCertificatePresent() {
		return applicantBirthCertificatePresent;
	}

	public void setApplicantBirthCertificatePresent(boolean applicantBirthCertificatePresent) {
		this.applicantBirthCertificatePresent = applicantBirthCertificatePresent;
	}
	
	public boolean isSponsorPassportPresent() {
		return sponsorPassportPresent;
	}

	public void setSponsorPassportPresent(boolean sponsorPassportPresent) {
		this.sponsorPassportPresent = sponsorPassportPresent;
	}

	public boolean isMarriageCertificatePresent() {
		return marriageCertificatePresent;
	}

	public void setMarriageCertificatePresent(boolean marriageCertificatePresent) {
		this.marriageCertificatePresent = marriageCertificatePresent;
	}
	
	public int getAddressDocumentsTotal() {
		return addressDocumentsTotal;
	}

	public void setAddressDocumentsTotal(int addressDocumentsTotal) {
		this.addressDocumentsTotal = addressDocumentsTotal;
	}
	
	public int getEarningsTotal() {
		return earningsTotal;
	}

	public void setEarningsTotal(int earningsTotal) {
		this.earningsTotal = earningsTotal;
	}

	public boolean isLetterOfEmploymentPresent() {
		return letterOfEmploymentPresent;
	}

	public void setLetterOfEmploymentPresent(boolean letterOfEmploymentPresent) {
		this.letterOfEmploymentPresent = letterOfEmploymentPresent;
	}

	public int getBankStatementMonthsTotal() {
		return bankStatementMonthsTotal;
	}

	public void setBankStatementMonthsTotal(int bankStatementMonthsTotal) {
		this.bankStatementMonthsTotal = bankStatementMonthsTotal;
	}

	public int getPayslipMonthsTotal() {
		return payslipMonthsTotal;
	}

	public void setPayslipMonthsTotal(int payslipMonthsTotal) {
		this.payslipMonthsTotal = payslipMonthsTotal;
	}

	public boolean isApplicantOverviewLetterPresent() {
		return applicantOverviewLetterPresent;
	}

	public void setApplicantOverviewLetterPresent(boolean applicantOverviewLetterPresent) {
		this.applicantOverviewLetterPresent = applicantOverviewLetterPresent;
	}

	public boolean isSponsorOverviewLetterPresent() {
		return sponsorOverviewLetterPresent;
	}

	public void setSponsorOverviewLetterPresent(boolean sponsorOverviewLetterPresent) {
		this.sponsorOverviewLetterPresent = sponsorOverviewLetterPresent;
	}

}
