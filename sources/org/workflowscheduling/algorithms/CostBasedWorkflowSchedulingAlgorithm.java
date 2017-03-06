package org.workflowscheduling.algorithms;

import java.util.List;

import org.workflowscheduling.Workflow;
import org.workflowscheduling.pool.SchedulingPriority;

public class CostBasedWorkflowSchedulingAlgorithm implements WorkflowSchedulingAlgorithm {

	private WorkflowSchedulingAlgorithmType workflowSchedulingAlgorithmType;

	public CostBasedWorkflowSchedulingAlgorithm(final WorkflowSchedulingAlgorithmType workflowSchedulingAlgorithmType) {
		this.workflowSchedulingAlgorithmType = workflowSchedulingAlgorithmType;
	}

	@Override
	public WorkflowSchedulingAlgorithmType getWorkflowSchedulingAlgorithmType() {

		return this.workflowSchedulingAlgorithmType;
	}

	@Override
	public List<Workflow> scheduleWorkflows(List<Workflow> workflows) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SchedulingPriority calculateSchedulingPriority(Workflow workflow) {
		// TODO Auto-generated method stub
		return null;
	}

}
