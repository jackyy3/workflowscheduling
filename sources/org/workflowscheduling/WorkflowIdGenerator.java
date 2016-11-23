package org.workflowscheduling;

public enum WorkflowIdGenerator {

    INSTANCE;
	
	private long currentSessionIdAccumulationCount = 0;
	
	public synchronized long getNextWorkflowId(){
		long avaiId = this.currentSessionIdAccumulationCount++;	
		return avaiId;
	}
}
