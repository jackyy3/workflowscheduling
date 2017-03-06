package org.workflowscheduling.pool;

import org.workflowscheduling.BaseWorkflow;

public class WorkflowSchedulingOutputHandler {
	public void execute(final BaseWorkflow workflow) {
        System.out.println("success " + workflow.getSchedulingPriority().getPriorityIndex());
	}
}
