package Days23Encapsulation;

public class A {
	static int num;
	
//	public A (int num) {
//		A.num = num; // this.this current object
		
	// Because an object can access static variables,
	// this.num is working where this. means current object
	// and num is a static variables.
			
	//============================================
		
	// Method OverLoading: When 2 methods with same exact name but different arguments.
	// How to achieve overLoading:
	// -> by changin arguments count
	//--> by changing arguments type
	
	// when we overload the implementation/ body of the method can be differnt 
	// return type: can be different , does not matter.
	
	// When we overload method name must be same, but method signature must be different.s
	
	// public boolean enroll ( int countOfStudent){} -- > enroll(int)
	// public void enroll(int countOFStudent, int 
 		
		String nama;
		static int numberOfStudent;
		boolean openForEnrollent;
		
		public boolean enroll(int countOfStudents) {
			if(numberOfStudent + countOfStudents > 100) {
				return false;
			}
			numberOfStudent +=countOfStudents;
			return true;
		}
		
	
		
	
		public void enroll(int countOfStudents, String term) {
			System.out.println("Enrolling  to : " + term);
			numberOfStudent += countOfStudents;
		}
		
		public void enroll (boolean open) {
			openForEnrollent = open;
			if(open) {
				System.out.println("Enrolling students");
			}else {
				System.out.println("Enrolling is closed");
			}
		}
		

//	}
}
