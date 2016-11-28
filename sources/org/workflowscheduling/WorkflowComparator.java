package org.workflowscheduling;

import java.util.Comparator;

public interface WorkflowComparator<T> extends Comparator<Workflow> {
    String getComparisonField();
}
