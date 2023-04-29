package core_java_assignment;

import java.util.Scanner;

public class _12CharPosition {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the sentance : ");
	String n = scanner.nextLine();
	System.out.println("enter the position you want to know : ");
	int p = scanner.nextInt();
	System.out.println("the entered postion's char is : "+n.charAt(p));
}
}
