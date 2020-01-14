package week1Assignmt;

import java.util.Scanner;

public class Work {
	// Scanner scan = new Scanner(System.in);

	static void check(String dseg, String username) {
		if (dseg.equals("Executive"))
			new Executive().leave(username);
		else if (dseg.equals("Manager"))
			new Manager().leave();
		else
			new Lead().leave(username);
	}

	Work(String dseg, String username) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Option: \n1.Mark Attendance\n2.Manage Leave\n");
		int choice = scan.nextInt();

		switch (choice) {
		case 1:
			new MarkAttendance(dseg, username);
			break;
		case 2:
			check(dseg, username);
			break;
		}

	}
}
