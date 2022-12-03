import java.util.Scanner;
public class ReverseString {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);// Which is useful for talking input
		System.out.println("Enter the input string");
		String str1=s.nextLine();// input string
		String rev="";
		System.out.println("Reversed strings");
		
		// loop to reverse the string
		for(int i=str1.length()-1;i>=0;i--) {
			rev=rev+str1.charAt(i);
		}
		System.out.println(rev);
		
		//Method 2
		StringBuffer str2=new StringBuffer(str1);
		System.out.println(str2.reverse());
		
		//Method 3
		char[] str3=str1.toCharArray();
		for(int i=str3.length-1;i>=0;i--) {
			System.out.print(str3[i]);
		}
		System.out.println();
		
		//Method 4
		StringBuilder str5=new StringBuilder();
		str5.append(str1);
		System.out.println(str5.reverse());
		
	}
}

