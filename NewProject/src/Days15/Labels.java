package Days15;

public class Labels {

	public static void main(String[] args) {
		
		
	CONSTRUCTION:
		for(int i =1; i<=5;i++) {
				for(int j = 1; j<=7;j++) {
					if(j == 3) {
					break;
					
				}
				
				System.out.print(j);
					
						
					}
										
				}
	
	System.out.println(" ");
	int i =0;
	OUTER:
		while(i <=3) {
			
			while(i<2) {
				System.out.println(i);
				break OUTER;
			}
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
			}
	}