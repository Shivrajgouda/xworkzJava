import java.util.Scanner;
class account{
	private String accName;
	private String accNo;
	private String bankName;
	
	public account(String accName,String accNo,String bankName){
		this.accName=accName;
		this.accNo=accNo;
		this.bankName=bankName;
	}
	public String getaccNo(){
		return accNo;
	}
	
	public String getaccName(){
		return accName;
	}
	public String getbankName(){
		return bankName;
	}
	 void display(){
		 System.out.println(accName);
		  System.out.println(accNo);
		   System.out.println(bankName);
	 }
}
class currentAccount extends account{
	private String tinNumber;
	currentAccount(String accName,String accNo,String bankName,String tinNumber){
		super(accName,accNo,bankName);
		this.tinNumber=tinNumber;
	}
	void display(){
		 System.out.println("TinNumber : "+tinNumber);	 
	 }
}
class SavingsAccount extends account{
	private String orgName;
	
	SavingsAccount(String accName,String accNo,String bankName,String orgName){
		super(accName,accNo,bankName);
		this.orgName=orgName;
	}
	void display(){
		 System.out.println("OrgName : "+orgName);
	 }
}
class driver{
  void hasA(account a){
	   System.out.println("accName : "+a.getaccName());
	   System.out.println("accNo : "+a.getaccNo());
	   System.out.println("bankName : "+a.getbankName());
	   a.display();
  }	
}

class Artic{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		account a=new account( "jack","123","sbi");
		driver d =new driver();
		System.out.println("Enter 1 for Current Acc   2 for savings Acc");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter values in comma separated manner");
		String u="";
		u=sc.nextLine();
		String[] val=u.split(",");
		String accName=val[0] ;
		String accNo=val[1] ;
		String bankName=val[2] ;
			
		if(n==1){
		//System.out.println("Enter Tinnumber");
		String tinNumber=val[3];
		currentAccount ca=new currentAccount(accName,accNo,bankName,tinNumber);
		d.hasA(ca);		
		}
		else if(n==2){
			//System.out.println("Enter OrgName");
		String orgName=val[3];
		SavingsAccount sa=new SavingsAccount(accName,accNo,bankName,orgName);
		d.hasA(sa);
        
		}
	}
}





















