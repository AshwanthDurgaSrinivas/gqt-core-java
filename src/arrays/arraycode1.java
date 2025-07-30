/**
 * 
 */
package arrays;
import java.util.Scanner;

/**
 * 
 */
public class arraycode1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the student count:");
		int n = sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the marks of student no:"+(i+1));
			a[i]=sc.nextInt();
			}
		System.out.println("----------------------------------------------------");
		for(int i=0;i<a.length;i++) {
			
			System.out.println("The marks of student no:"+(i+1)+" is = "+ a[i]+" "+(a[i] >= 30 ? "pass" : "Fail")+" "+(a[i] >= 30 ? "pass" : "Fail"));
		
			}
	}

}
