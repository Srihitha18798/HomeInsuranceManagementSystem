package com.cg.hims.service;

import java.util.List;

import com.cg.hims.entities.Agent;
import com.cg.hims.exceptions.AgentNotFoundException;

public interface IAgentService {

	public Agent addAgent(Agent agent);

	public Agent updateAgent(Agent agent) throws AgentNotFoundException;

	public Agent removeAgent(int agentId) throws AgentNotFoundException;

	public Agent findAgentById(int agentId) throws AgentNotFoundException;

	public List<Agent> viewAllAgents();

}
