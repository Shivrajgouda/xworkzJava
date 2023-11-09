class merge{

public static void main(String[] args){
	int[] arr ={1,2,3};
int[] arr1={1,2,3,4,5};
int[] c = new int[arr.length + arr1.length];
for (int i=0;i<arr.length;i++){
c[i]=arr[i];
}
for (int i=0;i<arr1.length;i++){
//System.out.println(sum[]);
c[i+arr.length]=arr1[i]; 
}
for(int i=0;i<c.length;i++){
	System.out.println(c[i]);
}

}
}