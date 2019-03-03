package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Worker implements Runnable {
	ConcurrentLinkedQueue<Task> TaskQu;
	
	public Worker(ConcurrentLinkedQueue<Task> TaskQ) {
		TaskQu =  TaskQ;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(TaskQu.isEmpty()) {
			
		} else {
		Task a =	TaskQu.remove();
		a.perform();	
		}
	}


}
