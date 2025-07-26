package com.gqt.corejava.patterns;
import java.util.Scanner;
public class pattern121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size:");
		int n =sc.nextInt();
		char characterToPrints = 'A';
		for (int i = 1; i <= n; i++) {
			for(int j=n-1;j>=i;j--) {
				System.out.print("\t");
			}
            char characterToPrint = 'A'; 
            for (int j = 1; j <= i; j++) {
                System.out.print(characterToPrint+"\t");
                characterToPrint ++;
                
            }
            if(i>=2) {
            	 
                for (int j = 1; j < i; j++) {
                    System.out.print(characterToPrints+"\t");
                    characterToPrints--;
                }	
                characterToPrints = (char) (characterToPrints+i);
            }
            
          
            System.out.println(); 
		}
	}

}
