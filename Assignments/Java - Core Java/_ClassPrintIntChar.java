package core_java_assignment;

class PrintInt{
	
	public void form(int a,char c) {
		System.out.println("Integer : "+a);
		System.out.println("Char : "+c);
	}
	
	public void form(char c,int a) {
		System.out.println("Char : "+c);
		System.out.println("Integer : "+a);
	}
}

public class _ClassPrintIntChar {
public static void main(String[] args) {

	PrintInt print = new PrintInt();
	print.form(46, 'D');
	print.form('A', 34);
}
}
