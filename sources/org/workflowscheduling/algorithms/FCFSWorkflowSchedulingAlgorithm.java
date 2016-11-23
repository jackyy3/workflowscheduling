package org.workflowscheduling.algorithms;

import java.util.List;

import org.cloudbus.cloudsim.Cloudlet;

public class FCFSWorkflowSchedulingAlgorithm implements WorkflowSchedulingAlgorithm {

	private WorkflowSchedulingAlgorithmType workflowSchedulingAlgorithmType;

	public FCFSWorkflowSchedulingAlgorithm(final WorkflowSchedulingAlgorithmType workflowSchedulingAlgorithmType) {
		this.workflowSchedulingAlgorithmType = workflowSchedulingAlgorithmType;
	}
	
	@Override
	public WorkflowSchedulingAlgorithmType getWorkflowSchedulingAlgorithmType() {
		return this.workflowSchedulingAlgorithmType;
	}

	@Override
	public List<? extends Cloudlet> scheduleWorkflows(List<? extends Cloudlet> workflows) {
		// call scheduling algorithm for Cloudlet.
		return null;
	}

}
