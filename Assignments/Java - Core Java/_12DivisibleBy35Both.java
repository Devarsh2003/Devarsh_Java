package core_java_assignment;

public class _12DivisibleBy35Both {
public static void main(String[] args) {
	
	for (int i = 1; i <=100 ; i++) {
		if ((i%3==0)||(i%5==0)||((i%3==0)&&(i/5==0))) {
			System.out.println(i);
		}
	}
}
}
