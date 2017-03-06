package org.workflowscheduling.pool;

import org.workflowscheduling.BaseWorkflow;
import org.workflowscheduling.algorithms.WorkflowSchedulingAlgorithm;
import org.workflowscheduling.algorithms.WorkflowSchedulingAlgorithmType;
import org.workflowscheduling.factory.WorkflowSchedulingAlgorithmFactory;

public class WorkflowScheduler {

	private WorkflowSchedulingAlgorithmType algorithmType;

	public WorkflowScheduler() {
		this(WorkflowSchedulingAlgorithmType.FCFS);
	}

	public WorkflowScheduler(final WorkflowSchedulingAlgorithmType algorithmType) {
		this.algorithmType = algorithmType;
	}

	public WorkflowSchedulingAlgorithm getWorkflowSchedulingAlgorithm() {

		WorkflowSchedulingAlgorithmFactory workflowSchedulingAlgorithmFactory = new WorkflowSchedulingAlgorithmFactory();
		return workflowSchedulingAlgorithmFactory.getWorkflowSchedulingAlgorithm(this.algorithmType);
	}
	
	public BaseWorkflow nextWorkflow(){
		BaseWorkflow wf = new BaseWorkflow("");
		wf.setSchedulingPriority(
				this.getWorkflowSchedulingAlgorithm().calculateSchedulingPriority(wf));
		return wf;
	}
}
