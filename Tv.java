class Tv{
	boolean display;
	Speaker speaker;
void display(boolean display, Speaker speaker){
	this.display=display;
	this.speaker=speaker;
	System.out.println("this is Tv's  "+display);
	if(speaker!=null)
	System.out.println("this is Tv's speaker "+speaker);	
}
}