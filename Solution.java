import java.util.*;
public class Solution {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		char ch[]=str.toCharArray();
		char ch2[]=str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++) {
			ch[i]=ch2[ch.length-1-i];
			String str2=new String(ch);
			StringBuilder str3=new StringBuilder(str2);
			StringBuilder str4=new StringBuilder(str3.reverse());
			String str5=str4.toString();
			if(str2.equals(str5)) {
				count++;
			}
			ch[i]=ch2[i];
		}
		System.out.println(count);
	}
}
