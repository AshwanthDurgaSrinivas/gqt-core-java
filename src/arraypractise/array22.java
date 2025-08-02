
package arraypractise;
import java.util.Scanner;
class symmetricmatrix{
	int a[][];
	int b[][];
	int n;
	boolean sym=true;
	Scanner sc= new Scanner(System.in);
	int k;
	

	void create() {
	
	System.out.println("Enter the array size :") ;
	 n= sc.nextInt();
	a=new int[n][n];
	b=new int[n][n];
	
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
		for (int j=0;j<a[i].length;j++) {
			b[j][i]=a[i][j];	
		}
		}
	for(int i=0;i<a.length;i++) {
		for (int j=0;j<a[i].length;j++) {
			if(b[i][j]!=a[i][j]) {
				sym=false;
			}
		}
		}
	if(sym) {
		System.out.println("given matrix is symmetric");
	}
	else {
		System.out.println("given matric is not symmetric");
	}
	}
}

public class array22 {

	
	public static void main(String[] args) {
		symmetricmatrix so= new symmetricmatrix();
		so.create();
		so.display();
		
	}
	
}

