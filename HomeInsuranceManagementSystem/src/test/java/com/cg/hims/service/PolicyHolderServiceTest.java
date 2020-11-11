package com.cg.hims.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cg.hims.entities.PolicyHolder;

public class PolicyHolderServiceTest {

	@Test
	public void theGivenPolicyHolderIsAdded() {

		PolicyHolderServiceImpl policyHolderServiceImp = new PolicyHolderServiceImpl();
		PolicyHolder policyHolder = new PolicyHolder();
		policyHolder.setPolicyHolderId(2);
		policyHolder.setPolicyHolderName("Srihitha");
		policyHolder.setPolicyName("Personal Accident Insurance");
		policyHolder.setPremiumType("Monthly");
		policyHolder.setCreditCard("1234556");
		policyHolder.setDob("18-07-1998");
		policyHolder.setOccupation("Engineer");

		PolicyHolder result=policyHolderServiceImp.addPolicyHolder(policyHolder);

		assertEquals(result,policyHolder);

	}

}
