package Days23Encapsulation;

public class Company {

	public static void main(String[] args) {
		Person person1 = new Person();
		
		person1.setSsn_nr("231-13-2313");
		person1.SetfirstName("Peter");
		person1.SetLastName("John");
		person1.SetmiddleIni("uyghur");
		person1.SetDataOfBirth("01/06/2018");
		person1.SetGender('M');
		
		System.out.println("Name:" + person1.GetfirstName()+" " +person1.getMiddleI() + " "+ person1.getLastName()+"\n"+
				"SSN:" + person1.GetSsn_nr()+"\n"+
				"Data Of Birth:" + person1.getDATA_OF_BIRTH()+"\n"+
				"Gender:" + person1.getGender());
		
		ContectInformation contactInfo = new ContectInformation();
		contactInfo.setEmail("po4422@gmail.com");
		contactInfo.setCell_Phone("2403867631");
		
		System.out.println("Email:" +contactInfo.GetEmail()+ "\n"+
						   "Phone Number:" + contactInfo.getCell_Phone());
		
		
		
		
		ContectInformation contactInfo2 = new ContectInformation("billClinton@gmail.com","230413412");
		
		System.out.println("Email:" + contactInfo2.GetEmail()+ "\n" + 
						   "phone number:" + contactInfo2.getCell_Phone());
		
		
		// we changed the phonne number
		contactInfo2.setCell_Phone("4124124214");
		
		System.out.println("Email:" + contactInfo2.GetEmail()+ "\n" + 
				   "phone number:" + contactInfo2.getCell_Phone());
		
		
		
		
	}

}
