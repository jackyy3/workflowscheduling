package org.workflowscheduling;

import java.util.List;

import org.cloudbus.cloudsim.Cloudlet;

public class BaseWorkflow implements Workflow {
	private long arrivalTime;
	private long simpleMissingDeadlineCost;
	private long deadline;
	private final String daxPath;
	private final long workflowId;
	private long actualCompletionTime;
	private long actualStartTime;
	private long actualCost;
	private List<? extends Cloudlet> tasks;
	
	public BaseWorkflow(final String daxPath){
		this.daxPath = daxPath;
		this.workflowId = WorkflowIdGenerator.INSTANCE.getNextWorkflowId();
	}
	
	public String getDaxPath() {
		return this.daxPath;
	}
	
	public void setArrivalTime(final long arrivalTime){
		this.arrivalTime = arrivalTime;
	}
	
	public void setSimpleMissingDeadlineCost(final long simpleMissingDeadlineCost) {
		this.simpleMissingDeadlineCost = simpleMissingDeadlineCost;
	}
	
	public void setDeadline(final long deadline) {
		this.deadline = deadline;
	}
	
	public long getArrivalTime() {
		return this.arrivalTime;
	}
	
	public long getSimpleMissingDeadlineCost() {
		return this.simpleMissingDeadlineCost;
	}
	
	public long getDeadline() {
		return this.deadline;
	}
	
	public long getActualCompletionTime() {
		return this.actualCompletionTime;
	}
	
	public void setActualCompletionTime(final long actualCompletionTime) {
		this.actualCompletionTime = actualCompletionTime;
	}

	public long getActualStartTime() {
		return actualStartTime;
	}

	public void setActualStartTime(final long actualStartTime) {
		this.actualStartTime = actualStartTime;
	}

	public long getActualCost() {
		return actualCost;
	}

	public void setActualCost(final long actualCost) {
		this.actualCost = actualCost;
	}
	
	public void setTasks(final List<? extends Cloudlet> tasks) {
		this.tasks = tasks;
	}
	
	public void addTask(final Cloudlet task) {
		this.getTasks().add(task);
	}
	
	public List getTasks() {
		return this.tasks;
	}

	@Override
	public long getWorkflowId() {
		return this.workflowId;
	}
}
