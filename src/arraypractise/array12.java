package arraypractise;

import java.util.Scanner;

class sumofnegative{
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
			if(a[i]<0) {
				sum+=a[i];
			}
			
		}
		System.out.println("sum of negative numbers:"+sum);
		
	}
}
public class array12 {
	public static void main(String[] args) {
	
	
	sumofnegative su= new sumofnegative();
	su.create();
	su.data();
	su.sum();
	}
	

}
