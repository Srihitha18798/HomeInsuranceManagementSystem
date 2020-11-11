package com.cg.hims.service;

import java.util.List;

import com.cg.hims.entities.Policy;
import com.cg.hims.exceptions.PolicyNotFoundException;

public interface IPolicyService {

	public Policy addPolicy(Policy policy);

	public Policy updatePolicy(Policy policy) throws PolicyNotFoundException;

	public Policy findPolicyById(int policyId) throws PolicyNotFoundException;

	public Policy removePolicy(int policyId) throws PolicyNotFoundException;

	public List<Policy> showAllPolicies();

}
