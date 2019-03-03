package _03_Threaded_Reverse_Greeting;

import java.util.ArrayList;

public class ThreadedReverseGreeting {
  //Write a program that creates a thread (Thread 1) that creates another thread (Thread 2); 
  //Thread 2 creates Thread 3; and so on, up to Thread 50. 
  //Each thread should print "Hello from Thread <num>!", 
  //but you should structure your program such that the threads print their greetings in reverse order.
/* HINT: You will most likely need to do this with recursion */
	static ArrayList<Thread> mi;
	static int numup;
	public static void main(String[] args) {
		mi = new ArrayList<Thread>();
		numup = 0;
		reverseGreeting(50);	
		

	
	}

static void reverseGreeting(int v) {
		if(numup >= v) {
			
		} else {
			Thread a = new Thread(()->System.out.println("Hello from thread " + (numup+1)));
			mi.add(a);
			
				mi.get(numup).start();
				try {
					mi.get(numup).join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			numup++;
			reverseGreeting(v);
		
		}
}

}
