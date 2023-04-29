package core_java_assignment;
abstract class Shape{
	public abstract void RectangleArea(int length, int breadth);
	public abstract void SquareArea(int side);
	public abstract void CircleArea(int radius);

}

class Area extends Shape{
	@Override
	public void RectangleArea(int length, int breadth) {
		System.out.println("Area of Rectangle is : "+(breadth*length));
	}
	@Override
	public void SquareArea(int side) {
		System.out.println("Area of Square is : "+(side*side));
	}
	@Override
	public void CircleArea(int radius) {
		System.out.println("Area of Circle is : "+(3.14*(radius*radius)));
	}
}
	
public class _32 {
public static void main(String[] args) {
	Area area=new Area();
	area.RectangleArea(12, 5);
	area.SquareArea(6);
	area.CircleArea(7);
}
}