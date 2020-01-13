package week1Assignmt;

interface impDetail{
	String getAddrs();
	String getAcctDet();
	String getContactNo();
	void setAddrs(String a);
	void setAcctDet(String a);
	void setContactNo(String a);
}

class GetDetails implements impDetail{
	private String city;
	private String accNo;
	private String contact;	
	
	public String getAddrs(){
		return city;
	}
	
	public String getAcctDet(){
		return accNo;
	}
	
	public String getContactNo(){
		return contact;
	}
	
	public void setAddrs(String city){
		this.city = city;
	}
	
	public void setAcctDet(String accNo){
		this.accNo = accNo;
	}
	
	public void setContactNo(String contact){
		this.contact = contact;
	}
}

public class InfoPage {
	SetInfo abdul = new SetInfo();
	SetInfo ansh = new SetInfo();
	SetInfo manoj = new SetInfo();
	GetDetails abdul1 = new GetDetails();
	GetDetails ansh1 = new GetDetails();
	GetDetails manoj1 = new GetDetails();
	
			
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
	
	public void getGenInfo(String username){
		
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




