import java.util.*;
public class BinarySearch {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of array elements");
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("Enter the element you want to search");
		int key=s.nextInt();
		int last=arr.length-1;
		Arrays.sort(arr);
		binarySearch(arr,0,last,key);
	}
	
	public static int binarySearch(int[] arr,int first,int last,int key) {
		int mid=(first+last)/2;
		while(first<=last) {
			if(arr[mid]<key) {
				first++;
			}
			else if(arr[mid]==key) {
				System.out.println("The element is found at index:"+mid);
				break;
			}
			else {
				last--;
			}
			mid=(first+last)/2;
		}
		if(first>last) {
			System.out.println("Element is not found!!!!");
		}
		return mid;
	}
}
