/***
 * 
 * @author oracle
 * The counter class implements the Runnable interface which means that 
 * you can extend another class or implement other interfaces. This gives you greater 
 * flexibility than extending the Thread class.
 * 
 * The interface requires you to override the run() method (no arguments).
 * Your code goes into run. 
 */
public class Counter 
		implements Runnable {

	
	@Override
	public void run() {
		Thread ct = Thread.currentThread();
		int count = 1;
		System.out.println("Timer begins");

		while(true) {
			try {
				System.out.println("sleeping for 1 second");
				Thread.sleep(1000); // Sleep for 1 second
			} catch (InterruptedException e) {
				System.out.println("Interrupted Exception Caught!");
				break;
			}
			System.out.println("Elapsed Time: " + count + " seconds");
			count++;
		}
		System.out.println("User interrupted the thread");

	}

}
