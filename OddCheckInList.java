import java.util.ArrayList;
import java.util.*;
public class OddCheckInList {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList<Integer> al=new ArrayList<Integer>();
		System.out.println("Enter the list size");
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			al.add(s.nextInt());
		}
		boolean odd=false;
		for(int a:al) {
			if(a%2!=0) {
				System.out.println("Contains odd number");
				odd=true;
				break;
			}
		}
		if(odd=true) {
			System.out.println("List doesn't contain odd numbers");
		}
	}
}
