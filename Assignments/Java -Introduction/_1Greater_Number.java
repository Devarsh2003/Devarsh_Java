package core_java_assignment;

import java.util.Scanner;

public class _1Greater_Number {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter A: ");
	int a = sc.nextInt();
	System.out.println("Enter B: ");
	int b = sc.nextInt();
	System.out.println("Enter C: ");
	int c = sc.nextInt();
	
	
	if (a>b) {
		if (a>c) {
			System.out.println("A is greater.....");
		}else {
			System.out.println("C is greater.....");
		}
	}else {
		if (b>c) {
			System.out.println("B is greater.....");
		}else {
			System.out.println("C is greater.....");
		}
	}
	
}
}
