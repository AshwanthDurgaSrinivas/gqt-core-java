package arrays;
import java.util.Scanner;
class arrayoperation2{
	String a[][];
	Scanner sc=new Scanner(System.in);
	void create() {
		System.out.println("Enter the class count:");
		int cls = sc.nextInt();
		
		 a=new String[cls][];
		 for(int i =0;i<a.length;i++) {
			 System.out.println("Enter the student count in class no:"+(i+1));
				a[i] = new String[sc.nextInt()];
		 }
		 System.out.println("Arrray Created");
	}
	void collectdata() {
		for(int i=0;i<a.length;i++) {
			System.out.println("Inside the class:"+(i+1));
			for(int j=0;j<a[i].length;j++) {
				System.out.println("Enter the name of student no :"+(j+1));
				a[i][j]=sc.next();
			}
			
			}
		System.out.println("Data Collected");
		System.out.println("----------------");
	}
	void dispaly() {
		for(int i=0;i<a.length;i++) {
			System.out.println("Inside the class:"+(i+1));
			for(int j=0;j<a[i].length;j++) {
				System.out.println("name of student no :"+(j+1)+(a[i][j]));
			}
			
			}
	}
}
public class twoDarrayupdated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayoperation2 ao =new arrayoperation2();
		ao.create();
		ao.collectdata();
		ao.dispaly();

	}

}
