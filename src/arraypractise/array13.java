package arraypractise;

import java.util.Scanner;

class product{
	int a[];
	int n;
	int po=1;
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
	void mul() {
		for(int i=0;i<n;i++) {
				po*=a[i];
		}
		System.out.println("product of numbers:"+po);
		
	}
}
public class array13 {
	public static void main(String[] args) {
	
	
	product su= new product();
	su.create();
	su.data();
	su.mul();
	}
	

}
