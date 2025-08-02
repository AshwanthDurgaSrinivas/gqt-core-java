
package arraypractise;
import java.util.Scanner;
class countelement{
	int zeros;
	int a[];
	int n;
	int pos;
	int neg;
	
	Scanner sc= new Scanner(System.in);
	void create() {
	
	System.out.println("Enter the array size :") ;
	 n= sc.nextInt();
	a=new int[n];
	
	System.out.println("Enter the elements : ");
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
		}
	System.out.println("----------------------------------------------------");
	for(int i=0;i<a.length;i++) {
		
		System.out.print(a[i]);
	}
	System.out.println();
	}
	void positandnegat() {
			for(int i=0;i<a.length;i++) {
				if(a[i]==0) {
					zeros+=1;
				}
				else if(a[i]<0) {
					neg+=1;
				}
				else if(a[i]>0){
					pos+=1;
				}	
			}
		System.out.println();
			System.out.println(" count of positive numbers "+pos);
			System.out.println(" count of negative numbers "+neg);
			System.out.println(" count of zeros  "+zeros);	
	}
	
	
}

public class array25 {

	
	public static void main(String[] args) {
		countelement so= new countelement();
		so.create();
		so.positandnegat();
		
	}
	
}

