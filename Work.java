package week1Assignmt;
import java.util.Scanner;

public class Work {
	Scanner scan = new Scanner(System.in);
	
	static void check(String dseg){
		if(dseg.equals("Executive"))
				new Executive().leave();
		else if(dseg.equals("Manager"))
				new Manager().leave();
		else 
			new Lead().leave();
	}
	
	Work(String dseg){	
		System.out.print("Enter Option: \n1.Mark Attendance\n2.Apply for Leave\n");
		int choice = scan.nextInt();
		switch(choice){
		case 1: 
				new MarkAttendance();
				break;
		case 2:
				check(dseg);
				break;
		}
			
	}
}
