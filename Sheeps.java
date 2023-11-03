class Sheeps{
static boolean[] sheep={true,false,true};
 
 static void Sheepcount(){
	 if(true){
		 int count=0;
		 for(int i=0;i<sheep.length;i++){
			 System.out.println(sheep[i]);
			 //int count=0;
			 if(sheep[i]==true){
			 count++;
			 }
			 }
		  System.out.println(count);
	 }
	 else{
		 System.out.println("enter a boolean value");
	 }
 }
 public static void main (String[] ARhs){
	 Sheepcount();
 }
}