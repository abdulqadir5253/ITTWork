package week1Assignmt;

public class InfoPage {
	SetInfo abdul = new SetInfo();
	SetInfo ansh = new SetInfo();
	SetInfo manoj = new SetInfo();	
			
	public String infoMethod(String username){
		abdul.setDseg("Executive");
		ansh.setDseg("Technical Lead");
		manoj.setDseg("Manager");
		
		if(username.equals("abdul qadir"))
			 return abdul.getDseg();
		else if(username.equals("manoj sharma"))
			return manoj.getDseg();
		else 
			return ansh.getDseg();			
	}		
}

class SetInfo{
	private String dseg;
	
	public void setDseg(String dseg){
		this.dseg = dseg;		
	}
	
	public String getDseg(){
		return dseg;
	}
}




