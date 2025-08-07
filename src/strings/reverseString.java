package strings;

import java.util.Scanner;

public class reverseString {
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
	
	}
	

}
