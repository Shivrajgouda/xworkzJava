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
	
	int getcostPerDay(){
		
		int v=Integer.parseInt(costPerDay);
		return v;
	}
	
}
class Exhibition extends Event{
	private String noOfStall;
	Exhibition(String Name,String details,String type,String ownerName,String costPerDay,String noOfStall){
		super(Name,details,type,ownerName,costPerDay);
		this.noOfStall=noOfStall;
	}
	void gst(int cp,long daysDifference){
		long as=cp*daysDifference;
		System.out.println(as*0.05);
	}
	
	
}
class StageEvent extends Event{
	private String noOfSeats;
    StageEvent(String Name,String details,String type,String ownerName,String costPerDay,String noOfSeats){
		super(Name,details,type,ownerName,costPerDay);
		this.noOfSeats=noOfSeats;
	}
	void gst(int cp,long daysDifference){
		long as=cp*daysDifference;
		System.out.println(as*0.015);
	}
}
class ass2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Event E=new Event( "jack","mats","Stall","ravi","5");
		System.out.println("Enter 1 for Exhibition   2 StageEvents");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter values in comma separated manner");
		String u="";
		u=sc.nextLine();
		String[] val=u.split(",");
		String Name=val[0] ;
		String details=val[1] ;
		String type=val[2] ;
		String ownerName=val[3] ;
		String costPerDay=val[4] ;
			
		if(n==1){
		//System.out.println("Enter Tinnumber");
		String noOfStall=val[5];
		Exhibition e=new Exhibition( Name, details,type, ownerName,costPerDay, noOfStall);	
		}
		else if(n==2){
			//System.out.println("Enter OrgName");
		String noOfSeats=val[5];
	    StageEvent s=new StageEvent( Name, details,type, ownerName,costPerDay, noOfSeats);
		}
	//	String startDateStr = "2024-01-01";
		String startDateStr = sc.nextLine();
        String endDateStr = sc.nextLine();
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date startDate = sdf.parse(startDateStr);
            Date endDate = sdf.parse(endDateStr);

            long timeDifference = endDate.getTime() - startDate.getTime();
            long daysDifference = timeDifference / (1000 * 60 * 60 * 24);

           // System.out.println("GST: " + hasA(daysDifference));
		   if(n==1){
		   Exhibition e1=new Exhibition( Name, details,type, ownerName,costPerDay,null);
		int cp=e1.getcostPerDay();
            e1.gst(cp,daysDifference);
		   }
		   else if(n==2){
		   StageEvent s2=new StageEvent( Name, details,type, ownerName,costPerDay,null);
			   int cp=s2.getcostPerDay();
           s2.gst(cp,daysDifference);
		   }
        } catch (ParseException e) {
            e.printStackTrace();
        }
		
        
	}
}





















