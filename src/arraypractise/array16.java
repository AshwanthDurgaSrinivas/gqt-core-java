
package arraypractise;
import java.util.Scanner;
class rotate{
	int temp;
	int a[];
	int n;
	Scanner sc= new Scanner(System.in);
	int k;
	void create() {
	
	System.out.println("Enter the array size :") ;
	 n= sc.nextInt();
	a=new int[n];
	
	System.out.println("Enter the elements : ");
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
		}
	System.out.println("----------------------------------------------------");
	System.out.println("enter the no of rotates : ");
	k=sc.nextInt();
	System.out.println();
	}
	void find() {
	for(int i=0;i<k;i++) {
		int first = a[0];
	
		for (int j=0;j<a.length-1;j++) {
			a[j]=a[j+1];
		}
		a[a.length-1]=first;
	}
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
	}
	
	
}

public class array16 {

	
	public static void main(String[] args) {
		rotate so= new rotate();
		so.create();
		so.find();
		
	}
	
}

