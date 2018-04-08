import java.util.Scanner;

public class Worker {
	private String workerName = "";
	private String workerID = "";
	private boolean startNewSession = false;
	private boolean checkHold = true;
	private int option = 0;

	public Worker(String name, String id) {
		this.workerName = name;
		this.workerID = id;

	}

	public boolean startNewSession() {

		try {
			Scanner scan = new Scanner(System.in);
			this.option = scan.nextInt();
			System.out.println("Do you want to start new session?");
			System.out.println("1. start new session.");
			if (option == 1) {
				startNewSession = true;
			}

		} catch (Exception e) {
			System.out.println("You entered the wrong input. ");

		}
		return startNewSession;
	}
	public boolean checkHold(String patronID){
		Hold hold=new Hold();
		checkHold=hold.getHold(patronID);
		
		return checkHold;
		
	}

}
