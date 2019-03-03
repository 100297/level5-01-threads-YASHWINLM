package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ThreadPool {
	Thread[] arr;
	ConcurrentLinkedQueue<Task> TaskQue;

	public ThreadPool(int i) {
		// TODO Auto-generated constructor stub
	arr = new Thread[i];
	for (int j = 0; j < arr.length; j++) {
		arr[i] = new Thread(new Worker());
	}
	}

	public void addTask(Task task) {
		// TODO Auto-generated method stub

	}

	public void start() {
		// TODO Auto-generated method stub

	}

}
