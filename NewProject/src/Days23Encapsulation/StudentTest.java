package Days23Encapsulation;

public class StudentTest {

	public static void main(String[] args) {
		
		Student student = new Student();
		//  student.ssn = "123-231-312"; // not visable here as ssn is a private variable
	//	student.ssn = "123-31-3123";
	//	System.out.println(student.ssn);
		student.setSsn("165446516");
		
		System.out.println(student.getSsn());
		
	}

}
