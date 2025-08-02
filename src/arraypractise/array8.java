
package arraypractise;
import java.util.Scanner;


public class array8 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array size :") ;
		int n = sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int m=n*2;
		int c[]=new int[m];
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
	
		for(int i=0;i<a.length;i++) {	
				c[i]=a[i];
		}
		int k=0;
		for(int i=n;i<c.length;i++) {	
			c[i]=b[k++];
	}
		for (int j=0;j<c.length;j++) {
			for(int i=0;i<c.length-1;i++) {
				if(c[i]>c[i+1]) {
				temp =c[i];
				c[i]=c[i+1];
				c[i+1]=temp;
				
				}
			}
			}
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]);
		}
		
	}

}
