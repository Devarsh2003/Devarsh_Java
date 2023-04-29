package core_java_assignment;

class Rectangle{
	int length;
	int breadth;
	
	public Rectangle(int length ,int breadth) {
		this.length = length;
		this.breadth = breadth;	
	}
	
	public void Area() {
		System.out.println("Area of rectangle : "+length*breadth);
	}
	
	public void Perimeter() {
		System.out.println("Perimeter of rectangle : "+2*(length+breadth));
	}	
}

class Square extends Rectangle{
	
	public Square(int length) {
		super(5,10);
	}
	
	public void Area() {
		System.out.println("Area of Square : "+length*length);
	}
	
	public void Perimeter() {
		System.out.println("Perimeter of Aquare : "+4*length);
	}
}

public class _ClassRectangleSuper {
public static void main(String[] args) {
	
	Rectangle rectangle = new Rectangle(5,10);
	rectangle.Area();
	rectangle.Perimeter();
	
	Square square = new Square(4);
	square.Area();
	square.Perimeter();
	
}
}