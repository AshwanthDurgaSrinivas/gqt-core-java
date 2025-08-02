
package arraypractise;
import java.util.Scanner;


public class array5 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array size :") ;
		int n = sc.nextInt();
		int a[]=new int[n];
		int temp;
		System.out.println("Enter the elements : ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			}
		System.out.println("----------------------------------------------------");
		for(int i=0;i<(a.length/2);i++) {
			temp =a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=temp;
			
			}
		System.out.println("reversed array : ");

		for(int i=0;i<a.length;i++) {
			
			System.out.print(a[i]);
		}
		
	}

}
