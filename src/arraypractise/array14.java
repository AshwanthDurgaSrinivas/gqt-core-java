
package arraypractise;
import java.util.Scanner;
class second_element{
	int temp;
	int a[];
	int n;
	Scanner sc= new Scanner(System.in);
	void create() {
	
	System.out.println("Enter the array size :") ;
	 n= sc.nextInt();
	a=new int[n];
	
	System.out.println("Enter the elements : ");
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
		}
	System.out.println("----------------------------------------------------");
	for(int i=0;i<a.length;i++) {
		
		System.out.print(a[i]);
	}
	}
	void largeandsmall() {
		for (int j=0;j<a.length;j++) {
			for(int i=0;i<a.length-1;i++) {
				if(a[i]>a[i+1]) {
				temp =a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				
				}
			}
			}
		System.out.println();
			System.out.println(" second largest element: "+a[n-2]);
			System.out.println(" second smallest element: "+a[1]);
			
			
	}
	
	
}

public class array14 {

	
	public static void main(String[] args) {
		second_element so= new second_element();
		so.create();
		so.largeandsmall();
		
	}
	
}

