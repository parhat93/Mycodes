package Days13;

public class ForloopBreak {

	public static void main(String[] args) {
		
		// 
		for (int i = 0; i < 11; i++) {
			System.out.print(i+ " ");
			if(i==10) {
				break;
			}
			
		}
System.out.println("=============================");
		for(int i = 10; i>0;i--) {
			System.out.print(i + " ");
			if(i==7) {
				break;
			}
		}
		
		
	}

}
