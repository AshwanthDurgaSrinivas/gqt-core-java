package arraypractise;

import java.util.Scanner;

class sumofpositive{
	int a[];
	int n;
	int sum=0;
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
	void sum() {
		for(int i=0;i<n;i++) {
			if(a[i]>0) {
				sum+=a[i];
			}
			
		}
		System.out.println("sum of positive numbers:"+sum);
		
	}
}
public class array11 {
	public static void main(String[] args) {
	
	
	sumofpositive su= new sumofpositive();
	su.create();
	su.data();
	su.sum();
	}
	

}
