class pp3{
static int[] array = {1,2,3,4,5};
public static void main(String[] args){
int n=3;
for (int i=0;i<n;i++){
int frist=array[0],j;
	for( j=0;j<array.length-1;j++)
	{
		array[j]=array[j+1];
		//System.out.println(array[j]);
	}
	array[j]=frist;
}
for(int i=0;i<array.length;i++ ){
	System.out.println(array[i]);
}
}
}