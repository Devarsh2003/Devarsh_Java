package core_java_assignment;

import java.util.Scanner;

public class _31Factorial {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int num = 5;
	System.out.print("Enter the number you want to make factorial of : ");
	num = scanner.nextInt();
	int fact = 1;
	for (int i = 1; i < num; i++) {
		fact = fact*i;
	}
	System.out.println("The factorial of "+num+" is : "+fact);
}
}