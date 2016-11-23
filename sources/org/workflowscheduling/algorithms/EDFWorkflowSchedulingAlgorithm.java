package org.workflowscheduling.algorithms;

import java.util.List;

import org.cloudbus.cloudsim.Cloudlet;

public class EDFWorkflowSchedulingAlgorithm implements WorkflowSchedulingAlgorithm {

	private WorkflowSchedulingAlgorithmType workflowSchedulingAlgorithmType;
	
	public EDFWorkflowSchedulingAlgorithm(final WorkflowSchedulingAlgorithmType workflowSchedulingAlgorithmType) {
		this.workflowSchedulingAlgorithmType = workflowSchedulingAlgorithmType;
	}
	
	@Override
	public WorkflowSchedulingAlgorithmType getWorkflowSchedulingAlgorithmType() {
		return this.workflowSchedulingAlgorithmType;
	}

	@Override
	public List<? extends Cloudlet> scheduleWorkflows(List<? extends Cloudlet> workflows) {
		// TODO Auto-generated method stub
		return null;
	}

}
