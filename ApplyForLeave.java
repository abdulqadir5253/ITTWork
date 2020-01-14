package week1Assignmt;

import java.util.Scanner;

public class ApplyForLeave {
	Scanner scan = new Scanner(System.in);
	ApplyForLeave(String username){
		System.out.println("Enter Option"
				+ "\n1.Casual Leave"
				+ "\n2.Earned Leave"
				+ "\n3.Duty Leave"
				+ "\n4.Sick Leave"
				+ "\n5.Maternity Leave"
				+ "\n6.Parental Leave"
				+ "\n7.Leave Without Pay");
		int choice = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter the number of leaves: ");
		int noOfDays = scan.nextInt();
		switch(choice){
		case 1:
			new LeaveInfos("Casual Leaves", noOfDays, username);
			break;
		case 2:
			new LeaveInfos("Earned Leaves", noOfDays, username);
			break;
		case 3:
			new LeaveInfos("Duty Leaves", noOfDays, username);
			break;
		case 4:
			new LeaveInfos("Sick Leaves", noOfDays, username);
			break;
		case 5:
			new LeaveInfos("Maternity Leaves", noOfDays, username);
			break;
		case 6:
			new LeaveInfos("Parental Leaves", noOfDays, username);
			break;
		case 7:
			new LeaveInfos("Leave Wihtout Pay", noOfDays, username);
			break;
		}					
	}
	
	

}
