package strings;
import java.util.Scanner;

public class revereseWord {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
		
		
		//step-1: counting Spaces
		int spc_count=0;
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)==' ') {
				spc_count++;
			}
		}
	
		//step-2: find the word count
		int word_count=spc_count+1;
		
		//step-3: create array based on the word count
		String arr[]=new String[word_count];
		
		
		//step-4: traverse the string and store into the array
		int temp = arr.length-1;
		int sp=0;
		String temp_str="";
		for(int i=str.length()-1; i>=0; i--) {
			if(str.charAt(i)!=' ') {
				temp_str=temp_str+str.charAt(i);
			}else{
				arr[temp]=temp_str;
				temp--;
				temp_str="";
				sp++;
			}
		}
		
		arr[temp]=temp_str;
		
		for(int i=arr.length-1; i>=0; i--) {
			if(arr[i].isBlank()==false) {
				
					System.out.print(arr[i]+" ");
					
			
			}
			
		}
		
		
	}

}