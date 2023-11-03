class Train{
int seats;
double cost;
}
class mall{
String items;
String mallName;
int phno;
 }
class Ambulance{
String numberplate;
int phno;
}
class perfume{
String brand;
int cost;
}
class PenDrive{
double cost;
int storage;
}
class Hospital{
String Hname;
int Phno; 	
}
class Kidney{
String Hname;
Boolean alive;
}
class BusStand{
String station;
int seats;
}
class Temple{
String god;
String location;
public static void main(String[] args){
Train train = new Train();
Train train1 = new Train();
mall m=new mall();
mall m1=new mall();
Ambulance a= new Ambulance();
Ambulance a1 = new Ambulance();
perfume p = new perfume();
perfume p1 = new perfume();
PenDrive pd = new PenDrive();
PenDrive pd1 = new PenDrive();
Hospital h= new Hospital();
Hospital h1= new Hospital();
Kidney k=new Kidney();
Kidney k1=new Kidney();
BusStand b=new BusStand();
BusStand b1=new BusStand();
Temple t=new Temple();
Temple t1=new Temple();
System.out.println(train.seats);
System.out.println(train1.cost);
System.out.println(a.numberplate);
System.out.println(a1.phno);
System.out.println(p.brand);
System.out.println(p1.cost);
System.out.println(m.items);
System.out.println(m1.phno);
System.out.println(pd.cost);
System.out.println(pd1.storage);
System.out.println(h.Hname);
System.out.println(h1.Phno);
System.out.println(k.Hname);
System.out.println(k1.alive);
System.out.println(b.station);
System.out.println(b1.seats);
System.out.println(t.god);
System.out.println(t1.location);
}
}