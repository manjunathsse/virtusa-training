import java.util.Scanner;
public class Polindrome {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("No.of test cases");
		int t=s.nextInt();
		while(t!=0) {
			System.out.println("Enter the number");
			int n=s.nextInt();
			int d=n;
			int rev=0;
			while(n!=0) {
				int c=(n%10);
				rev=rev*10+c;
				n=n/10;
			}
			if(rev==d) {
				System.out.println("Given number is polindrome");
			}
			else {
				System.out.println("Given number is not polindrome");
			}
			t--;
		}
	}
}
