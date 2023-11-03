class Hotel{
String name;
String ownerName;
Menu menu;
void setHotelInfo(String name,String ownerName, Menu menu){
this.name=name;
this.ownerName=ownerName;
this.menu=menu;
System.out.println("the name of hotel is"+name);
System.out.println("the name of ownerName is"+ownerName);
System.out.println("the menu is"+this.menu.totalitem);
}

}
class Menu{
int totalitem=5;
double cost;
void setMenu(int totalitem, double cost){
this.totalitem=totalitem;
this.cost=cost;
System.out.println("The total No. of items are"+totalitem);
System.out.println("The total cost is"+cost);
Menu menu=new Menu();
Hotel hotel=new Hotel();
hotel.setHotelInfo("Shiva","Shivam",menu);
}
}
class HotelStart{
	public static void main(String[] args){
		Menu m1=new Menu();
		m1.setMenu(3,377);
	}
}