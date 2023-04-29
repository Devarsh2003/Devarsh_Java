package core_java_assignment;

class Member{
	String nameString ="Devarsh";
	int age = 19;
	long PhNo = 1234567890;
	String addr = "Surat";
	int salary = 25000;
	
	public void printSalary() {
		System.out.println("Salary : "+salary);
	}
}

public class _ClassMember {
public static void main(String[] args) {
	Member member = new Member();
	member.printSalary(); 
	
}
}
