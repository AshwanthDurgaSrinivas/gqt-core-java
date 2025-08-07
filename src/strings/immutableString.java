package strings;

import java.util.Scanner;

public class immutableString {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String -1: ");
		String str1=sc.nextLine();
		System.out.println("Enter the String -2: ");
		String str2=sc.nextLine();
		str1.concat(str2);
		System.out.println("normal change:"+str1);
		str1=str1.concat(str2);
		System.out.println("after force-full change:"+str1);
		sc.close();
	}
}
