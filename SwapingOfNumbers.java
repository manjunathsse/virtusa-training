import java.util.*;
public class SwapingOfNumbers {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//Method 1
		System.out.println("enter  numbers a and b");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("before swaping "+a+" "+b);
		int c=a;
		a=b;
		b=c;
		System.out.println("after swaping "+a+" "+b);
		
		//Method 2
		int d=a+b;
		int e=d-a;
		d=d-b;
		System.out.println("Method2 for swaping:"+d+" "+e);
	}
}
