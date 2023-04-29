package core_java_assignment;

import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class _7ReadIntegers {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter an integer number : ");
	int num = sc.nextInt();
	
	int count = 0;
	
	do {num=num/10;
		count++;
	} while (num >= 1);
	
//	 while (num >=1){
//		num=num/10;
//		count++;
//	}
	
	System.out.println("the integer is of "+count+" digits!!!");
}
}
