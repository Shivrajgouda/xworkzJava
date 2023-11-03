class keyboard{
String brand;
String color;
int noOfKeys=3;
boolean type;
double cost;
keyboard(){
}
}
class MatchBox{
	String brand;
	int size;
	double length;
	double cost;
MatchBox(String name){
	this.brand=brand;
	System.out.println(name);
}
MatchBox(String name,int size){
this.brand=brand;
this.size=size;
	System.out.println(name);	
    System.out.println(name);
}
MatchBox(String name,int size,double length){
this.brand=brand;
this.size=size;
this.length=length;
	System.out.println(name);	
    System.out.println(size);
	System.out.println(length);
}
}
class Showroom{
	String name;
	String location;
	int phno;
	String pincode;
	int employees;
Showroom(String name){
	this.name=name;
	System.out.println(name);
}
Showroom(String name,String location ){
	this .name=name;
	this.location=location;
	System.out.println(name);
	System.out.println(location);
}
Showroom(String name,String location,int phno ){
	this.name=name;
	this.location=location;
	this.phno=phno;
	System.out.println(name);
	System.out.println(location);
	System.out.println(phno);
}
Showroom(String name,String location,int phno,String pincode ){
	this.name=name;
	this.location=location;
	this.phno=phno;
	this.pincode=pincode;
	System.out.println(name);
		System.out.println(location);
			System.out.println(phno);
				System.out.println(pincode);
}
public static void main(String[] args){
	keyboard key = new keyboard();
	Showroom s1 = new Showroom("shiv","h");
	Showroom s2 = new Showroom("shiv");
	Showroom s3 = new Showroom("shiv","h",934);
	Showroom s4 = new Showroom("shiv","h",946,"sdyy3344");
	System.out.println();
	MatchBox matchBox = new MatchBox("king");
	MatchBox matchBox1 = new MatchBox("king",2);
	MatchBox matchBox2= new MatchBox("king",2,3);
	
	//keyboard();
    //showroom.Showroom("shiv");
}
}