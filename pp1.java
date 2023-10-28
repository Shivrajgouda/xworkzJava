class pp1{
	static String movie = "leo";
static String booktickets(String movie, String n){
	if(movie == "" ){
		int total = Integer.parseInt(n);
		
		
	System.out.println("provide movie name");
	if(total<=0){
			System.out.println(" number should be greater than 0");
		String s=String.valueOf(total);
		return s;
		}
		
	else{
	//	boolean quantity=true;
	//	BookMyShow(quantity);
		
	}
		
	
	return (movie);
	}
	else{
		if(movie=="leo"){
			int a=250;
			int quantity = Integer.parseInt(n);
		//int mvn = Integer.parseInt(movie);
		purchaseInAdvance( quantity);
		String ab = movie;
		provideTotal(a,quantity);
	return ab; 	
			
			
		}
		else if(movie=="Ghost"){
			int b=100;
			int quantity = Integer.parseInt(n);
		int mvn = Integer.parseInt(movie);
		purchaseInAdvance( quantity);
		String ab = movie;
		provideTotal(b,quantity);
	return ab; 
			
		}
		
		/*int quantity = Integer.parseInt(n);
		int mvn = Integer.parseInt(movie);
		purchaseInAdvance(mvn, quantity);
		String ab = movie;*/
		else{
		System.out.println("entered wrong moviename");
		return "hi";
		}	
	}
	
	
	
}

static boolean BookMyShow(boolean quantity){
	if(quantity){
		System.out.println("booked sucessfully for  seats");
		
		return true;
	}
	else{
		return false;
	}
	
}

static int purchaseInAdvance(int quantity){
	//String s=String.valueOf(mvn);
	System.out.println("you have booked in advance for " +movie+" for "+quantity+ " tickets");
	if (quantity>0){
	boolean ticket=true;
	BookMyShow(ticket);
	}
	return 0;
}

static int provideTotal(int n, int quantity){
	if(n==250){
		int total=n*quantity;
		System.out.println("tickets total amount is " +total);
		return 0;
	}
	if(n==100){
		int total=n*quantity;
		System.out.println("tickets total amount is " +total);
		return 0;
	}
	return 0;
}
public static void main(String[] args){
	booktickets(movie,"0");
	System.out.print("");
	
}
}