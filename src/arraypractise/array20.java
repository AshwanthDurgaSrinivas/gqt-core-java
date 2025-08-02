
package arraypractise;
import java.util.Scanner;
class lowertraingle{
	int a[][];
	int n;
	Scanner sc= new Scanner(System.in);
	int k;
	int sum;
	void create() {
	
	System.out.println("Enter the array size :") ;
	 n= sc.nextInt();
	a=new int[n][n];
	
	System.out.println("Enter the elements : ");
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			System.out.println("row : "+(i+1)+" column: "+(j+1));      
			a[i][j]=sc.nextInt();
		}
		}
	System.out.println("----------------------------------------------------");
	
	}
	void display() {
	for(int i=0;i<a.length;i++) {
		for (int j=0;j<a.length;j++) {
			if(j>=i&&j<a.length) {
			System.out.print(a[i][j]+"	");
			sum+=a[i][j];
			}
			else {
				System.out.print("	 ");
			}
		}
			System.out.println();
		}	
	System.out.println("sum of upper triangle : "+sum);
	}
}

public class array20 {

	
	public static void main(String[] args) {
		lowertraingle so= new lowertraingle();
		so.create();
		so.display();
		
	}
	
}

