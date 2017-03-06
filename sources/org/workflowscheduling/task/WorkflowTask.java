package org.workflowscheduling.task;

import org.workflowscheduling.pool.SchedulingPriority;
import org.workflowsim.Task;

public class WorkflowTask extends Task {

	private long workflowId;

	public WorkflowTask(final int taskId, final long taskLength, final long workflowId) {
		super(taskId, taskLength);
		this.workflowId = workflowId;
	}

	public long getWorkflowId() {
		return workflowId;
	}

	public void setWorkflowId(final long workflowId) {
		this.workflowId = workflowId;
	}

}
