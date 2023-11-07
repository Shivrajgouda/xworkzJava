class Email{
String domain;
int id;
String fname;
String lastname;
Email(String domain,int id,String fname,String lastname){
this.domain=domain;
this.id=id;
this.fname=fname;
this.lastname=lastname;
	
}
int ShowInfo(String domain,int id,String fname,String lastname){
	System.out.println(domain);
System.out.println(id);
System.out.println(fname);
System.out.println(lastname);
	return 0;
}
}
class Person1{
String name;

static String showInfo(String name){
	System.out.println(name);
	Email email12=new Email("shivams",1,"john","N");
	email12.ShowInfo("shivams",1,"john","N");
	return "";
}

public static void main(String[] args){
Email email=new Email("shivams",1,"john","N");
System.out.println(email.domain);
Email email1=new Email("human",3,"carter","R");
System.out.println(email1.id);
Email email2=new Email("nova",5,"jhonson","D");
System.out.println(email2.fname);
Email email3=new Email("Sunny",7,"henry","Y");
System.out.println(email3.lastname);
Email email4=new Email("alpha",9,"parker","O");
Email[] email0={email,email1,email2,email3,email4 };
Email ref=  email0[0];	
Email ref1=  email0[1];	
Email ref2=  email0[2];
Email ref3=  email0[3];
Email ref4=  email0[4];	
System.out.println(ref.domain);
System.out.println(ref1.domain);
System.out.println(ref2.domain);
System.out.println("\n");
System.out.println(ref3.ShowInfo("suman",2,"john","N"));
System.out.println(showInfo("shivam"));

}
}
