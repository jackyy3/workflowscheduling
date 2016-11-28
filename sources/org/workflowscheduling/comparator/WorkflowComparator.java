package org.workflowscheduling.comparator;

import java.util.Comparator;

import org.workflowscheduling.Workflow;

public interface WorkflowComparator<T> extends Comparator<Workflow> {
    String getComparisonField();
}
