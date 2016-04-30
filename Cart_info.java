package shoppingmall;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public  class Cart_info{
int num_of_carts=10;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public void setCartDetails(){
	try{
	
	if(Cust_registration.num_of_cust<=num_of_carts){
		System.out.println("cart is assigned to the customer");
	}else{
		System.out.println("carts are not available due to heavy number of customers");
	}
		
	}
	catch(Exception e){
		System.out.println("throws exception due to "+e);
	}
	
}

}
