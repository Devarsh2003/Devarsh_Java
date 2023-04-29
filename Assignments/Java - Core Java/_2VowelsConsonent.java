package core_java_assignment;

import java.util.Scanner;

public class _2VowelsConsonent {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter any character : ");
	char c = sc.next().charAt(0);
	
	switch (c) {
	case 'A':
	case 'E':
	case 'I':
	case 'O':
	case 'U':
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
		System.out.println("Your character is VOWEL.....");
		break;

	default:
		System.out.println("Invalid input!!!!!");
		break;
	}
	
}
}
