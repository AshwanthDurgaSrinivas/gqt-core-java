package com.gqt.corejava.patterns;
import java.util.Scanner;
public class pattern117 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size:");
		int n =sc.nextInt();
		for (int i = 0; i < n; i++) {
            

			for(int j=n-1;j>i;j--) {
				System.out.print("\t");
			}
            for (int k = i; k >=0; k--) {
                System.out.print(k+"\t"); 
      
            }
            if(i>=1) {
             for (int k = 1; k <=i; k++) {
                  System.out.print(k+"\t"); 
       
            }
            }
            
          
            System.out.println(); 
		}
	}

}
