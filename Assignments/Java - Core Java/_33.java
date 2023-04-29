package core_java_assignment;

class Shape2{
	public void print() {
		System.out.println("This is shape");
	}
}

class Rectangle2 extends Shape2{
	public void print() {
		System.out.println("This is Rectangle shape");
		super.print();
	}
}

class Circle2 extends Shape2{
	public void print() {
		System.out.println("This is Circle shape");
		super.print();
	}
}

class Square2 extends Rectangle2{
	public void print() {
		System.out.println("Square is Rectangle");
		super.print();
	}
}

public class _33 {
public static void main(String[] args) {
	Square2 s1=new Square2();
	s1.print();
	
}
}
