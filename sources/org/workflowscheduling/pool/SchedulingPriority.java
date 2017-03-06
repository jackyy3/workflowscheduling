package org.workflowscheduling.pool;

public class SchedulingPriority {

	private long priorityIndex;

	public SchedulingPriority(final long priorityIndex) {
		this.setPriorityIndex(priorityIndex);
	}

	/**
	 * @return the priorityIndex
	 */
	public long getPriorityIndex() {
		return priorityIndex;
	}

	/**
	 * @param priorityIndex
	 *            the priorityIndex to set
	 */
	public void setPriorityIndex(long priorityIndex) {
		this.priorityIndex = priorityIndex;
	}
}
