package org.workflowscheduling.engine;

import org.workflowscheduling.algorithms.WorkflowSchedulingAlgorithm;
import org.workflowscheduling.algorithms.WorkflowSchedulingAlgorithmType;
import org.workflowscheduling.factory.WorkflowSchedulingAlgorithmFactory;

public class WorkflowSchedulingEngine {

    private WorkflowSchedulingAlgorithmType algorithmType;

    public WorkflowSchedulingEngine() {
    	this (WorkflowSchedulingAlgorithmType.FCFS);
    }

    public WorkflowSchedulingEngine(final WorkflowSchedulingAlgorithmType algorithmType) {
    	this.algorithmType = algorithmType;
    }
    
    public WorkflowSchedulingAlgorithm getWorkflowSchedulingAlgorithm() {

    	WorkflowSchedulingAlgorithmFactory workflowSchedulingAlgorithmFactory =
    			new WorkflowSchedulingAlgorithmFactory();

    	return workflowSchedulingAlgorithmFactory.getWorkflowSchedulingAlgorithm(this.algorithmType);
    }
}
