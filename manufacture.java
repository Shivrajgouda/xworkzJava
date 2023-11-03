class manufacture{
	static int getdiscount(String product,int quantity){
		double price;
		if(product=="tv"){
			price=25000-0.05*25000;
            price=price*quantity;			
 System.out.println("the price of tv after %5 discount is "+price);
 return 0;
}
else if(product=="fridge"){
price=20000-0.05*20000;
price=price*quantity;
 System.out.println("the price of fridge after %20 discount is "+price);
 return 0;
}
else if(product=="toaster"){
price=1000-0.25*1000;
price=price*quantity;
 System.out.println("the price of toaster after %25 discount is "+price);
 return 0;
}
else if(product=="mobile"){
price=30000-0.15*30000;
price=price*quantity;
 System.out.println("the price of mobile after %15 discount is "+price);
 return 0;
}
else {
	return 0;
}
}
}