package week1Assignmt;

public class MarkAttendance {
	MarkAttendance(String dseg, String username){
		System.out.println("Attendance Marked At: " + java.time.LocalTime.now());
		new Work(dseg, username);
	}
}
