import java.util.Scanner;

public class ThreadInterrupt {

	public static void main(String[] args) {
			System.out.println("Press Enter Key to stop the timer");
			
			//create an instance of the thread and start it by calling start()
			//the run method will automatically execute.
			Thread counter = new Thread(new Counter());
			counter.start();
			
			Scanner keyboard = new Scanner(System.in);
			String s = "start";
			//s will remain equal to "start" within the loop
			//until the user hits enter
			while(!s.equals("")) {
				s = keyboard.nextLine();
			}
			
			//the interrupt method is part of thread and will execute when
			//the user causes the while() loop to exit.
			counter.interrupt();
			keyboard.close();
	}
}
