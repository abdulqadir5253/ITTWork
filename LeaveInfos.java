package week1Assignmt;
import java.util.Scanner;

class Employee{
	private int leavesAvl;
	private int leavesTaken;
//	private static int leaveApplication;
	private boolean leaveStatus;	
	
	
	Employee(){
		leavesAvl = 10;
		leavesTaken = 0;
		leaveStatus = false;		
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
	void setLeaveStatus(boolean status){
		leaveStatus = status;
	}
	
	boolean getLeaveStatus(){
		return leaveStatus;
	}
}

class LeaveManage{
	static Employee abdul = new Employee();
	Employee ansh = new Employee();
	static Scanner scan = new Scanner(System.in);
	
	
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
			abdul.setLeaveStatus(true);
//			System.out.println("status: "+emp.getLeaveStatus());
		}
		else if(dec == 2){
			System.out.println("Leave Application Declined");
			emp.setLeaveStatus(false);
		}
		
		System.out.println("1. for Logout");
		int logout = scan.nextInt();
		if(logout == 1)
			new Index().login();			
	}
	
	public boolean checkStatus(String username){
		
		if(username.equals("abdul qadir")){
//			System.out.println("abdul.getLeaveStatus() "+ abdul.getLeaveStatus());
			return abdul.getLeaveStatus();
		}
			
		else if(username.equals("ansh arora"))
			return ansh.getLeaveStatus();
		return false;
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

//class ExecutiveEmp{
//	Scanner scan = new Scanner(System.in);
//	static int leavesAvl = 10;
//	static int leavesTaken = 0;
//	static int leaveApplication = 0;
//	static boolean leaveStatus = false;
//	static String reason ;
//	void grant(int leaves){
//		leaveApplication = 0;
//		System.out.println("Reason for Leave: "+reason);
//		System.out.println("Number Of Days of Leave: "+leaves);
//		System.out.println("Leaves Available for Employee: "+leavesAvl);
//		System.out.println("Enter option:\n1.Approve Leaves\n2.Do not Approve");
//		int decsion = scan.nextInt();
//		if(decsion == 1){			
//			System.out.println("Leaves Approved");
//			leaveStatus = true;
//			System.out.println("Press 1 for Logout");
//			int co = scan.nextInt();
//			if(co == 1)
//				new Index().login();			
//		}
//		else{
//			System.out.println("Leaves Not Approved");
//			leaveStatus = false;
//			System.out.println("Press 1 for Logout");			
//			int co = scan.nextInt();
//			if(co == 1)
//				new Index().login();
//			
//		}			
//	}
//	
//	int checkLeaves(){
//		return leavesAvl;
//	}
//	
//}

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
		System.out.println("Reason "+abdul.getReason());
		if(abdul.getRequest()==1){
			System.out.println("Reason for Leave Application: "+abdul.getReason());
			System.out.println("Number of Days Of Leave: "+ abdul.getNoOfDays());
			new LeaveManage().manageLeave("abdul", abdul.getNoOfDays());
		}
			
		if(ansh.getRequest() == 1){
			System.out.println("Reason for Leave Application: "+ansh.getReason());
			System.out.println("Number of Days Of Leave: "+ ansh.getNoOfDays());
			new LeaveManage().manageLeave("ansh", ansh.getNoOfDays());
		}
		
//		ExecutiveEmp emp = new ExecutiveEmp();
//		emp.grant(noOfDays);			
		
	}
	
	// Called by Executive And Lead
	LeaveInfos(String choice, int noOfDays, String username){
		
		leaveApplication =1;
		if(username.equals("abdul qadir")){
						
			System.out.println("Request set 1");
			abdul.setRequest(1);
			abdul.setReason(choice);
			abdul.setNoOfDays(noOfDays);
		}
		
		else if(username.equals("ansh arora")){
			ansh.setRequest(1);
			ansh.setReason(choice);
			ansh.setNoOfDays(noOfDays);
		}
			
		
		
//		LeaveManage manang = new LeaveManage();
//		manang.manageLeave(choice, noOfDays, username);
//		this.noOfDays = noOfDays;
//		
//		ExecutiveEmp emp = new ExecutiveEmp();
//		emp.leaveApplication = 1;
//		emp.reason = choice;
		System.out.println("Application Sent!");
		System.out.println("1. for Logout");
		int logout = scan.nextInt();
		if(logout == 1)
			new Index().login();
	}	
}
