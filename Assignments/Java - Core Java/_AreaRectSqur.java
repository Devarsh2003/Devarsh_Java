package core_java_assignment;

class PrintArea{
	//Area of rectangle
	public void Area(int a,int b) {
		System.out.println("Area of rectangle : "+(a*b));
	}
	// area of square
	public void Area(int a) {
		System.out.println("Area of square : "+(a*a));
	}
}

public class _AreaRectSqur {
public static void main(String[] args) {

	PrintArea printArea = new PrintArea();
	printArea.Area(9, 3);
	printArea.Area(5);
	
}
}
