
public class Triangle extends GeometricObject {
private double side1 = 1.0;
private double side2 = 1.0;
private double side3 = 1.0;
	public Triangle() {}
	// this method sets up the triangle's sides
	public Triangle (double side1, double side2, double side3)
	{this.side1=side1; this.side2=side2; this.side3=side3;}
	
	public double setside1() {return side1;}
	public double setside2() {return side2;}
	public double setside3() {return side3;}
	public void setside1(double side1) {this.side1 = side1;}
	public void setside2(double side2) {this.side2 = side2;}
	
	// these methods calculate area and perimeter
	public double getArea() {return (side1+side2+side3)/2;}
	public double getPerimeter() {return (side1+side2+side3);}
	
	// this method returns a literal discription of the triangle
	public String toString() {return "Side 1 = " + side1 + "Side 2 = " + side2 + "Side 3 = " + side3; }
	

}
