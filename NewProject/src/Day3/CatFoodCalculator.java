package Day3;
//Create a program that will calculate how much dry
// and wet food pet owner needs for 3 cats per week.
// One cat eats 3 ounces of wet food and 2 ounces of dry food per day.
// 2 oz = 0.12lb
// 3oz = 0.19lb
// 3 cats will eat ... lb of wet food and ...lb of dry food.


public class CatFoodCalculator {

	public static void main(String[] args) {
		byte days = 7;
		short cats =7;
		String weight ="Ib";
		double dryFood = 0.12;
		double wetFood = 0.19;
		double dryFood_Per_Week = dryFood * cats*days;
		double wetFood_Per_Week = wetFood * cats*days;
		System.out.println(cats + " cats wil eat " + wetFood_Per_Week +" "+ weight +" of wet food and " + dryFood_Per_Week + " " +weight + " of dry food." );
		
		
		
		
		
		
		
		
		

	}

}
