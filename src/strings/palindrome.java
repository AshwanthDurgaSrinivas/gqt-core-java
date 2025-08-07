package strings;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the strng: ");
		String str = sc.nextLine();
		String res="";
	
		for(int i = str.length()-1;i>=0;i--) {
			res=res+str.charAt(i);
		}
	System.out.println("reveresed String:"+res);
	if(res.equalsIgnoreCase(str)) {
		System.out.println("palindrome");
	}
	else {
		System.out.println(" not palindrome");
	}
	
	}
}
