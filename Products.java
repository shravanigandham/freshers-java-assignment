package shoppingmall;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

public class Products{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	ArrayList<String> ar=new ArrayList<String>();
	
	//method to initialize products and set product details
	public void setProductDetails()throws IOException{
		
			ar.add("ladies wear");
			ar.add("gents wear");
			ar.add("accessories");
			ar.add("exit");
			System.out.println("List of products");
			System.out.println("----------------");
			Iterator<String> ir=ar.iterator();
			int i=1;
			while(true){
			while(ir.hasNext()){
				System.out.println(i+"."+ir.next());
				i++;
			}
			System.out.println("Enter the category of products to be shopped: ");
			int choice=Integer.parseInt(br.readLine());
			switch(choice){
			case 1:
				System.out.println("Enter ladies shopping");
				setLadiesWearDetails();
					break;
			case 2:
				System.out.println("Enters mens shopping");
				setMensWearDetails();
				break;
			case 3:
				System.out.println("enters accessories shopping");
				setAccessoriesDetails();
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("invalid process");
		}
			}
	
		}			
		

	public void setLadiesWearDetails() throws  IOException{
	while(true){
	Hashtable<String, Integer> ht=new Hashtable<String, Integer>();
	ht.put("kurthi", new Integer(10));
	ht.put("dupatta", new Integer(15));
	ht.put("saree", new Integer(20));
	ht.put("ladiesjeans", new Integer(20));
	ht.put("leggings",new Integer(50));
	Hashtable<String, Integer> phtl=new Hashtable<String, Integer>();
	phtl.put("ladiesjeans",1200);
	phtl.put("kurthi",350);
	phtl.put("saree",800);
	phtl.put("leggings",200);
	phtl.put("dupatta",150);
	System.out.println("available sections: "+ht);
	if(Cust_registration.type_of_customer=="heavy"){
	System.out.println("customer add 4 ladiesjeans,5 leggings, 3 sarees to the cart");
	int initial_stock=(Integer)ht.get("ladiesjeans").intValue();
	ht.put("kurthi",initial_stock-4);
	int initial_stock1=(Integer)ht.get("leggings").intValue();
	ht.put("kurthi",initial_stock1-5);
	int initial_stock2=(Integer)ht.get("saree").intValue();
	ht.put("kurthi",initial_stock2-3);
	System.out.println("present stock:"+ht);
	int total_amt=(4*(Integer)phtl.get("ladiesjeans").intValue())+5*((Integer)phtl.get("leggings").intValue())+3*((Integer)phtl.get("saree").intValue());
	System.out.println("total amount to be paid by the customer"+total_amt);
	}
	else{
		System.out.println("customer adds 2 kurthies,2 dupatta,1 saree to the cart");
		int initial_stock=(Integer)ht.get("kurthi").intValue();
		ht.put("kurthi",initial_stock-2);
		int initial_stock1=(Integer)ht.get("dupatta").intValue();
		ht.put("kurthi",initial_stock1-2);
		int initial_stock2=(Integer)ht.get("saree").intValue();
		ht.put("kurthi",initial_stock2-1);
		System.out.println("present stock:"+ht);
		int total_amt=(2*(Integer)phtl.get("kurthi").intValue())+2*((Integer)phtl.get("dupatta").intValue())+((Integer)phtl.get("saree").intValue());
		System.out.println("total amount to be paid by the customer"+total_amt);
	}
		
	}
	}
//method to set mens wear details
	public void setMensWearDetails() throws IOException{
		Hashtable<String,Integer> htm=new Hashtable<String, Integer>();
		htm.put("jeans",25);
		htm.put("T_shirts", 15);
		htm.put("trousers", 30);
		//class to define price of the items
		Hashtable<String,Integer> phtm=new Hashtable<String, Integer>();
		phtm.put("trousers",3000);
		phtm.put("T_shirts",300);
		phtm.put("jeans",1500);
		System.out.println("available sections in mens wear:"+htm);
		if(Cust_registration.type_of_customer=="heavy"){
			System.out.println("customer adds 3 trousers,2 jeans,2 T_shirts");
			int initial_stock=(Integer)htm.get("jeans").intValue();
			htm.put("jeans",initial_stock-2);
			int initial_stock1=(Integer)htm.get("trousers").intValue();
			htm.put("jeans",initial_stock1-3);
			int initial_stock2=(Integer)htm.get("T_shirts").intValue();
			htm.put("jeans",initial_stock2-2);
	         System.out.println("present stock:"+htm);
			int total_amt=2*((Integer)phtm.get("jeans").intValue())+2*((Integer)phtm.get("T_shirts").intValue())+3*((Integer)phtm.get("trousers").intValue());
			System.out.println("total amount to be paid by the customer:"+total_amt);
		
		}else{
			System.out.println("customer adds 1 jeans,1 T_shirt");
			int initial_stock=(Integer)htm.get("jeans").intValue();
			htm.put("jeans",initial_stock-1);
			int initial_stock1=(Integer)htm.get("T_shirt").intValue();
			htm.put("T_shirt",initial_stock1-1);
			System.out.println("present stock:"+htm);
			int total_amt=((Integer)htm.get("jeans").intValue())+((Integer)htm.get("T_shirts").intValue());
			System.out.println("total amount to be paid bye the customer:"+total_amt);
			
		}
	}

	//method to set accessories details
	public void setAccessoriesDetails() throws IOException{
		Hashtable<String, Integer> hta=new Hashtable<String, Integer>();
		hta.put("headphones",15);
		hta.put("watches",30);
		hta.put("ipods",20);
		hta.put("bags", 20);
		hta.put("goggles",40);
		hta.put("bracelets",15);
		System.out.println("available sections in accessories:"+hta);
			
		//reference to set the price to the items
		Hashtable<String,Integer> phta=new Hashtable<String, Integer>();
		
		phta.put("headphones",600);
		phta.put("watches",1500);
		phta.put("ipods",2000);
		phta.put("bags",1200);
		phta.put("goggles",600);
		phta.put("bracelets",500);
		if(Cust_registration.type_of_customer=="heavy"){
			System.out.println("customer adds 2ipods,2 bag,3 watches,4 goggles");
		int initial_stock=(Integer)hta.get("ipods").intValue();
		phta.put("ipods",initial_stock-2);
		int initial_stock1=(Integer)hta.get("watches").intValue();
		phta.put("ipods",initial_stock1-3);
		int initial_stock2=(Integer)hta.get("bags").intValue();
		phta.put("ipods",initial_stock2-2);
		int initial_stock3=(Integer)hta.get("goggles").intValue();
		phta.put("ipods",initial_stock3-4);
		
		int total_amt=2*((Integer)phta.get("ipods").intValue())+2*((Integer)phta.get("bags").intValue())+3*((Integer)phta.get("watches").intValue())+4*((Integer)phta.get("goggles").intValue());
		System.out.println("total amount to be paid by the customer:"+total_amt);
				
		System.out.println("present stock:"+phta);
		}else{
			System.out.println("customer adds 1watch,1 bracelet");
			int initial_stock=(Integer)hta.get("watches").intValue();
		hta.put("watches",initial_stock-1);
		int initial_stock1=(Integer)hta.get("bracelets").intValue();
		hta.put("watches",initial_stock1-1);
		
		int initial_stock2=(Integer)hta.get("watches").intValue();
		hta.put("watches",initial_stock2-2);
		System.out.println("present stock:"+hta);
		int total_amt=((Integer)hta.get("watches").intValue())+((Integer)hta.get("bracelets").intValue())+2*((Integer)hta.get("goggles").intValue());
		System.out.println("total amount to be paid by the customer:"+total_amt);
		
		}
		
	
	}
public static void main(String[] args) throws IOException {
	Products pd=new Products();
    pd.setProductDetails();
	
}
}
