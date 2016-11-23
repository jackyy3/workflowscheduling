package org.workflowscheduling.factory;

import org.workflowscheduling.algorithms.CostBasedWorkflowSchedulingAlgorithm;
import org.workflowscheduling.algorithms.EDFWorkflowSchedulingAlgorithm;
import org.workflowscheduling.algorithms.FCFSWorkflowSchedulingAlgorithm;
import org.workflowscheduling.algorithms.WorkflowSchedulingAlgorithm;
import org.workflowscheduling.algorithms.WorkflowSchedulingAlgorithmType;

public class WorkflowSchedulingAlgorithmFactory {

    public WorkflowSchedulingAlgorithm getWorkflowSchedulingAlgorithm(
    		final WorkflowSchedulingAlgorithmType workflowSchedulingAlgorithmType) {
    	if (workflowSchedulingAlgorithmType == WorkflowSchedulingAlgorithmType.FCFS) {
    		return new FCFSWorkflowSchedulingAlgorithm(WorkflowSchedulingAlgorithmType.FCFS);
    	} else if (workflowSchedulingAlgorithmType == WorkflowSchedulingAlgorithmType.EDF){
    		return new EDFWorkflowSchedulingAlgorithm(WorkflowSchedulingAlgorithmType.EDF);
    	}  else {
    		return new CostBasedWorkflowSchedulingAlgorithm(WorkflowSchedulingAlgorithmType.COSTBASED);
    	}
    }
}
