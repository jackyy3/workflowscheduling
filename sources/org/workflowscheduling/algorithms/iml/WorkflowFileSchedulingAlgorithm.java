package org.workflowscheduling.algorithms.iml;

import java.util.List;

import org.workflowscheduling.algorithms.WorkflowSchedulingAlgorithmType;

public interface WorkflowFileSchedulingAlgorithm {
	
	WorkflowSchedulingAlgorithmType getWorkflowSchedulingAlgorithmType();
	
	List<String> scheduleWorkflows(final List<String> workflows);
}
