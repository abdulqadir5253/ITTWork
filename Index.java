package week1Assignmt;
import java.util.Scanner;

class Validate{
	private String cred[][] = {{"abdul qadir", "1616"},
			{"ansh arora", "1234"},
			{"manoj sharma", "1111"}};
	boolean valide(String username, String password){
		for(int i=0; i<cred.length; i++){
			if(cred[i][0].equals(username)){						
				if(cred[i][1].equals(password)){
					InfoPage info = new InfoPage();
					System.out.println("Dseg: "+info.getDesignation(username));
					new Work(info.getDesignation(username), username);
					return true;
				}					
				else 
					System.out.println("Invalid Credentials");
					return false;
			}				
		}
		System.out.println("UserName does Not Exist");
		return false;
	}
}

public class Index {

	public void login(){
		String username = "";
		String password = "";
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Username: ");
		username = scan.nextLine();
		System.out.print("Enter password: ");				
		password = scan.nextLine();
		
		Validate valid = new Validate();
		valid.valide(username, password);
	}
	
	public static void main(String[] args) {		
		new Index().login();
	}
}
