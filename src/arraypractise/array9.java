
package arraypractise;
import java.util.Scanner;


public class array9 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array size :") ;
		int n = sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int temp;
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the element : "+(i+1));
			a[i]=sc.nextInt();
			}
		System.out.println("----------------------------------------------------");
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the element : "+(i+1));
			b[i]=sc.nextInt();
			}
		System.out.println("----------------------------------------------------");
		for (int j=0;j<a.length;j++) {
			for(int i=0;i<a.length-1;i++) {
				if(a[i]>a[i+1]) {
				temp =a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				
				}
			}
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
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
			
				if(a[i]==b[j]) {
					System.out.print(a[i]);
				}
			}
		}
		
	}

}
