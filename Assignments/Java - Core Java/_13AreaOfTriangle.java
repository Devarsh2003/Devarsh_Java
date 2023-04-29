package core_java_assignment;

class Triangle{
	
	int l1=3;
	int l2=4;
	int l3=5;
	int h=2;
	
	public Triangle() {
		System.out.println("Area of triangle : "+(h*l2)/2);
		System.out.println("Perimeter of triangle : "+(l1+l2+l3));
	}
}

public class _13AreaOfTriangle {
public static void main(String[] args) {
	
	Triangle triangle = new Triangle();
}
}