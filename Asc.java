class Asc{
static int[] a={};
 static void Ascending(int[] a){
	 for(int i=0;i<a.length;i++){
		 if(a[i]==a[0]){
		 System.out.println(a[i]);
		
			 }
		 if( a[i]==a[a.length-1])
			  System.out.println(a[i]);
//		 else if(a[i]==a[i])
	
	 }
 }
public static void main(String[] args){
	int[] aar={1,2,3,4,5};
	Ascending(aar);
}
}