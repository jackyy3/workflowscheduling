package org.workflowscheduling.algorithms;

import java.util.List;

import org.workflowscheduling.Workflow;
import org.workflowscheduling.pool.SchedulingPriority;

public interface WorkflowSchedulingAlgorithm {

	WorkflowSchedulingAlgorithmType getWorkflowSchedulingAlgorithmType();
	
	List<Workflow> scheduleWorkflows(final List<Workflow> workflows);
	
	SchedulingPriority calculateSchedulingPriority(final Workflow workflow);
}
