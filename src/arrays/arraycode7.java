package arrays;
import java.util.Scanner;
class movieoperation{
	long a[][][];
	Scanner sc=new Scanner(System.in);
	long invested ;
	long earned;
	long prev_profit;
	void create() {
		System.out.println("Enter the Language count:");
		int lan = sc.nextInt();
		a=new long[lan][][];
		for(int i =0;i<a.length;i++) {
			 System.out.println("Enter the category count in language no :"+(i+1));
			 int cat=sc.nextInt();
			 
				a[i]= new long[cat][];
		}
		for(int i =0;i<a.length;i++) {
			 System.out.println("Inside the language :"+(i+1));
				for(int j =0;j<a[i].length;j++) {
					System.out.println("Inside the category :"+(j+1));
					 System.out.println("Enter the movies count in :");
					 int mov=sc.nextInt();
					 
						a[i][j]= new long[mov];
				 }
		 }
		System.out.println("array created");
		
		
	}
	void collectdata() {
		 System.out.println("Enter the invesment:");
		 invested =sc.nextInt();
		System.out.println("Enter the previous year profit:");
		 prev_profit =sc.nextInt();
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Inside the language:"+(i+1));
			for(int j=0;j<a[i].length;j++) {
				System.out.println("Inside the category:"+(j+1));
				for(int k=0;k<a[i][j].length;k++) {
					System.out.println("Enter the revenue earned by the movie no: "+(k+1)+" in crores:");
					a[i][j][k]=sc.nextLong();
					 earned = earned+a[i][j][k];
					
				}	
			}
			
			}
		System.out.println("Revenue Collected");
		System.out.println("-------------------------------------------");
	}
	void profitOrloss() {
		for(int i=0;i<a.length;i++) {
			System.out.println("Inside the language:"+(i+1));
			for(int j=0;j<a[i].length;j++) {
				System.out.println("Inside the category:"+(j+1));
				for(int k=0;k<a[i][j].length;k++) {
					System.out.println("The revenue earned by the movie no: "+(k+1)+" is : "+a[i][j][k]);
				}
			}
		}
		System.out.println("-------------------------------------------");

		if(invested <earned) {
			long profit =earned-invested;
			System.out.println("Hemanth is in profit: "+profit);
			if(profit>prev_profit) {
				System.out.println("Hemanth earned more profit then last year");
			}
			else {
				System.out.println("Hemanth earned less profit then last year");
			}
		}
		else {
			System.out.println("Hemanth is in loss: "+ (invested-earned));
		}
		
			
	}
}
public class arraycode7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		movieoperation ao =new movieoperation();
		ao.create();
		ao.collectdata();
		ao.profitOrloss();

	}

}
