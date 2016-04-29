package shoppingmall;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

public class Products {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	ArrayList<String> ar=new ArrayList<String>();
	
	//method to initialize products
	
	public void setProducts(){
		try {
			ar.add("ladies wear");
			ar.add("gents wear");
			ar.add("kids wear");
			ar.add("accessories");
			System.out.println("List of products");
			System.out.println("----------------");
			Iterator<String> ir=ar.iterator();
			int i=0;
			while(ir.hasNext()){
				System.out.println(i+"."+ir.next());
				i++;	
			}
		} catch (Exception e) {
			System.out.println("exception due to "+e);
		}
					
		}
	//method to set product details
	public void setProductDetails(){
try {
	
	int choice;
	System.out.println("Enter the category of products to be shopped: ");
	choice=Integer.parseInt(br.readLine());
	switch(choice){
	case 1:
		System.out.println("Enter ladies shopping");
		setLadiesWearDetails();
		break;
	case 2:
		System.out.println("Enters mens wear");
		setMensWearDetails();
		break;
	case 3:
		System.out.println("enters kids wear");
	    setKidsWearDetails();
	    break;
	case 4:
		System.out.println("enters accessories");
		setAccessoriesDetails();
	}
} catch (Exception e) {
	System.out.println("Exception due to "+e);
}
	}
public void setKidsWearDetails() {
		
		
	}
public void setMensWearDetails() {

		
	}
public void setAccessoriesDetails() {
		
		
	}
public void setLadiesWearDetails(){
	Hashtable<String, Integer> ht=new Hashtable<String, Integer>();
	ht.put("kurthi", new Integer(10));
	ht.put("dupatta", new Integer(15));
	ht.put("sarees", new Integer(20));
	ht.put("ladies jeans", new Integer(20));
	}
	}
	
	
