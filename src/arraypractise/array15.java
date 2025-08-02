
package arraypractise;
import java.util.Scanner;
class index{
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
	System.out.println("enter the element to search");
	k=sc.nextInt();
	System.out.println();
	}
	void find() {
		for (int j=0;j<a.length;j++) {
			if(k==a[j]) {
				System.out.println("element found at index no : "+j);
				break;
			}
			
		}
	}
	
	
}

public class array15 {

	
	public static void main(String[] args) {
		index so= new index();
		so.create();
		so.find();
		
	}
	
}

