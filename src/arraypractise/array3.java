
package arraypractise;
import java.util.Scanner;


public class array3 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array size :") ;
		int n = sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the element : "+(i+1));
			a[i]=sc.nextInt();
			}
		System.out.println("----------------------------------------------------");
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
			}
		for(int i=0;i<a.length;i++) {
			System.out.println("second matrix:");
			System.out.print(b[i]);
		}
		
	}

}
