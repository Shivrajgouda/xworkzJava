class FullName{
String name = "Shivam Roy";
 static void printName(String name){
     if (name.length()==0)
      return ;
       System.out.println(Character.toUpperCase(name.charAt(0)));
		   for (int i=0;i<name.length();i++){
			   if(name.charAt(i)==' ')
				   System.out.println(Character.toUpperCase(name.charAt(i+1)));
		   }
	   } 
 

 public static void main(String[] args){
printName("Shivam Roy");
}
}