package org.workflowscheduling.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.workflowscheduling.ArrivalTimeComparator;
import org.workflowscheduling.Workflow;

public class FCFSWorkflowSchedulingAlgorithm implements WorkflowSchedulingAlgorithm {

	private WorkflowSchedulingAlgorithmType workflowSchedulingAlgorithmType;

	public FCFSWorkflowSchedulingAlgorithm(final WorkflowSchedulingAlgorithmType workflowSchedulingAlgorithmType) {
		this.workflowSchedulingAlgorithmType = workflowSchedulingAlgorithmType;
	}
	
	@Override
	public WorkflowSchedulingAlgorithmType getWorkflowSchedulingAlgorithmType() {
		return this.workflowSchedulingAlgorithmType;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Workflow> scheduleWorkflows(List<Workflow> workflows) {
		List<Workflow> orderedWorkflows = new ArrayList<>(workflows);
		Collections.sort(orderedWorkflows, new ArrivalTimeComparator());
		return orderedWorkflows;
	}

}
