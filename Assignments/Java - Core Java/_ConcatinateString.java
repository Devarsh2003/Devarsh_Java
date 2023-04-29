package core_java_assignment;

import java.util.Scanner;

public class _ConcatinateString {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any string to concatinate : ");
	String name = sc.nextLine();
	
	String name2 = "Hello !!!";
	
	System.out.println(name2+" "+name);
}
}
