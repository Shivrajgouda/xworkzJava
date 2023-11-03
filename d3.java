

class d3{

public void display(){
	String[] biscuits = {"marrie gold","parle g","50-50"};
		for(int i=0;i<biscuits.length;i++)
		{
			System.out.println((i+1)+ biscuits[i]);
		}
	}

public void displayph() {
	long[] phno = {123534343L,3563434343L,5443433367L};
	    for(int i=0;i<phno.length;i++)
		{
			System.out.println((i+1)+ phno[i]);
		}
	}
public static void main(String[] args){
	d3 d = new d3();
d.display();
d.displayph();


}
}