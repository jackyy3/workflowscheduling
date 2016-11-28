package org.workflowscheduling.factory;

import org.workflowscheduling.algorithms.WorkflowSchedulingAlgorithmType;
import org.workflowscheduling.algorithms.iml.FCFSWorkflowFileSchedulingAlgorithm;
import org.workflowscheduling.algorithms.iml.LeastComplexityFileSchedulingAlgorithm;
import org.workflowscheduling.algorithms.iml.LeastNodesFileSchedulingAlgorithm;
import org.workflowscheduling.algorithms.iml.WorkflowFileSchedulingAlgorithm;

public class FileWorkflowSchedulingAlgorithmFactory {
    public WorkflowFileSchedulingAlgorithm getWorkflowSchedulingAlgorithm(
    		final WorkflowSchedulingAlgorithmType workflowSchedulingAlgorithmType) {
    	if (workflowSchedulingAlgorithmType == WorkflowSchedulingAlgorithmType.FCFS) {
    		return new FCFSWorkflowFileSchedulingAlgorithm(WorkflowSchedulingAlgorithmType.FCFS);
    	} else if (workflowSchedulingAlgorithmType == WorkflowSchedulingAlgorithmType.LEAST_COMPLEXITY){
    		return new LeastComplexityFileSchedulingAlgorithm(WorkflowSchedulingAlgorithmType.LEAST_COMPLEXITY);
    	}  else {
    		return new LeastNodesFileSchedulingAlgorithm(WorkflowSchedulingAlgorithmType.LEAST_NODES);
    	}
    }
}
