package shoppingmall;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Final_Implementation extends Thread {
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	String cust_name;
	long cust_ph_number;
	String cust_email_id;
	static String type_of_customer;
	 static int num_of_cust;
	
	
	
	public Final_Implementation(String cust_name, long cust_ph_number,
			String cust_email_id, String type_of_customer) {
		super();
		this.cust_name = cust_name;
		this.cust_ph_number = cust_ph_number;
		this.cust_email_id = cust_email_id;
		Final_Implementation.type_of_customer = type_of_customer;
	}
	



	//main method
	
	public String getCust_name() {
		return cust_name;
	}




	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}




	public long getCust_ph_number() {
		return cust_ph_number;
	}




	public void setCust_ph_number(long cust_ph_number) {
		this.cust_ph_number = cust_ph_number;
	}




	public String getCust_email_id() {
		return cust_email_id;
	}




	public void setCust_email_id(String cust_email_id) {
		this.cust_email_id = cust_email_id;
	}




	public static String getType_of_customer() {
		return type_of_customer;
	}




	public static void setType_of_customer(String type_of_customer) {
		Final_Implementation.type_of_customer = type_of_customer;
	}



	public static void main(String[] args) {
		Cart_info ci=new Cart_info();
		Products p=new Products();

	try{
	  System.out.println("enter number of customers entering into the shop:");
	   Cust_registration.num_of_cust=Integer.parseInt(br.readLine());
	   ci.setCartDetails();
		   Final_Implementation fi1=new Final_Implementation("james",801937292,"james@rr.com","heavy");
		   ci.num_of_carts--;
		   Final_Implementation fi2=new Final_Implementation("john",985672458,"john@rr.com","light");
		   ci.num_of_carts--;
		   Final_Implementation fi3=new Final_Implementation("richard",875964258,"richard@rr.com","heavy");
		   ci.num_of_carts--;
		   Final_Implementation fi4=new Final_Implementation("pollard",954657592,"pollard@rr.com","heavy");
		   ci.num_of_carts--;
		   Final_Implementation fi5=new Final_Implementation("michael",846528312,"michael@rr.com","light");
		   ci.num_of_carts--;
		   Final_Implementation fi6=new Final_Implementation("william",987564256,"william@rr.com","light");
		   ci.num_of_carts--;
		   
	   
		   Thread t1=new Thread( fi1);
		   Thread t2=new Thread( fi2);
		   Thread t3=new Thread( fi3);
		   Thread t4=new Thread( fi4);
		   Thread t5=new Thread(fi5);
		   Thread t6=new Thread(fi6);
		   t1.start();
		   
		   t2.start();
		   
		   t3.start();
		   
		   t4.start();
		   
		   t5.start();
		   
		   t6.start();
		   p.setProductDetails();
		   
	   
	   
	}catch(Exception e){
		System.out.println("failed due to: "+e);
	}
	}
	
	
}
