package core_java_assignment;

import java.util.Scanner;

public class _3LeapYear {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter a year: ");
	int year = scanner.nextInt();

	if( (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ) {
		System.out.println("This year is leap year ....");
	}
	else {
		System.out.println("This year is not a leap year .....");
	}
	
	System.out.println("Natural Numbers ................");
	
	for (int i = 1; i <= 10; i++) {
		System.out.print(" "+i);
	}
	
}
}
