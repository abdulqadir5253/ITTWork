package week1Assignmt;

import java.util.Scanner;

interface leavesInt{
	Scanner scan = new Scanner(System.in);
	public void leave();
}

public class Leaves implements leavesInt{
	public void leave(){
		System.out.println("Leave Module");
	}	
}

class Executive extends Leaves{
	public void leave(){
		System.out.print("Enter Option: \n1. Apply for Leave\n2. Check Leave Application\n");
		int choice = scan.nextInt();
		switch(choice){
		case 1:
			new ApplyForLeave();
			break;
		case 2:
			System.out.println("Application Pending for Approval");
			break;
		}		
	}
}

class Lead extends Leaves{
	public void leave(){
		System.out.print("Enter Option: \n1. Apply for Leave\n2. Check Leave Application\n3."
				+ "Executive Leave Application\n");
		int choice = scan.nextInt();
		switch(choice){
		case 1:
			new ApplyForLeave();
			break;
		case 2:
			System.out.println("Application Pending for Approval");
			break;
		case 3:
			System.out.println("No Application Here!");
		}
	}
}

class Manager extends Leaves{
	
	public void leave(){
		System.out.print("Enter Option: \n1.Executive Leave Application \n2.Credit/Debit Leaves\n"
				+ "3. Adjust Leaves of Executives\n");
		int choice = scan.nextInt();
		switch(choice){
		case 1:
			System.out.println("No Leave Applications Here!");
			break;
		case 2:
			System.out.println("Work In Progress!");
			break;
		case 3:
			System.out.println("Work In Progress!");
		}
	}
}