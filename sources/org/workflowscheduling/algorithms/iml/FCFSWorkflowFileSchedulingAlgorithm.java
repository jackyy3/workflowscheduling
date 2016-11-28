package org.workflowscheduling.algorithms.iml;

import java.util.List;

import org.workflowscheduling.algorithms.WorkflowSchedulingAlgorithmType;

public class FCFSWorkflowFileSchedulingAlgorithm implements WorkflowFileSchedulingAlgorithm {
	
	private WorkflowSchedulingAlgorithmType workflowSchedulingAlgorithmType;
	
	public FCFSWorkflowFileSchedulingAlgorithm(
			final WorkflowSchedulingAlgorithmType workflowSchedulingAlgorithmType) {
		this.workflowSchedulingAlgorithmType = workflowSchedulingAlgorithmType;
	}

	@Override
	public WorkflowSchedulingAlgorithmType getWorkflowSchedulingAlgorithmType() {
		return this.workflowSchedulingAlgorithmType;
	}

	@Override
	public List<String> scheduleWorkflows(List<String> workflows) {
		return workflows;
	}

}
