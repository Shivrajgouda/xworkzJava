class Free{
String course;
String date;
String subject;
int durationInMonth;
int strength;

void display(){
	this.course=course;
	this.date=date;
	this.subject=subject;
	this.durationInMonth=durationInMonth;
	this.strength=strength;
	System.out.println("This is a FRee constructor "+course);
	System.out.println("This is a  Free constructor "+date);
		System.out.println("This is a  Free constructor "+subject);
	System.out.println("This is a  Free constructor "+durationInMonth);
	System.out.println("This is a  Free constructor "+strength);
	//System.out.println("This is a  Free constructor "+date);

}

Free(){
	display();
}

Free(String course,String date,String subject,int durationInMonth,int strength){
    this.course=course;
	this.date=date;
	this.subject=subject;
	this.durationInMonth=durationInMonth;
	this.strength=strength;
	System.out.println("Free class parametrised constructor"); 
	display();
}


//int durationInDays;
//double cost;
//String InstituteName;
/*boolean IT;
String Course;
String Technology;
int NoOfPlacements;*/
}
class Month{
int days;
String monthName;
double totalTime;
int monthNo;
int Holidays;

void display(){
	this.days=days;
	this.monthName=monthName;
	this.totalTime=totalTime;
	this.monthNo=monthNo;
	this.Holidays=Holidays;
	System.out.println("This is a FRee constructor "+days);
	System.out.println("This is a  Free constructor "+monthName);
		System.out.println("This is a  Free constructor "+totalTime);
	System.out.println("This is a  Free constructor "+monthNo);
	System.out.println("This is a  Free constructor "+Holidays);
}
Month(int days,String monthName,double totalTime,int monthNo,int Holidays){
/*int WorkingDays;
int Weekend;
int SecondSaterdays;
int year;
String PreviousMonth;
String NextMonth;
*/
display();
}
}
class Course{
int time;
String date;
String subject;
int durationInMonth;
int strength;
/*int durationInDays;
double cost;
String InstituteName;
boolean IT;
boolean free;
String Technology;
int NoOfPlacements;
*/
void display(){
	this.time=time;
	this.date=date;
	this.subject=subject;
	this.durationInMonth=durationInMonth;
	this.strength=strength;
	System.out.println("This is a Free constructor "+time);
	System.out.println("This is a  Free constructor "+date);
		System.out.println("This is a  Free constructor "+subject);
	System.out.println("This is a  Free constructor "+durationInMonth);
	System.out.println("This is a  Free constructor "+strength);
}
Course(int time,String date,String subject,int durationInMonth,int strength){
	this.time=time;
	this.date=date;
	this.subject=subject;
	this.durationInMonth=durationInMonth;
	this.strength=strength;
	display();
}

}
class Technology{
String technologyName;
String frontEnd;
String Backend;
String Database;
String frameWork;

void display(){
	this.technologyName=technologyName;
	this.frontEnd=frontEnd;
	this.Backend=Backend;
	this.Database=Database;
	this.frameWork=frameWork;
	System.out.println("This is a  placement constructor"+technologyName);
	System.out.println("This is a  placement constructor"+frontEnd);
	System.out.println("This is a  placement constructor"+Backend);
	System.out.println("This is a  placement constructor"+Database);
	System.out.println("This is a Placement constructor"+frameWork);
}

Technology(String technologyName,String frontEnd,String Backend,String Database,String frameWork){
	this.technologyName=technologyName;
	this.frontEnd=frontEnd;
	this.Backend=Backend;
	this.Database=Database;
	this.frameWork=frameWork;
	display();
}
}
class Placement{
String instituteName;
int NoOfSTudentPlaced;
int totalNoOfStudents;
int fees;
double ratings;

void display(){
	this.instituteName=instituteName;
	this.NoOfSTudentPlaced=NoOfSTudentPlaced;
	this.totalNoOfStudents=totalNoOfStudents;
	this.fees=fees;
	this.ratings=ratings;
	System.out.println("This is a  placement constructor"+instituteName);
	System.out.println("This is a  placement constructor"+NoOfSTudentPlaced);
	System.out.println("This is a  placement constructor"+totalNoOfStudents);
	System.out.println("This is a  placement constructor"+fees);
	System.out.println("This is a Placement constructor"+ratings);
}

Placement(String instituteName,int NoOfSTudentPlaced,int totalNoOfStudents,int fees,double ratings){
	this.instituteName=instituteName;
	this.NoOfSTudentPlaced=NoOfSTudentPlaced;
	this.totalNoOfStudents=totalNoOfStudents;
	this.fees=fees;
	this.ratings=ratings;
	 display();
}


public static void main(String[] Args){
	Placement placement=new Placement("xworkz",37,40,21000,4.7);
	Free free=new Free();
	Free free1=new Free("JavaFullstack","12-2-1023","java",3,123);	
	
	Month month = new Month(3,"January",39,1,4);
	
	Course course=new Course(3,"3-3-2023","java",5,123);
	
	Technology tec=new Technology("Web","JS","PHP","SQL","laravel");
	
}
}