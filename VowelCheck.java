import java.util.*;
public class VowelCheck {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of strings");
		int t=s.nextInt();
		while(t!=0) {
			System.out.println("enter the input string");
			String str1=s.next();
			str1.toLowerCase();
			boolean flag=false;
			for(int i=0;i<str1.length();i++) {
				if(str1.charAt(i)=='a'|| str1.charAt(i)=='e' || str1.charAt(i)=='i' || str1.charAt(i)=='o' || str1.charAt(i)=='u') {
					flag=true;
					break;
				}
			}
			if(flag==true) {
				System.out.println("Given string contains vowel");
			}
			else {
				System.out.println("Given string does't containt vowel");
			}
			t--;
		}
	}

}
