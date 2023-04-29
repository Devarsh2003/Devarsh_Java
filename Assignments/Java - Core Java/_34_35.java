package core_java_assignment;

import java.util.Scanner;

public class _34_35 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Below please enter number to perform division !!!");
	System.out.print("Enter the number 1 : ");
	float a=sc.nextInt();
	System.out.print("Enter the number 2 : ");
	float b=sc.nextInt();
	
	try {
		float c=a/b;
		
		System.out.println("The division of "+(int)a+" and "+(int)b+" is : "+c);
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}