class Printer{
double price;
String Brand;
String Type;
Printer(){
	this(13000);
	System.out.println("default constructor");
}
Printer(double price){
	this.price=price;
	System.out.println("single parameterised constructor "+price);
}
}
class Helmet{
double rating;
String Brand;
double price;
String quality;
Helmet(){
	this(2.3,"R1",2000);
	System.out.println("default constructor");
   
}
Helmet(double rating,String Brand,double price ){
	this.rating=rating;
	this.Brand=Brand;
	this.price=price;
	System.out.println("Helmet class parameterised constructor"+rating+" "+Brand+" "+price);
	
}
}
class Bracelet{
	int quantity;
	double cost;
	String color;
	
Bracelet(){
	this.quantity=quantity;
	this.cost=cost;
	this.color=color;
	
System.out.println("Bracelet class default constructor"+quantity+" "+cost+" "+color);
}
Bracelet(int quantity,double cost,String color){
	this();

	
	System.out.println("Bracelet class parameterised constructor");
}
}
class Carrom{
	String brand;
    int coins;
    int players;
Carrom(){
this.brand=brand;
this.coins=coins;
this.players=players;
System.out.println("Carrom default constructor "+brand+" "+coins+" "+players);	
}
Carrom(String brand,int coins,int players){
  this();
  System.out.println("Carrom class parameterised constructor");
	
}
public static void main(String[] args){
	Carrom carrom=new Carrom();
	Carrom carrom1=new Carrom("R6",35,3);
	
	Bracelet bracelet=new Bracelet();
	Bracelet bracelet1=new Bracelet(1,2,"green");

    Helmet helmet=new Helmet();

    Printer pinter=new Printer();	
	
	
}
}