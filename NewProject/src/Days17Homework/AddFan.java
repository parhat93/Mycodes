package Days17Homework;
//Given an array:
/*
String names[]={"Erick","Lisa","Hose","Roger","Nina","Ekaterina","Peter","Sara"};
Create another array named namesWithFan that 
will contain all the elements of the array 
names with letters"fan"at the end of each name
Use loop to go through each name in the
 array and add letters"fan"
Store new values in the new array
 named namesWithFan.
Your new array will contain the following elements:
"Erickfan","Lisafan","Hosefan","Rogerfan","Ninafan","Ekaterinafan","Peterfan","Sarafan"
*/
public class AddFan {

	public static void main(String[] args) {
		String names[]={"Erick","Lisa","Hose","Roger","Nina","Ekaterina","Peter","Sara"};
		String addFan= "fan";
		for(String n : names) {
		
		String [] withFan= {n + addFan};
		System.out.println(withFan[0]);
		
	}
	}
}
