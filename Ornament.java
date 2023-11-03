class Clock{
String time;
double cost;
boolean working;
String brand="titan";
Clock(){
super();
System.out.println("this is super");
}
Clock(String time){
super();
this.time=time;
System.out.println(time);
}
Clock(String time,double cost){
super();
this.time=time;
this.cost=cost;
System.out.println(time);
System.out.println(cost);
}
Clock(String time,double cost,boolean working){
super();
this.time=time;
this.cost=cost;
this.working=working;
System.out.println(time);
System.out.println(cost);
System.out.println(working);
}
}
class Rocket{
	String name;
	int wheels;
	double engine;
	int seats;
	int wings;
Rocket(String name){
	super();
	this.name=name;
	System.out.println(name);
}
Rocket(String name,int wheels){
	super();
	this.name=name;
	this.wheels=wheels;
	System.out.println(name);
	System.out.println(wheels);
}
Rocket(String name,int wheels,double engine){
	super();
	this.name=name;
	this.wheels=wheels;
	this.engine=engine;
	System.out.println(name);
	System.out.println(wheels);
	System.out.println(engine);
}
}
class MakeUpKit{
	int items;
	String brand;
	double cost;
	MakeUpKit(String brand){
		super();
		this.brand=brand;
		System.out.println(brand);
		
	}
	MakeUpKit(int items,String brand,double cost){
		super();
		this.items=items;
		this.brand=brand;
		this.cost=cost;
		System.out.println(items);
		System.out.println(brand);
				System.out.println(cost);
	}
	MakeUpKit(int items,String brand){
		super();
	this.items=items;
		this.brand=brand;
		System.out.println(items);
		System.out.println(brand);
		
	}

}
class Ornament{
	public static void main(String[] args){
		Clock clock=new Clock("3pm");
	    Clock clock1=new Clock("3pm",200);
		Clock clock2=new Clock("3pm",200,true);
		Rocket rocket=new Rocket("r1");
		Rocket rocket1=new Rocket("r1",3);
		Rocket rocket2=new Rocket("r1",3,333);
		MakeUpKit makeup=new MakeUpKit("loreal");
				MakeUpKit makeup1=new MakeUpKit(3,"loreal",345);
				MakeUpKit makeup2=new MakeUpKit(3,"loreal");
		
	}
}