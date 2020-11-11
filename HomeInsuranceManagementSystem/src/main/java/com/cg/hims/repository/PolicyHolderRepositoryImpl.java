package com.cg.hims.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.hims.entities.PolicyHolder;
import com.cg.hims.exceptions.PolicyHolderNotFoundException;

public class PolicyHolderRepositoryImpl implements IPolicyHolderRepository{
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JPA-PU");
    EntityManager entityManager=entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction=entityManager.getTransaction();

	@Override
	public PolicyHolder addPolicyHolder(PolicyHolder policyHolder) {
	
		entityTransaction.begin();
		entityManager.persist(policyHolder);
		entityTransaction.commit();
		return policyHolder;
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
