package core_java_assignment;

import java.util.Scanner;

public class _9ASCII {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any one character: ");
	char c = sc.next().charAt(0);
	
	int a = c;
	System.out.println("The ascii value is : "+a);
}
}
