package oops;
import java.util.Scanner;
public class product {
		 int pcode;
	 	 String pname;
	     int price;
	     
	     public static void main(String args[])
	     {
	    	
	    	   
	         Scanner sc = new Scanner(System.in);
	         product obj1 = new product();
	         product obj2 = new product();
	         product obj3 = new product();
	         
	         System.out.println("***Enter the details of first object***");
	         System.out.println("Enter the product code");
	         obj1.pcode = sc.nextInt();
	         sc.nextLine();
	         System.out.println("Enter the product name");
	         obj1.pname = sc.nextLine();
	         
	         System.out.println("Enter the price");
	         obj1.price = sc.nextInt();
	         sc.nextLine();

	     
	         System.out.println("***Enter the details of second object***");
	         System.out.println("Enter the product code");
	         obj2.pcode = sc.nextInt();
	         sc.nextLine();
	         System.out.println("Enter the product name");
	         obj2.pname = sc.nextLine();
	         
	         System.out.println("Enter the price");
	         obj2.price = sc.nextInt();
	         sc.nextLine();


	         System.out.println("***Enter the details of third object***");
	         System.out.println("Enter the product code");
	         obj3.pcode = sc.nextInt();
	         sc.nextLine();
	         System.out.println("Enter the product name");
	         obj3.pname = sc.nextLine();
	         
	         System.out.println("Enter the price");
	         obj3.price = sc.nextInt();
	        
	       
	         
	         
		        	
	         if(obj1.price < obj2.price && obj1.price < obj3.price)
	         {
	             System.out.println("Product having lowest price is ");
	             System.out.println("Product name:"+obj1.pname);
	             System.out.println("Product code:"+obj1.pcode);
	             System.out.println("Product price:"+obj1.price);
	         }
	         else if(obj2.price < obj1.price && obj2.price < obj3.price)
	         {
	             System.out.println("Product having lowest price is ");
	             System.out.println("Product name:"+obj2.pname);
	             System.out.println("Product code:"+obj2.pcode);
	             System.out.println("Product price:"+obj2.price);
	         }
	         else 
	         {
	             System.out.println("Product having lowest price is ");
	             System.out.println("Product name:"+obj3.pname);
	             System.out.println("Product code:"+obj3.pcode);
	             System.out.println("Product price:"+obj3.price);
	         }
	     }
	 }



