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
	public void leave(String username){
		System.out.print("Enter Option: \n1. Apply for Leave\n2. Check Leave Application\n"
				+ "3.Logout");
		int choice = scan.nextInt();
		switch(choice){
		case 1:
			new ApplyForLeave(username);
			break;
		case 2:
			if(new LeaveManage().checkStatus(username)){
				System.out.println("Leave Granted");
				new Executive().leave(username);
			}										
			else				
				System.out.println("Application Pending for Approval");
			break;
		case 3:
			new Index().login();
		}
		
		new Work("Executive", username);
	}
}

class Lead extends Leaves{
	public void leave(String username){
		System.out.print("Enter Option: \n1. Apply for Leave\n2. Check Leave Application\n3."
				+ "Executive Leave Application\n"
				+ "4.Logout");
		int choice = scan.nextInt();
		switch(choice){
		case 1:
			new ApplyForLeave(username);
			break;
		case 2:
			System.out.println("Application Pending for Approval");
			break;
		case 3:
			System.out.println("No Application Here!");
			break;
		case 4:
			new Index().login();
	
		}
	}
}

class Manager extends Leaves{
	
	public synchronized void leave(){
		System.out.println("Enter Option: \n1.Manage Executive Leave Application \n2.Credit/Debit Leaves\n"
				+ "3.Logout");
		
		int choice = scan.nextInt();
		
		switch(choice){
		case 1:
			if(LeaveInfos.leaveApplication == 0){
				System.out.println("No Leave Applications Here!");
				new Manager().leave();
			}							
			else
				new LeaveInfos();
			break;
		case 2:
			System.out.println("Work In Progress!");
			break;
		case 3:
			new Index().login();
		}
	}
}