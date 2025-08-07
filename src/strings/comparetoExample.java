package strings;

import java.util.Scanner;

public class comparetoExample {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the String -1: ");
	String str1=sc.nextLine();
	System.out.println("Enter the String -2: ");
	String str2=sc.nextLine();
	if(str1.compareTo(str2)==0) {
		System.out.println("Strings are Equal");	
	}
	else {
		System.out.println("Strings are Not Equal");
	}
	System.out.println("--------------------------------");
	System.out.println("Enter the String -1: ");
	str1=sc.nextLine();
	System.out.println("Enter the String -2: ");
	str2=sc.nextLine();
	if(str1.compareToIgnoreCase(str2)==0) {
		System.out.println("Strings are Equal");	
	}
	else {
		System.out.println("Strings are Not Equal");
	}
}
}
