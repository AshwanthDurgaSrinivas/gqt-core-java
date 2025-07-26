package com.gqt.corejava.patterns;
import java.util.Scanner;
public class pattern114 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size:");
		int n =sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for(int j=n-1;j>=i;j--) {
				System.out.print("\t");
			}
            char characterToPrint = (char) ('A' + i - 1); 
            for (int j = 1; j <= i*2-1; j++) {
                System.out.print(characterToPrint+"\t");
                
            }
            
            
            System.out.println(); 
		}
	}

}
