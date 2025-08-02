/**
 * 
 */
package arraypractise;
import java.util.Scanner;

/**
 * 
 */
public class array1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter the array size :") ;
		int n = sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the element : "+(i+1));
			a[i]=sc.nextInt();
			}
		System.out.println("----------------------------------------------------");
		for(int i=0;i<a.length;i++) {
			sum += a[i];
			}
		System.out.println("sum of the element:"+ sum);
	}

}
