
package arraypractise;
import java.util.Scanner;
class equal{
	int a[];
	int b[];
	int n;
	int m;
	int temp;
	Scanner sc= new Scanner(System.in);
	int k;
	void create() {
	
	System.out.println("Enter the  a array size :") ;
	 n= sc.nextInt();
	a=new int[n];
	
	System.out.println("Enter the elements : ");
	for(int i=0;i<a.length;i++) {     
			a[i]=sc.nextInt();
		
		}
	for (int j=0;j<a.length;j++) {
		for(int i=0;i<a.length-1;i++) {
			if(a[i]>a[i+1]) {
			temp =a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
			
			}
		}
		}
	System.out.println("----------------------------------------------------");
	System.out.println("Enter the b array size :") ;
	 m= sc.nextInt();
	b=new int[m];
	
	System.out.println("Enter the elements : ");
	for(int i=0;i<b.length;i++) {     
			b[i]=sc.nextInt();
		
		}
	for (int j=0;j<b.length;j++) {
		for(int i=0;i<b.length-1;i++) {
			if(b[i]>b[i+1]) {
			temp =b[i];
			b[i]=b[i+1];
			b[i+1]=temp;
			
			}
		}
		}
	System.out.println("----------------------------------------------------");
	}
	void find() {
		boolean eq=true;
		if(a.length==b.length) {
			for(int i=0;i<a.length;i++) {
				if(a[i]!=b[i]) {
					eq=false;
				}
			}	
		}
		else {
			eq=false;
		}
		if(eq) {
			System.out.println("two arrays are equal");
		}
		else {
			System.out.println("two arrays are  non equal");

		}
	}
}

public class array18 {

	
	public static void main(String[] args) {
		equal so= new equal();
		so.create();
		so.find();
		
	}
	
}

