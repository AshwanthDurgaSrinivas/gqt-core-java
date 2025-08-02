package arraypractise;

import java.util.Scanner;

class checkpalindrome{
	int a[];
	int n;
	boolean p =true;
	Scanner sc = new Scanner(System.in);
	
	void create() {
		System.out.println("enter the size:");
		 n = sc.nextInt();
		a=new int[n];
		
		
	}
	void data() {
		for( int i=0;i<n;i++ ) {
			a[i]=sc.nextInt();
		}
		
	}
	void check() {
		for(int i=0;i<n/2;i++) {
			if(a[i]!=a[n-1-i]) {
				p=false;
			}
			else {
				p=true;
			}
		}
		if(p) {
			System.out.println("array is palindrome");
		}
		else {
			System.out.println("array is not a palindrome");
		}
	}
}
public class array10 {
	public static void main(String[] args) {
	
	
	checkpalindrome cp= new checkpalindrome();
	cp.create();
	cp.data();
	cp.check();
	}
	

}
