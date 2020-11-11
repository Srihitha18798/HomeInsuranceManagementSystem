package com.cg.hims.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class PolicyHolder {

	@Id
	private int policyHolderId;
	@Column
	private String policyHolderName;
	@Column
	private String policyName;
	@Column
	private String premiumType;
	@Column
	private String creditCard;
	@Column
	private String dob;
	@Column
	private String occupation;
	@Column
	private double annualIncome;
	@Column
	private String isRetired;
	@Column
	private String ssn;
	@Column
	private String emailId;
	@Column
	private int policyId;

	@OneToOne
	@JoinColumn
	private HomeAddress address;

	public int getPolicyHolderId() {
		return policyHolderId;
	}

	public void setPolicyHolderId(int policyHolderId) {
		this.policyHolderId = policyHolderId;
	}

	public String getPolicyHolderName() {
		return policyHolderName;
	}

	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public String getPremiumType() {
		return premiumType;
	}

	public void setPremiumType(String premiumType) {
		this.premiumType = premiumType;
	}

	public String getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}

	public String getIsRetired() {
		return isRetired;
	}

	public void setIsRetired(String isRetired) {
		this.isRetired = isRetired;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getPolicyId() {
		return policyId;
	}

	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}

	public HomeAddress getAddress() {
		return address;
	}

	public void setAddress(HomeAddress address) {
		this.address = address;
	}

}
