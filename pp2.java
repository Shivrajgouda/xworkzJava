class pp2{
static int[] array = {2,3,2,6,3,5};
static int a=3;
public static void main(String[] args){
	for(int i=0;array.length>i;i++){
		if(a==array[i]){
		int b=array[i];
	
		for(int j=i+1;array.length>j;j++){
		int count=1;
		if(b==array[j]){
			count++;
			System.out.println("the number "+array[i]+" as repeated for "+count);
		}
		}
		}
	}
}
}