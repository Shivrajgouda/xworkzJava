class vender{
static int billProduct(String product, int quantity){
if(product=="tv"){
	int sp=25000*quantity;
 System.out.println("the price of tv is "+sp);
 manufacture.getdiscount(product,quantity);
 return 0;
}
else if(product=="fridge"){
	int sp=20000*quantity;
 System.out.println("the price of tv is "+sp);
 manufacture.getdiscount(product,quantity);
 return 0;
}
else if(product=="toaster"){
	int sp=1000*quantity;
 System.out.println("the price of tv is "+sp);
 manufacture.getdiscount(product,quantity);
 return 0;
}
else if(product=="mobile"){
	int sp=30000*quantity;
 System.out.println("the price of tv is "+sp);
 manufacture.getdiscount(product,quantity);
 return 0;
}
else {
	System.out.println("you have entered a wrong product");
	return 0;
}
}
}