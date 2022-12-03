import java.util.*;
public class Factorial {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		System.out.println(Fact(n));
	}
	public static int Fact(int n) {
		int factorial=1;
		for(int i=1;i<=n;i++) {
			factorial=factorial*i;
		}
		return factorial;
	}
}
