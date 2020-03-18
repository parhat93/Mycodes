package Days23Encapsulation;

public class ContectInformation {

	private String CELL_PHONE;
	private String EMAIL;
	
	
	
	// this is contructor 
	public ContectInformation() {
		
	}
	
	public ContectInformation(String email, String phone_number) {
	//	this.EMAIL = email;
	//	this.CELL_PHONE = phone_number;
		setEmail(email);
		setCell_Phone(phone_number);
	}
	
	
	
	//===========================================
	public String getCell_Phone() {
		return CELL_PHONE;
	}
	
	public void setCell_Phone(String cell_phone) {
		this.CELL_PHONE =cell_phone;
	}
	
	
	//============================================
	
	public String GetEmail() {
		return EMAIL;
	}
	
	public void setEmail(String email) {
		this.EMAIL =email;
	}
}
