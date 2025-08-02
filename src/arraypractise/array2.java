
package arraypractise;
import java.util.Scanner;


public class array2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array size :") ;
		int n = sc.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the element : "+(i+1));
			a[i]=sc.nextInt();
			}
		int min =a[0];
		int max =a[0];
		System.out.println("----------------------------------------------------");
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			else if(a[i]<min) {
				min=a[i];
			}
			
			}
		System.out.println("largest value:"+max);
		System.out.println("smallest value:"+min);
	}

}
