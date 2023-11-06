class Tent{
int slno;
enum Color {RED,GREEN;}
int width;
int height;
Color c1=Color.GREEN;
boolean open(Tent tent){	
System.out.println(slno);
System.out.println(c1);
System.out.println(width);
System.out.println(height);
if(tent!=null)
System.out.println("class Tent"+tent);	
return false;
}
boolean close(Tent tent){
System.out.println(slno);
System.out.println(c1);
System.out.println(width);
System.out.println(height);
if(tent!=null)
System.out.println("class Tent"+tent);	
return false;
}
void ShowDisplay(){
System.out.println(slno);
System.out.println(c1);
System.out.println(width);
System.out.println(height);
System.out.println("class Tent");		
}
}
class Agent{
	int id;
	String name;
	Tent tent;
public static void main(String[] args){
	
Tent tent = new Tent();
tent.open(tent);	
tent.close(tent);
}
}