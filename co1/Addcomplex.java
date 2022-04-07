package oop;
import java.util.Scanner;
public class Addcomplex {
int a;
int b;
Addcomplex()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the real and imaginary part of complex number");
	a=sc.nextInt();
	b=sc.nextInt();
	
}
int aa()
{
	return a;
}

int bb()
{
	return b;
}
public static void main(String args[]){
	{
		Addcomplex c1=new Addcomplex();
		int real1=c1.aa();
		int img1=c1.bb();
		Addcomplex c2=new Addcomplex();
		int real2=c2.aa();
		int img2=c2.bb();
		int realsum=real1+real2;
		int imgsum=img1+img2;
		System.out.println("sum of complex number is"+realsum+"+"+imgsum+"i");
		
	}
}
}