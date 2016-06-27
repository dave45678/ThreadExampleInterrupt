import java.util.Scanner;

public class ThreadInterrupt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.out.println("Press Enter Key to stop the timer");
			Thread counter = new Thread(new Counter());
			counter.start();
			Scanner keyboard = new Scanner(System.in);
			String s = "start";
			while(!s.equals("")) {
				s = keyboard.nextLine();
			}
			counter.interrupt();
			keyboard.close();
	}
}
