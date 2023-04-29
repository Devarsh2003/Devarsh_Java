package core_java_assignment;

abstract class Marks {
	
	abstract void getPercentage();
}

class A extends Marks{
	float sub1, sub2, sub3;
	float per;
	public A(int sub1, int sub2, int sub3) {
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
		
	}
	@Override
	void getPercentage() {
		per=(((sub1+sub2+sub3)/300)*100);
		
		System.out.println("Percentage of Student A is : "+per);	
	}
}

class B extends Marks{
	float sub4, sub5, sub6, sub7;
	float per2;
	public B(int sub4, int sub5, int sub6, int sub7) {
		this.sub4=sub4;
		this.sub5=sub5;
		this.sub6=sub6;
		this.sub7=sub7;
	}
	
	@Override
	void getPercentage() {
		float per2=(((sub4+sub5+sub6+sub7)/400)*100);
		
		System.out.println("Percentage of Student B is : "+per2);
	}
}

public class _30Marks {
public static void main(String[] args) {
	A a=new A(89,67,59);
	a.getPercentage();
	B b=new B(89,67,59,88);
	b.getPercentage();
}
}