package arrays;
import java.util.Scanner;
class arrayoperation{
	int a[];
	Scanner sc=new Scanner(System.in);
	void create() {
		System.out.println("Enter the student count:");
		int n = sc.nextInt();
		 a=new int[n];
		 System.out.println("Arrray Created");
	}
	void collectdata() {
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the marks of student no:"+(i+1));
			a[i]=sc.nextInt();
			}
		System.out.println("Data Collected");
		System.out.println("----------------");
	}
	void dispaly() {
		for(int i=0;i<a.length;i++) {
			System.out.println("Displaying the data");
			System.out.println("The marks of student no:"+(i+1)+" is = "+a[i]);
		
			}
	}
}
public class arraycode2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayoperation ao =new arrayoperation();
		ao.create();
		ao.collectdata();
		ao.dispaly();

	}

}
