package org.workflowscheduling.pool;

import java.util.HashMap;
import java.util.Map;

import org.workflowscheduling.BaseWorkflow;

public class WorkflowSchedulingPool {

	private final Map<SchedulingPriority, PoolTasksContainer> workflowPool = new HashMap<>();

	public void addToPool(final BaseWorkflow workflow) {
		SchedulingPriority schedulingPriority = workflow.getSchedulingPriority();
		PoolTasksContainer container = null;
		if (workflowPool.containsKey(schedulingPriority)) {
			container = workflowPool.get(schedulingPriority);
		} else {
			container = new PoolTasksContainer(schedulingPriority);
		}
		container.addToContainer(workflow);
		workflowPool.put(schedulingPriority, container);
	}

	public void removeFromPool(final BaseWorkflow workflow) {
		SchedulingPriority schedulingPriority = workflow.getSchedulingPriority();
		if (workflowPool.containsKey(schedulingPriority)) {
			PoolTasksContainer container = workflowPool.get(schedulingPriority);
			container.removeFromContainer(workflow);
		}
	}

	public BaseWorkflow retrieveNextWorkflow(final SchedulingPriority sp) {
		if (!this.poolContainsWF(sp)) {
			return null;
		}
		BaseWorkflow wf = this.workflowPool.get(sp).retrieveNextWorkflow(sp);
		this.removeFromPool(wf);
		return wf;
	}

	public boolean poolContainsWF(final SchedulingPriority sp) {
		if (!this.workflowPool.containsKey(sp)) {
			return false;
		}
		if (this.workflowPool.get(sp).isContainerEmpty()) {
			return false;
		}
		return true;
	}
}
