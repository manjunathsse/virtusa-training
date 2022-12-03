import java.util.Scanner;
public class TrimWhiteSpace {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the input string");
		String str=s.nextLine();
		String str2=str.replaceAll("\\s","");
		System.out.println(str2);
	}
}
