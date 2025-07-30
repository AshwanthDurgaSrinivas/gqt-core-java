package arrays;
import java.util.Scanner;
class arrayoperation3{
	String a[][][];
	Scanner sc=new Scanner(System.in);
	void create() {
		System.out.println("Enter the School count:");
		int sch = sc.nextInt();
		System.out.println("Enter the class count:");
		int cls = sc.nextInt();
		System.out.println("Enter the student count:");
		int stu = sc.nextInt();
		 a=new String[sch][cls][stu];
		 System.out.println("Arrray Created");
	}
	void collectdata() {
		for(int i=0;i<a.length;i++) {
			System.out.println("Inside the school:"+(i+1));
			for(int j=0;j<a[i].length;j++) {
				System.out.println("Inside the class:"+(j+1));
				for(int k=0;k<a[i][j].length;k++) {
					System.out.println("Enter the name of student "+(k+1));
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
					System.out.println(" the name of student "+(k+1)+" is: "+a[i][j][k] );
						
				}
				
				
				
			}
			}
	}
}
public class threeDarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayoperation3 ao =new arrayoperation3();
		ao.create();
		ao.collectdata();
		ao.dispaly();

	}

}
