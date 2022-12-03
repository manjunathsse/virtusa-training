import java.util.*;
public class CheckPrime {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		print(n);
	}
	public static void print(int n) {
		boolean[] prime=new boolean[n+1];
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=2;i<=n;i++) {
			if(prime[i]==false) {
				al.add(i);
				for(int j=i*i;j<=n;j=j+i) {
					prime[j]=true;
				}
			}
		}
		
		System.out.println(al);
	}
}
