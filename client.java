class client{
static String purchaseProduct(String clientName,String product,int quantity){
	if (amazon.onlinePurchase(clientName, product, quantity)){
		
		System.out.println("sucessfull");
		return "";
	}
	/*else if (product=="fridge"){
		amazon.onlinePurchase(clientName, product, quantity);
		System.out.println("sucessfull");
		return "";
	}
	else if (product=="toaster"){	
	amazon.onlinePurchase(clientName, product, quantity);
		System.out.println("sucessfull");
		return "";
	}
	else if (product=="mobile"){
  	amazon.onlinePurchase(clientName, product, quantity);
		System.out.println("sucessfull");
		return "";
	}*/
	else{
		System.out.println("failed");
		return "";
	}
	 
}
public static void main(String[] args){
	purchaseProduct("Divya","fridge",0);	
	}
	}