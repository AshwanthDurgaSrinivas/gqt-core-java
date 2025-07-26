package com.gqt.corejava.patterns;

import java.util.Scanner;

public class pattern110 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter size = ");
		int n = sc.nextInt();
		for(int i =n;i>=1;i--) {
			for (int j=i+1;j<=n;j++) {
				
				System.out.print("\t");
		}
			for(int k=i;k>=1;k--) {
				System.out.print(i +"\t");
	
	
				}
			
			if(i>=2) {
				for(int k=i;k>1;k--) {
					System.out.print(i+"\t");
				}
				
				
			}
			
			System.out.println();
		}
		for(int i =2;i<=n;i++) {
			for (int j=n-1;j>=i;j--) {
				
					System.out.print("\t");
			}
			for(int k=2;k<=i;k++) {
				System.out.print(i +"\t");
	
	
				}
			if(i>=2) {
				for(int k=1;k<=i;k++) {
					System.out.print(i+"\t");
				}
				
			}
			
			System.out.println();
		}
	
	}
		
}