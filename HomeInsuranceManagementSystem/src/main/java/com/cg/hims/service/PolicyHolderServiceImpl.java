package com.cg.hims.service;

import java.util.List;

import com.cg.hims.entities.PolicyHolder;
import com.cg.hims.exceptions.PolicyHolderNotFoundException;
import com.cg.hims.repository.PolicyHolderRepositoryImpl;

public class PolicyHolderServiceImpl implements IPolicyHolderService{
	
	private PolicyHolderRepositoryImpl policyHolderRepository = new PolicyHolderRepositoryImpl();

	@Override
	public PolicyHolder addPolicyHolder(PolicyHolder policyHolder) {	
		
		return policyHolderRepository.addPolicyHolder(policyHolder);
	}

	@Override
	public PolicyHolder updatePolicyHolder(PolicyHolder policyHolder) throws PolicyHolderNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PolicyHolder findPolicyHolderById(int id) throws PolicyHolderNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PolicyHolder removePolicyHolder(int id) throws PolicyHolderNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PolicyHolder> showAllPolicyHolders() {
		// TODO Auto-generated method stub
		return null;
	}

}
