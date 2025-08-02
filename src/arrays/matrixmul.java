package arrays;
import java.util.Scanner;
class mul{
	int a[][];
	int b[][];
	int d[][];
	int c2;
	int c1;
	int r1;
	int r2;
	Scanner sc=new Scanner(System.in);
	void create() {
		System.out.println("Enter the matrix 1 size:");
		System.out.println("row :");

		 r1 = sc.nextInt();
		System.out.println("column :");
		 c1=sc.nextInt();
		System.out.println("Enter the matrix 2 size:");
		System.out.println("row :");

		 r2 = sc.nextInt();
		System.out.println("column :");
		 c2=sc.nextInt();

		
		 a=new int[r1][c1];
		 b= new int[r2][c2];
		 
		 d=new int[r1][c2];
		 System.out.println("Arrray Created");
	}
	void collectdata() {
		System.out.println("first matrix");
		for(int i=0;i<a.length;i++) {
			System.out.println("First Row data:"+(i+1));
			for(int j=0;j<a[i].length;j++) {
				System.out.println("Enter the value at column no :"+(j+1));
				a[i][j]=sc.nextInt();
			}
			
			}
		System.out.println("second matrix");
		for(int i=0;i<b.length;i++) {
			System.out.println("First Row data:"+(i+1));
			for(int j=0;j<b[i].length;j++) {
				System.out.println("Enter the value at column no :"+(j+1));
				b[i][j]=sc.nextInt();
			}
			
			}
		System.out.println("Data Collected");
		System.out.println("----------------");
	}
//	void addition() {
//		for(int i=0;i<b.length;i++) {
//			for(int j=0;j<a[i].length;j++) {
//				c[i][j]=a[i][j]+b[i][j];
//			}
//			
//			}
//		System.out.println("added matrix");
//		for(int i=0;i<c.length;i++) {
//			
//			for(int j=0;j<c[i].length;j++) {
//				System.out.print(c[i][j]+" ");
//			}
//			System.out.println();
//			}
//	}
	void multi() {
		if(r1==c2) {
			
		
		for(int i=0;i<r1;i++) {
			
			for(int j=0;j<c2;j++) {
				for (int k=0;k<c1;k++) {
					
					d[i][j]=d[i][j]+(a[i][k]*b[k][j]);
				}
				
			}
			}
		}
		System.out.println("multipled matrix");
		for(int i=0;i<r1;i++) {
			
			for(int j=0;j<d[i].length;j++) {
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
			}
		
	}
}
public class matrixmul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mul ao =new mul();
		ao.create();
		ao.collectdata();
		//ao.addition();
		ao.multi();

	}

}
