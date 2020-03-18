package Days23Encapsulation;

public class Person {
	
	private ContectInformation contactInfo;
	private String SSN_NR;
	private String FIRST_NAME;
	private String LAST_NAME;
	private String MIDDLE_INIT;
	private String DATA_OF_BIRTH;
	private char GENDER;
	
	
	
	public String GetSsn_nr() {
		return SSN_NR;
	}
	
	public void setSsn_nr(String Ssn_nr) {
		this.SSN_NR =Ssn_nr;
	}
	
	//====================================================
	public String GetfirstName() {	
		return FIRST_NAME;
	}
	
	public void SetfirstName(String ssn) {
		this.FIRST_NAME = ssn;
	}
	
	//=====================================================
	
	
	
	public String getLastName() {
		return LAST_NAME;
	}
	
	public void SetLastName(String LastName) {
		this.LAST_NAME = LastName;
	}
	
	//================================================
	
	
	public String getMiddleI() {
		return MIDDLE_INIT;
	}
	
	public void SetmiddleIni(String middleIn) {
		this.MIDDLE_INIT = middleIn;
	}
	
	//================================================
	
	
	public String getDATA_OF_BIRTH() {
		return DATA_OF_BIRTH;
	}
	
	public void SetDataOfBirth(String DATAOFBIRTH) {
		this.DATA_OF_BIRTH = DATAOFBIRTH;
	}
	
	
	//=================================================
	
	public char getGender() {
		return GENDER;
	}
	
	public void SetGender(char gender) {
		this.GENDER = gender;
	}
	
}	
