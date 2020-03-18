package Day8;

// JDK--> JRE-->JVM
// JDK --> JAVA development kit. Required to develop java programs
// JRE --> JAVA runtime Environment. Requirement  

//  this is comment until end of like, also known as single line comment
//=====================================================================
/* multiple line comment

 */
//======================================================

/**
 * JAVADoc multiple-line comment
 * 
 * @author Osman
 * 
 *         if you are writing a code that will be used by other developers ex:
 *         String class. you should add JavaDoc comments:
 */

public class IntroductionOfJAVA {

	public static void main(String[]args) {
// 
		String name = /* name */ "abby";
		// String name1 = // "abby";
		String name2 = "/* name */ abby";	

		System.out.println(name2);
		
		String good = "First line"+
					  "second line"+
					  "third line";
		System.out.println(good);
		
		// in the String 
		// \n->new line
		// \t->tab
		// \s->space
	
		String stars = "*****\n*****\n*****\n*****\n";
		System.out.println(stars);
		
		String java = " java is \"fun\"!";
		System.out.println(java);
		
		int[] numbers =new int[3];
		
		
		
		
		
		
		// / --> math operator. if it comes between numbers
		// --> single line comment
		// \ --> escape Character. \". 
		
		
		
		
		
		
		
	}

}
