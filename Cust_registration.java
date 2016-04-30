package shoppingmall;
public class Cust_registration{
String cust_name;
long cust_ph_number;
String cust_email_id;
static String type_of_customer;
 static int num_of_cust;

public Cust_registration(String cust_name, long cust_ph_number,
		String cust_email_id, String type_of_customer) {
	
	this.cust_name = cust_name;
	this.cust_ph_number = cust_ph_number;
	this.cust_email_id = cust_email_id;
	Cust_registration.type_of_customer = type_of_customer;
}


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


public String getType_of_customer() {
	return type_of_customer;
}


public void setType_of_customer(String type_of_customer) {
	Cust_registration.type_of_customer = type_of_customer;
}


public void displayCustomerDetails(){
	System.out.println("name of the customer"+cust_name);
	System.out.println("email id of customer"+cust_email_id);
	System.out.println("phone number of the customer"+cust_ph_number);
	System.out.println("type of customer:"+type_of_customer);

}
}

