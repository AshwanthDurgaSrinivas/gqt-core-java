
package arraypractise;
import java.util.Scanner;
class sumtraingle{
	int a[][];
	int n;
	Scanner sc= new Scanner(System.in);
	int k;
	int sumrow;
	int sumcolumns;

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
		for (int j=0;j<a[i].length;j++) {
			sumrow+=a[i][j];
			sumcolumns+=a[j][i];
		}
		System.out.println("sum of elements in row "+(i+1)+" is :"+sumrow);
			sumrow=0;
			System.out.println("sum of elements in column"+(i+1)+" is :"+sumcolumns);
			sumcolumns=0;
		}	
	}
}

public class array21 {

	
	public static void main(String[] args) {
		sumtraingle so= new sumtraingle();
		so.create();
		so.display();
		
	}
	
}

