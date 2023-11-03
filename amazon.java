class amazon{
static boolean onlinePurchase(String clientName,String product,int quantity){
if (clientName=="Divya" && quantity>=1){
	System.out.println("You are allowed for shopping"+clientName);
	vender.billProduct(product,quantity);
	return true;
}
else if (clientName=="shiva" && quantity>=1){
	System.out.println("You are allowed for shopping"+clientName);
	vender.billProduct(product,quantity);
	return true;
}
else if (clientName=="shivam" && quantity>=1){
	System.out.println("You are allowed for shopping"+clientName);
	vender.billProduct(product,quantity);
	return true;
	}
else if (quantity<=0)
{
  System.out.println("Please enter a valid  quantity");	
  return false;
}
else{
	System.out.println("Please enter a valid name ");
	return false;
}
}
}