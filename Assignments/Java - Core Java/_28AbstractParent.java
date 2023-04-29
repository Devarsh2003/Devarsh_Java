package core_java_assignment;

abstract class Parent1 {
	
	public void message() {
		
	}
	
}

class Subclass1 extends Parent1{
	public void message() {
		System.out.println("This is First Subclass");
	}
	
}

class Subclass2 extends Parent1{
	public void message() {
		System.out.println("This is Second Subclass");
	}
	
}

public class _28AbstractParent {
public static void main(String[] args) {
	Subclass1 sub1=new Subclass1();
	sub1.message();
	
	Subclass2 sub2=new Subclass2();
	sub2.message();
}
}