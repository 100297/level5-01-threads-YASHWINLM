package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ThreadPool {
	Thread[] arr;
	ConcurrentLinkedQueue<Task> TaskQue;

	public ThreadPool(int i) {
		// TODO Auto-generated constructor stub
		arr = new Thread[i];
		TaskQue = new ConcurrentLinkedQueue<Task>();
		for (int j = 0; j < arr.length; j++) {
			arr[j] = new Thread(new Worker(TaskQue));
		}

	}

	public void addTask(Task task) {
		// TODO Auto-generated method stub
		TaskQue.add(task);
	}

	public void start() {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			arr[i].start();
		}
		for (int j = 0; j < arr.length; j++) {
			try {
				arr[j].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
