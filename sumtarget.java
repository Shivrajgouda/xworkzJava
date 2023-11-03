class sumtarget{
static int[] nums={2,7,11,15};
static int target=9;
public static void main(String[] args){
for(int i=0;i<nums.length-1;i++){
for(int j=i+1;j<nums.length-1;j++){
if(nums[i]+nums[j]==9){
System.out.println(i+" and index "+j);
break;
}
}
}
}
}