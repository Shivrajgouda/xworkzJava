class Game{
int id;
String name;
enum totalPlayers{
fielders,bowlers,batsmen,keeper;}
totalPlayers t=totalPlayers.batsmen;
void play(){
System.out.println("The is been Started");
System.out.println(id);
System.out.println(name);
System.out.println(t);
}
void pause(){
	System.out.println("The is been Paused");
System.out.println(id);
System.out.println(name);
System.out.println(t);
}
void end(){
	System.out.println("The is been Ended");
	System.out.println(id);
System.out.println(name);
System.out.println(t);
}
void showInfo(){
	System.out.println("The is game INfo");
	System.out.println(id);
System.out.println(name);
System.out.println(t);
}
}
class Player{
String name;
public static void main(String[] args){
	Game g=new Game();
	g.play();
	g.pause();
	g.end();
	g.showInfo();
}}