
package arraypractise;
import java.util.Scanner;
class spiral{
	int a[][];
	int n;
	Scanner sc= new Scanner(System.in);
	int k;
	void create() {
	
	System.out.println("Enter the array size :") ;
	 n= sc.nextInt();
	a=new int[n][n];
	
	System.out.println("Enter the elements : ");
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			System.out.print("row : "+i+"column: "+j);      
			a[i][j]=sc.nextInt();
		}
		}
	System.out.println("----------------------------------------------------");
	
	}
	void find() {
	for(int i=0;i<a.length;i++) {
		for (int j=0;j<a.length;j++) {
			System.out.print(a[i][j]+(i==a.length-1&&j==a.length-1? " ":","));
		}
			
		}	
	}
}

public class array17 {

	
	public static void main(String[] args) {
		spiral so= new spiral();
		so.create();
		so.find();
		
	}
	
}

