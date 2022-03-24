package oops;


	public class rectangle {
		int length,breadth;
		rectangle(int x,int y){
			length =x;
			breadth=y;
		}
		int area(){
			return length*breadth;
		}
		int perimeter(){
			return 2*(length+breadth);
		}

	public static void main(String[]args){
	rectangle r1=new rectangle(5,10);
	System.out.println("Area of first rectangle:"+r1.area());
	System.out.println("Perimeter of first rectangle:"+r1.perimeter());
	rectangle r2=new rectangle(20,15);
	System.out.println("Area of second rectangle:"+r2.area());
	System.out.println("Perimeter of second rectangle:"+r1.perimeter());
		}
	}

