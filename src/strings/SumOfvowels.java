package strings;

import java.util.Scanner;

public class SumOfvowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the strng: ");
		String str = sc.nextLine();
		int up_vow_sum=0;
		int low_vow_sum=0;
		int pro_con=1;
		for(int i=0;i<str.length();i++) {
			if((str.charAt(i)>='A'&&str.charAt(i)<='Z')||(str.charAt(i)>='a'&&str.charAt(i)<='z')) {
				if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'){
					up_vow_sum+=str.charAt(i);
					
				}
				else if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
					low_vow_sum+=str.charAt(i);
					
				}
				else {
					pro_con*=str.charAt(i);
					
				}
			}
		}
		System.out.println("sum of the captial  case vowels: "+up_vow_sum);
		System.out.println("sum of the lower case vowels: "+low_vow_sum);
		if(pro_con!=1) {
		System.out.println("product of the consonants vowels: "+pro_con);
		}
		else {
			System.out.println("product of the consonants vowels: 0");
		}
	}

}
