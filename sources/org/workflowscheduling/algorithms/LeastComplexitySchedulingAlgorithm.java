package org.workflowscheduling.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.workflowscheduling.LeastTasksComparator;
import org.workflowscheduling.Workflow;

public class LeastComplexitySchedulingAlgorithm implements WorkflowSchedulingAlgorithm {

	private WorkflowSchedulingAlgorithmType workflowSchedulingAlgorithmType;
	
	public LeastComplexitySchedulingAlgorithm(
			final WorkflowSchedulingAlgorithmType workflowSchedulingAlgorithmType) {
		this.workflowSchedulingAlgorithmType = workflowSchedulingAlgorithmType;
	}
	
	@Override
	public WorkflowSchedulingAlgorithmType getWorkflowSchedulingAlgorithmType() {
		return this.workflowSchedulingAlgorithmType;
	}

	@Override
	public List<Workflow> scheduleWorkflows(List<Workflow> workflows) {
		List<Workflow> orderedWorkflows = new ArrayList<>(workflows);
		Collections.sort(orderedWorkflows, new LeastTasksComparator());
		return orderedWorkflows;
	}

}
