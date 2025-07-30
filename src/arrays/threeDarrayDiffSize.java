package arrays;
import java.util.Scanner;
class arrayoperation4{
	String a[][][];
	Scanner sc=new Scanner(System.in);
	void create() {
		System.out.println("Enter the School count:");
		int sch = sc.nextInt();
		a=new String[sch][][];
		for(int i =0;i<a.length;i++) {
			 System.out.println("Enter the class count in school no :"+(i+1));
			 int cls=sc.nextInt();
			 
				a[i]= new String[cls][];
		}
		for(int i =0;i<a.length;i++) {
			 System.out.println("Inside the school :"+(i+1));
				for(int j =0;j<a[i].length;j++) {
					System.out.println("Inside the class :"+(j+1));
					 System.out.println("Enter the student count in :");
					 int stu=sc.nextInt();
					 
						a[i][j]= new String[stu];
				 }
		 }
		System.out.println("array created");
		
		
	}
	void collectdata() {
		for(int i=0;i<a.length;i++) {
			System.out.println("Inside the school:"+(i+1));
			for(int j=0;j<a[i].length;j++) {
				System.out.println("Inside the class:"+(j+1));
				for(int k=0;k<a[i][j].length;k++) {
					System.out.println("Enter the name of student no : "+(k+1));
					a[i][j][k]=sc.next();	
				}
				
				
				
			}
			
			}
		System.out.println("Data Collected");
		System.out.println("----------------");
	}
	void dispaly() {
		for(int i=0;i<a.length;i++) {
			System.out.println("Inside the school:"+(i+1));
			for(int j=0;j<a[i].length;j++) {
				System.out.println("Inside the class:"+(j+1));
				for(int k=0;k<a[i][j].length;k++) {
					System.out.println(" the name of student  no "+(k+1)+" is = "+a[i][j][k] );
						
				}
				
				
				
			}
			}
	}
}
public class threeDarrayDiffSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayoperation4 ao =new arrayoperation4();
		ao.create();
		ao.collectdata();
		ao.dispaly();

	}

}
