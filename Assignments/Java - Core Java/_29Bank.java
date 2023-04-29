package core_java_assignment;

abstract class Bank {
	abstract void getBalance();
}

class BankA extends Bank{

	int balance = 100;
	@Override
	void getBalance() {
		
		System.out.println("Balance of BankA : "+balance);
	}
	
}

class BankB extends Bank{

	int balance = 150;
	@Override
	void getBalance() {
		
		System.out.println("Balance of BankB : "+balance);
	}
	
}

class BankC extends Bank{

	int balance = 200;
	@Override
	void getBalance() {
		
		System.out.println("Balance of BankC : "+balance);
	}
	
}

public class _29Bank {
public static void main(String[] args) {
	BankA b1=new BankA();
	b1.getBalance();
	
	BankB b2=new BankB();
	b2.getBalance();
	
	BankC b3=new BankC();
	b3.getBalance();
}
}
