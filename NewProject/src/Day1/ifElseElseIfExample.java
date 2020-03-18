package Day1;

public class ifElseElseIfExample {


	public static void main(String[] args) {
		
		/*
		 * Precedence of logical operators
		 * ! is evaluated first
		 * && is evaluated second 
		 * || is valuated third
		 * 
		 */
//		int value1 = 10;
//        int value2 = 20;
//        int value3= 30;
//        				//  True				// True        // retured value is True
//        boolean result1 = value2>value1   &&   value2<value3;
//        System. out .println( "value2>value1   &&   value2<value3 - result1 is " +result1);
//        				// False				// True			// retured value is False
//        boolean result2 = value2<value1   &&   value2<value3;
//        System. out .println( "value2<value1   &&   value2<value3 - result2 is " +result2);
//        				// True					// False		//// retured value is False
//        boolean result3 = value2>value1   &&   value2>value3;
//        System. out .println( "value2>value1   &&   value2>value3 - result3 is " +result3);
//        				// False				// False		// False
//        boolean result4 = value2<value1   &&   value2>value3;
//        System. out .println( "value2<value1   &&   value2>value3 - result4 is " +result4);
//		
//        //2. Logical OR operator
//        System. out .println( "***********Logical OR Operator Examples**************" );
//        		// True					// True			// Retured value is True
//        result1 = value2>value1   ||   value2<value3;
//        System. out .println( "value2>value1   ||   value2<value3 - result1 is " +result1);
//        			// False			// True			// Retured value is True
//        result2 = value2<value1   ||   value2<value3;
//        System. out .println( "value2<value1   ||   value2<value3 - result2 is " +result2);
//        			// True				// False		// Retured value is True
//        result3 = value2>value1   ||   value2>value3;
//        System. out .println( "value2>value1   ||   value2>value3 - result3 is " +result3);
//        			//False				// False		// Retured value is False
//        result4 = value2<value1   ||   value2>value3;
//        System. out .println( "value2<value1   ||   value2>value3 - result4 is " +result4);
 
        
        int day = 2;
        String dayType;
        String dayString;
         
        switch (day) 
        {
            case 1:  dayString = "Monday";
            		
                     break;
            case 2:  dayString = "Tuesday";
                     break;
            case 3:  dayString = "Wednesday";
                     break;
            case 4:  dayString = "Thursday";
                     break;
            case 5:  dayString = "Friday";
                     break;
            case 6:  dayString = "Saturday";
                     break;
            case 7:  dayString = "Sunday";
                     break;
            default: dayString = "Invalid day";
        }
        
        switch (day) 
        {
          //multiple cases without break statements 
         
            case 1:  
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = "Weekday";
                break;
            case 6:
            case 7:
                dayType = "Weekend"; 
                break;
                 
            default: dayType= "Invalid daytype";
        }
         
        System.out.println(dayString+" is a "+ dayType);
    }
}

	


