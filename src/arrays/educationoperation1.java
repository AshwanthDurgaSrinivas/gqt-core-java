package arrays;

import java.util.Scanner;

class eduoperation1{
	String a[][][];
	Scanner sc=new Scanner(System.in);
	long medicalfees ;
	long engfees;
	long degreefees;
	long earned;
	void create() {
		System.out.println("Enter the colleges count:");
		int col = sc.nextInt();
		a=new String[col][][];
		for(int i =0;i<a.length;i++) {
			 System.out.println("Enter the class count in college no :"+(i+1));
			 int cls=sc.nextInt();
			 
				a[i]= new String[cls][];
		}
		for(int i =0;i<a.length;i++) {
			 System.out.println("Inside the "+(i==0 ? "medical" :i==1 ? "Engineering":i==2 ?"Degree":"")+" college");
				for(int j =0;j<a[i].length;j++) {
					System.out.println("Inside the class :"+(j+1));
					 System.out.println("Enter the capacity  :");
					 int cap=sc.nextInt();
					 
						a[i][j]= new String[cap];
				 }
		 }
		System.out.println("array created");
		
		
	}
	void collectdata() {
		System.out.println("Enter the medical fees:");
		 medicalfees =sc.nextLong();
		 System.out.println("Enter the Engineering fees:");
		 engfees =sc.nextLong();
		 System.out.println("Enter the degree:");
		 degreefees =sc.nextLong();
		 
		for(int i=0;i<a.length;i++) {
			System.out.println("Inside the "+(i==0 ? "medical" :i==1 ? "Engineering":i==2 ?"Degree":"")+"College");
			for(int j=0;j<a[i].length;j++) {
				System.out.println("Inside the class:"+(j+1));
				for(int k=0;k<a[i][j].length;k++) {
					System.out.println("Enter the name of the student no: "+(k+1));
					a[i][j][k]=sc.next();
					if(i==0) {
						earned+=medicalfees;
					}
					else if(i==1) {
						earned+=engfees;
					}
					else {
						earned+=degreefees;
					}
					
				}	
			}
			
			}
		System.out.println("Revenue & data Collected");
		System.out.println("-------------------------------------------");
	}
	void display() {
		for(int i=0;i<a.length;i++) {
			System.out.println("Inside the college:"+(i+1));
			for(int j=0;j<a[i].length;j++) {
				System.out.println("Inside the class:"+(j+1));
				for(int k=0;k<a[i][j].length;k++) {
					System.out.println("The Name of the student no: "+(k+1)+" is : "+a[i][j][k]);
				}
			}
		}
		System.out.println("-------------------------------------------");

		System.out.println("overall revenue made : "+ earned);
		
			
	}
}
public class educationoperation1 {
	public static void main(String[] args) {
		eduoperation1 eo=new eduoperation1();
		eo.create();
		eo.collectdata();
		eo.display();
	}

}
