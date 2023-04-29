package core_java_assignment;

import java.util.Scanner;

public class _4SumAndAvg {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	int arr[] = new int[5];
	
	System.out.println("Enter any 5 numbers to get sum and avg : ");
	
	for (int i = 0; i < arr.length; i++) {
		arr[i]=scanner.nextInt();
	}
	int s=0;
	for(int a=0;a<arr.length;a++) {
	//	s+=arr[a];
		s=s+arr[a];
	}
	System.out.println("Sum of 5 numbers : "+s);
	
	int n=0;
	n=s/5;
	System.out.println("Average of 5 numbers : "+n);
}
}
