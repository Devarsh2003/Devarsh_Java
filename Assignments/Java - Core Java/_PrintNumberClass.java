package core_java_assignment;

class PrintNumber{
	
	public void printn(int a) {
		System.out.println("Integer : "+a);
	}
	
	public void printn(long b) {
		System.out.println("Long : "+b);
	}

	public void printn(float c) {
		System.out.println("Float : "+c);
	}

	public void printn(double d) {
		System.out.println("Double : "+d);
	}
	
}

public class _PrintNumberClass {
public static void main(String[] args) {
	
	PrintNumber print = new PrintNumber();
	
	print.printn(123432);
	print.printn(1232435465);
	print.printn(56.67);
	print.printn(6765.8463435);	
}
}