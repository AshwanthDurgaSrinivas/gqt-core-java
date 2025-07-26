package com.gqt.corejava.patterns;
import java.util.Scanner;
public class pattern116 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size:");
		int n =sc.nextInt();
		int m=1;
		char characterToPrint = (char) ('A'); 
		for (int i = 1; i <= n; i++) {
            

			for(int j=n-1;j>=i;j--) {
				System.out.print("\t");
			}
            for (int j = i*2-1; j >= 1; j--) {
                System.out.print(characterToPrint+"\t");
                characterToPrint --;
                
                
            }
           characterToPrint = (char) ('A'+i+m);
           m++;

            
          
            System.out.println(); 
		}
	}

}
