package org.workflowscheduling.engine;

import java.util.Random;

import org.workflowscheduling.pool.SchedulingPriority;
import org.workflowscheduling.pool.WorkflowScheduler;
import org.workflowscheduling.pool.WorkflowSchedulingOutputHandler;
import org.workflowscheduling.pool.WorkflowSchedulingPool;

public class WorkflowSchedulingEngine {

	private WorkflowScheduler scheduler;
	private WorkflowSchedulingPool pool;
	private WorkflowSchedulingOutputHandler outputHandler;

	public WorkflowSchedulingEngine(final WorkflowScheduler scheduler, final WorkflowSchedulingPool pool,
			final WorkflowSchedulingOutputHandler outputHandler) {
		this.scheduler = scheduler;
		this.pool = pool;
		this.outputHandler = outputHandler;
	}

	public void start() {
		(new AddInputs()).run();
		(new WFExecutor()).run();
	}

	class AddInputs implements Runnable {

		@Override
		public void run() {
			while (true) {
				if (scheduler.nextWorkflow() != null) {
					pool.addToPool(scheduler.nextWorkflow());
				}
			}
		}
	}

	class WFExecutor implements Runnable {

		long seq_id = 0;
		Random ran = new Random();

		@Override
		public void run() {
			while (true) {
				long loopIndex;
				if ((++seq_id) / 17 != 0) {
					loopIndex = 0;
				} else {
					loopIndex = 17 + ran.nextLong();
				}
				boolean foundNextWF = false;
				while (!foundNextWF) {
					SchedulingPriority sp = new SchedulingPriority(loopIndex);
					if (pool.poolContainsWF(sp)) {
						foundNextWF = true;
						outputHandler.execute(pool.retrieveNextWorkflow(sp));
					}
				}
				loopIndex++;
			}
		}

	}
}
