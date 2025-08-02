
package arraypractise;
import java.util.Scanner;
class saddlepoint{
	int a[][];
	int saddle=0;
	int n;
	boolean sym=true;
	Scanner sc= new Scanner(System.in);
	int k;
	

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
		int min_row = a[i][0];
		int col_ind = 0;
        for (int j = 1; j < n; j++)
        {
            if (min_row > a[i][j])
            {
                min_row = a[i][j];
                col_ind = j;
            }
        }
        int k;
        for (k = 0; k < n; k++) {
 
            if (min_row < a[k][col_ind])
                break;
        }
        if (k == n)
        {
           System.out.println("Value of Saddle Point " + min_row);
        }
	}
	
	
	}
}

public class array23 {

	
	public static void main(String[] args) {
		saddlepoint so= new saddlepoint();
		so.create();
		so.display();
		
	}
	
}

