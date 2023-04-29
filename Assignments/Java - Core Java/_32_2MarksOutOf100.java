package core_java_assignment;

import java.util.Scanner;

class Marks2{
	public void getMarks() {
		int marks;
		System.out.print("Enter the marks out of 100 : ");
		Scanner scanner=new Scanner(System.in);
		marks = scanner.nextInt();
		if (marks>100) {
			System.out.println("Marks cannot be above 100 !!!");
		}
		else if (marks>90) {
			System.out.println("Your grade is 'A' ");
		}
		else if (marks>80) {
			System.out.println("Your grade is 'B' ");
		}
		else if (marks>70) {
			System.out.println("Your grade is 'C' ");
		}
		else if (marks>50) {
			System.out.println("Your grade is 'D' ");
		}
		else if (marks<50) {
			System.out.println("Your grade is 'FAIL !!!' ");
		}
	}
}

public class _32_2MarksOutOf100 {
public static void main(String[] args) {
	Marks2 marks=new Marks2();
	marks.getMarks();
}
}
