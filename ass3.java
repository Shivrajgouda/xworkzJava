import java.util.*;
class Account{
protected String accNo;
protected double balance;
protected String accHolderName;
	Account(String accNo,double balance, String accHolderName){
		this.accNo=accNo;
		this.balance=balance;
		this.accHolderName=accHolderName;
}
}
class SavingAccount extends Account{
	protected double minBalance;
	SavingAccount(String accNo,double balance, String accHolderName,double minBalance){
		super(accNo,balance,accHolderName);
		this.minBalance=minBalance;
	}
}
class FixedAcc extends SavingAccount{
	private int lockingPeriod;
	FixedAcc(String accNo,double balance, String accHolderName,double minBalance,int lockingPeriod){
		super(accNo,balance,accHolderName,minBalance);
		this.lockingPeriod=lockingPeriod;
	} 
	void dis(){
	System.out.format("%-10s %-10s %-10s %-10s %s\n","AccNo","Balance","accHolderName","minBalance","lockingPeriod");
	System.out.print(accNo+"        ");
	System.out.print(balance+"        ");	
	System.out.print(accHolderName+"        ");	
	System.out.print(minBalance+"        ");	
	System.out.print(lockingPeriod+"        ");	
	} 
}
class ass3{
public static void main(String[] args){
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Acc details");
	String accNo=sc.nextLine();
	double balance=sc.nextDouble();
	sc.nextLine();
	String accHolderName=sc.nextLine();
	double minBalance =sc.nextDouble();
	sc.nextLine();
	int lockingPeriod=sc.nextInt();
	FixedAcc f=new FixedAcc(accNo,balance,accHolderName,minBalance,lockingPeriod);
	System.out.println(" Acc details : ");
	f.dis();
}
}