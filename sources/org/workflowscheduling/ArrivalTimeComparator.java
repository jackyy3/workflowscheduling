package org.workflowscheduling;

public class ArrivalTimeComparator<T> implements WorkflowComparator<T> {

	public static final String COMPARISONFIELD = "ArrivalTime";

	@Override
	public int compare(Workflow o1, Workflow o2) {
		BaseWorkflow bo1 = (BaseWorkflow) o1;
		BaseWorkflow bo2 = (BaseWorkflow) o2;
		if (bo1.getArrivalTime() < bo2.getArrivalTime()) {
			return -1;
		} else if (bo1.getArrivalTime() > bo2.getArrivalTime()) {
			return 1;
		}
		return 0;
	}

	@Override
	public String getComparisonField() {
		return COMPARISONFIELD;
	}
}