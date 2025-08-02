
package arraypractise;
import java.util.Scanner;
class sortings{
	int temp;
	int a[];
	Scanner sc= new Scanner(System.in);
	void create() {
	
	System.out.println("Enter the array size :") ;
	int n = sc.nextInt();
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
	void asc() {
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
			System.out.println(" ascending ordered array : ");

			for(int i=0;i<a.length;i++) {
				
				System.out.print(a[i]);
			}
	}
	void des() {
		for (int j=0;j<a.length;j++) {
			for(int i=0;i<a.length-1;i++) {
				if(a[i]<a[i+1]) {
				temp =a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				
				}
			}
			}
		System.out.println();
			System.out.println(" descending ordered array : ");

			for(int i=0;i<a.length;i++) {
				
				System.out.print(a[i]);
			}
	}
}

public class array6 {

	
	public static void main(String[] args) {
		sortings so= new sortings();
		so.create();
		so.asc();
		so.des();
	}
	
}

