package week1Assignmt;
import java.util.Scanner;

class Employee{
	private int leavesAvl;
	private int leavesTaken;	
	private int leaveStatus;
	
	// -1 Leave Cancelled
	// 0 No application
	// 1 Leave Granted
	// 2 Pending for approval
	
	
	Employee(){
		leavesAvl = 10;
		leavesTaken = 0;
		leaveStatus = 0;		
	}
	
	int getLeavesAvl(){
		return leavesAvl;
	}
	
	int getLeavesTaken(){
		return leavesTaken;
	}	
	
	void setLeavesAvl(int leave){
		leavesAvl = leave;
	}
	void setLeaveStatus(int status){
		this.leaveStatus = status;
	}
	
	void setLeavesTaken(int taken){
		this.leavesTaken = taken;
	}
	
	int getLeaveStatus(){
		return leaveStatus;
	}
}

class LeaveManage{
	static Employee abdul = new Employee();
	Employee ansh = new Employee();
	static Scanner scan = new Scanner(System.in);
	
	
	void setApplicationStatus(String username){
		if(username.equals("abdul")){
			abdul.setLeaveStatus(2);
			leaveInfo(abdul);
		}
			
		else if(username.equals("ansh")){
			ansh.setLeaveStatus(2);
			leaveInfo(ansh);
		}
			
	}
	
	public static void leaveInfo(Employee emp){
		System.out.println("Leaves Available: "+emp.getLeavesAvl());
		System.out.println("Leaves Taken: "+emp.getLeavesTaken());					
	}
	
	public static void decision(Employee emp, int noOfDays){
		System.out.println("Enter Option:\n"
				+ "1.Approve Application\n2.Cancel Application"); 
		int dec = scan.nextInt();
		if(dec == 1){
			System.out.println("Leaves Approved");
			int leavesAvl =  emp.getLeavesAvl() - noOfDays;
			emp.setLeavesAvl(leavesAvl);
			int leavesTaken = emp.getLeavesTaken() + noOfDays;
			emp.setLeaveStatus(1);
			emp.setLeavesTaken(leavesTaken);
//			System.out.println("status: "+emp.getLeaveStatus());
		}
		else if(dec == 2){
			System.out.println("Leave Application Declined");
			emp.setLeaveStatus(-1);
		}
		
		System.out.println("1. for Logout");
		int logout = scan.nextInt();
		if(logout == 1)
			new Index().login();			
	}
	
	public int checkStatus(String username){
		
		if(username.equals("abdul qadir")){
//			System.out.println("abdul.getLeaveStatus() "+ abdul.getLeaveStatus());
			return abdul.getLeaveStatus();
		}
			
		else if(username.equals("ansh arora"))
			return ansh.getLeaveStatus();
		return -1;
	}
	
	public void manageLeave(String username, int noOfDays){
		if(username.equals("abdul")){
			leaveInfo(abdul);
			decision(abdul, noOfDays);
		}
		
		else if(username.equals("ansh")){
			leaveInfo(ansh);
			decision(ansh, noOfDays);
		}
	}
	
	
}

class RequestLeave{
	private int request ;
	private String reason = null;
	private int noOfDays = 0;
	
	int getRequest(){
		return request;
	}
	
	int getNoOfDays(){
		return noOfDays; 
	}
	
	String getReason(){
		return reason;
	}
	
	void setRequest(int request){
		this.request = request;
	}
	
	void setReason(String reason){
		this.reason = reason;
	}
	
	void setNoOfDays(int noOfDays){
		this.noOfDays = noOfDays;
	}
	
}

public class LeaveInfos {
	
	static RequestLeave abdul = new RequestLeave();
	static RequestLeave ansh = new RequestLeave();
	Scanner scan = new Scanner(System.in);
	static int leaveApplication =0;
	
	static int noOfDays;	
	
	// Called by Manager
	LeaveInfos(){
		System.out.println("Request: "+ abdul.getRequest());
//		System.out.println("Reason "+abdul.getReason());
		if(abdul.getRequest()==1){
			System.out.println("Name Of Employee: Abdul");
			System.out.println("Reason for Leave Application: "+abdul.getReason());
			System.out.println("Number of Days Of Leave: "+ abdul.getNoOfDays());					
			
			new LeaveManage().manageLeave("abdul", abdul.getNoOfDays());
		}
			
		if(ansh.getRequest() == 1){
			System.out.println("Name of Employee: Ansh");
			System.out.println("Reason for Leave Application: "+ansh.getReason());
			System.out.println("Number of Days Of Leave: "+ ansh.getNoOfDays());					
			
			new LeaveManage().manageLeave("ansh", ansh.getNoOfDays());
		}
				
	}
	
	// Called by Executive And Lead to apply for leaves
	LeaveInfos(String choice, int noOfDays, String username){
		
		leaveApplication =1;
		if(username.equals("abdul qadir")){
						
			// Set Application Status to 2(Pending)
			new LeaveManage().setApplicationStatus("abdul");
			abdul.setRequest(1);
			abdul.setReason(choice);
			abdul.setNoOfDays(noOfDays);
			System.out.println();
		}
		
		else if(username.equals("ansh arora")){
			// Set Application Status to 2(Pending)			
			new LeaveManage().setApplicationStatus("ansh");
			ansh.setRequest(1);
			ansh.setReason(choice);
			ansh.setNoOfDays(noOfDays);
		}
			
		System.out.println("Application Sent!");
		System.out.println("1. for Logout");
		int logout = scan.nextInt();
		if(logout == 1)
			new Index().login();
	}	
}
