import java.util.*;
public class ReverseLinkedList {
	public static void main(String[] args) {
		System.out.println("Enter the number of elements");
		Scanner s=new Scanner(System.in);
		LinkedList ll=new LinkedList();
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			ll.push(s.nextInt());
		}
		
		System.out.println(ll);
		LinkedList ll2=new LinkedList();
		for(int i=0;i<n;i++) {
			ll2.push(ll.pop());
		}
		System.out.println(ll2);
		
	}
}
