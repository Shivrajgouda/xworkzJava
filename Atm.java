class Restuarent{
String ownerName="omkar";
String[] specialItems={};
//"maggie","Dosa","Parota","Noodles","panipuri"

Restuarent(String[] specialItems){
	this.specialItems=specialItems;
	for(int i=0;i<specialItems.length;i++){
		System.out.println(this.specialItems[i]);
	}
}
	
}


class Canteen{
	String name;
	String[] utentils={};
	Canteen(String[] utentils){
		this.utentils=utentils;
	for(int i=0;i<utentils.length;i++){
		System.out.println(this.utentils[i]);
	}	
	}
	//Restuarent rest = new Restuarent();
	//rest.specialItems[0]="maggie";

}
class Atm{
	String bankName;
	String[] branch;
	String[] acs;
	String[] cctv;
	
	Atm(String[] branch,String[] acs,String[] cctv){
		this.branch=branch;
		this.acs=acs;
		this.cctv=cctv;
		Atm[] atm;
		for(int i=0;i<branch.length;i++){
		System.out.println(this.branch[i]);
	}
for(int j=0;j<acs.length;j++){
		System.out.println(this.acs[j]);
	}
for(int k=0;k<cctv.length;k++){
		System.out.println(this.cctv[k]);
	}
	}	
	
	
	public static void main(String[] args){
	
		String[] utentils={"snoop","plats","table","chairs","food"};
			Canteen can = new Canteen(utentils);
		String[] specialItems = {"maggie","Dosa","Parota","Noodles","panipuri"};
		Restuarent rest = new Restuarent(specialItems);
	System.out.println(rest.specialItems[0]);
		System.out.println(rest.ownerName);
		String[] branch={"hubli","bengaluru","udupi"};
		String[] acs={"havens","waproof","LG"};
		String[] cctv={"amc","jsl","opp"};
		Atm atm=new Atm(branch,acs,cctv);
		
	
	}
	}