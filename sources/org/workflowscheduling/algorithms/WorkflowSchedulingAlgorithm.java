package org.workflowscheduling.algorithms;

import java.util.List;

import org.workflowscheduling.Workflow;

public interface WorkflowSchedulingAlgorithm {

	WorkflowSchedulingAlgorithmType getWorkflowSchedulingAlgorithmType();
	
	List<Workflow> scheduleWorkflows(final List<Workflow> workflows);
}
