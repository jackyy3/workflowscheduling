package org.workflowscheduling.algorithms;

import java.util.List;

import org.cloudbus.cloudsim.Cloudlet;

public interface WorkflowSchedulingAlgorithm {

	WorkflowSchedulingAlgorithmType getWorkflowSchedulingAlgorithmType();
	
	List<? extends Cloudlet> scheduleWorkflows(final List<? extends Cloudlet> workflows);
}
