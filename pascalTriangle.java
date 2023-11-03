class pascalTriangle{
public static void main(String[] args){
//int n=5;
for (int i=0;i<5;i++){
	
	for(int j=1;j<5-i;j++){
		System.out.print(" ");
	}
	int numb=1;
	for(int k=0;k<=i;k++){
			
		numb=numb*(i-k)/(k+1);
	}
		System.out.print(numb+" \n");
}
}
}