package week1Assignmt;
import java.util.Scanner;


class Validate{
	private String cred[][] = {{"abdul qadir", "1616"},
			{"ansh arora", "1234"},
			{"manoj sharma", "1111"}};
	boolean valid(String username, String password){
		for(int i=0; i<cred.length; i++){
			if(cred[i][0].equals(username)){						
				if(cred[i][1].equals(password)){
					InfoPage info = new InfoPage();
					System.out.println("Dseg: "+info.infoMethod(username));
					return true;
				}					
				else 
					System.out.println("Invalid Credentials");					
			}				
		}
		return false;
	}
}

public class Index {

	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Username: ");
		String username = scan.nextLine();
		System.out.print("Enter password: ");
		String password = scan.next();
		
		Validate valid = new Validate();
		boolean cond = valid.valid(username, password);		
	}
}
