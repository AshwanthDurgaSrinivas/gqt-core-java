package strings;

import java.util.Scanner;

public class VowelsandConsonants {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the strng: ");
		String str = sc.nextLine();
		int vowels_count = 0;
		int cons_count = 0;
		str=str.toUpperCase();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A'&&str.charAt(i)<='Z') {
				if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'){
					vowels_count++;
					
				}
				else {
					cons_count++;
					
				}
			}
		}
		System.out.println("vowels count: "+vowels_count);
		System.out.println("consonants count: "+cons_count);
	}

}
