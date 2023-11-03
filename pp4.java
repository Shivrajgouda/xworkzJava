class pp4{
static int[] array = {1,2,3,4,5};
public static void main(String[] args){
int n=1;
for (int i=0;i<n;i++){
	int last=array.length;
	for( int j=array.length-1;j>0;j--)
	{
		array[j]=array[j-1];
		//System.out.println(array[j]);
	}
	last=array[0];
	
}
for(int i=0;i<array.length;i++ ){
	System.out.println(array[i]);
}
}
}