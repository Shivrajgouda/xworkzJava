import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
class Event{
	private String Name;
	private String details;
	private String type;
	private String ownerName;
	private String costPerDay;
	Event(String Name,String details,String type,String ownerName,String costPerDay){
		this.Name=Name;
		this.details=details;
		this.type=type;
		this.ownerName=ownerName;
		this.costPerDay=costPerDay;
		//System.out.println(Integer.parseInt(costPerDay));
	}
	public String getName(){
		return Name;
	}
	
	public String getdetails(){
		return details;
	}
	public String gettype(){
		return type;
	}
	public String getownerName(){
		return ownerName;
	}
	
	public String getcostPerDay(){
		return costPerDay;
	}
	void dis(){
	System.out.println("Name : "+Name);
	System.out.println("details : "+details);
	System.out.println("type : "+type);
	System.out.println("ownerName : "+ownerName);
	System.out.println("costPerDay + "+costPerDay);
	}
}
class Exhibition extends Event{
	private String noOfStall;
	Exhibition(String Name,String details,String type,String ownerName,String costPerDay,String noOfStall){
		super(Name,details,type,ownerName,costPerDay);
		this.noOfStall=noOfStall;
	}
	void dis(){
		System.out.print("noOfStall : "+noOfStall);
	}
	
	
}
class StageEvent extends Event{
	private String noOfSeats;
    StageEvent(String Name,String details,String type,String ownerName,String costPerDay,String noOfSeats){
		super(Name,details,type,ownerName,costPerDay);
		this.noOfSeats=noOfSeats;
	}
	void dis(){
		System.out.print("noOfSeats : "+noOfSeats);
	}
	
}
class driver {
  void hasA(Event e){
	System.out.println("Name : "+e.getName() );
	System.out.println("details : "+e.getdetails());
	System.out.println("type : "+e.gettype());
	System.out.println("ownerName : "+e.getownerName());
	System.out.println("costPerDay + "+e.getcostPerDay());
	e.dis();
  }	
}
class assing4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Event E=new Event( "jack","mats","Stall","ravi","5");
		System.out.println("Enter 1 for Exhibition   2 StageEvents");
		int n=sc.nextInt();
		if((n!=1) && (n!=2)){
			System.out.println(" Invalid ");
            System.exit(0);			
		}
		sc.nextLine();
		System.out.println("Enter values in CSV manner");
		String u="";
		u=sc.nextLine();
		String[] val=u.split(",");
		String Name=val[0] ;
		String details=val[1] ;
		String type=val[2] ;
		String ownerName=val[3] ;
		String costPerDay=val[4] ;
		driver d=new driver();
			
		if(n==1){
		//System.out.println("Enter Tinnumber");
		String noOfStall=val[5];
		Exhibition e=new Exhibition( Name, details,type, ownerName,costPerDay, noOfStall);
         d.hasA(e);		
		}
		else if(n==2){
			//System.out.println("Enter OrgName");
		String noOfSeats=val[5];
	    StageEvent s=new StageEvent( Name, details,type, ownerName,costPerDay, noOfSeats);
		d.hasA(s);
		}
        
	}
}





















