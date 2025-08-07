package strings;

import java.util.Scanner;

public class vowelsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the strng: ");
		String str = sc.nextLine();
		int Cap_count = 0;
		int low_count = 0;
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'){
				Cap_count++;
				
			}
			else if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
				low_count++; 
				
			}
		}
			
System.out.println("count of captial case vowels: "+Cap_count);
System.out.println("count of lower case vowels: "+low_count);
	}

}
