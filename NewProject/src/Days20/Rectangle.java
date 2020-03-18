package Days20;

public class Rectangle {
	double width;
	double hight;
	String color;
	
	public Rectangle() {
		System.out.println("no argument Constructor");
	}
	
	public Rectangle(double width,double hight) {
		this(); // this method calls another construction
		this.width = width;
		this.hight = hight;
		System.out.println("this is from 2 arg Con:" 
		+ width + " and " + hight);
	}	
	
	public Rectangle(double width,double hight,String color) {
		this(width,hight); // we just call ohter constroctor on the top
						  // and assigned the width, and hight
		this.color = color;
		System.out.println("this is from 2 arg Con:" 
				+ width + " and " + hight + " color" + color);
		
	}
}
