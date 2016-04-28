package shoppingmall;
import java.io.*;

public class Cust_registration {
String cust_name;
long cust_ph_number;
String cust_email_id;
String type_of_customer;
 static int num_of_cust;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public void setCustomerDetails() throws IOException{
	System.out.println("enter number of customers entering into the store : ");
	num_of_cust=Integer.parseInt(br.readLine()); 
	for(int i=1;i<=num_of_cust;i++){
		System.out.println("enter customer "+i+" name,phone number,type");
		cust_name=br.readLine();
		cust_ph_number=Long.parseLong(br.readLine());
		type_of_customer=br.readLine();
		System.out.println("customer"+i);
		System.out.println("name	:"+cust_name);
		System.out.println("phone no	:"+cust_ph_number);
		System.out.println("heavy of light cusstomer :"+type_of_customer);
		System.out.println("\n");
		}
}

}
