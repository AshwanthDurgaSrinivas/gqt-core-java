package com.gqt.corejava.patterns;
import java.util.Scanner;
public class pattern115 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size:");
		int n =sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for(int j=n-1;j>=i;j--) {
				System.out.print("\t");
			}
            for (int j = 1; j <= i*2 -1; j++) {
                System.out.print(j +"\t");
                
            }
           
  
            System.out.println(); 
		}
	}

}
