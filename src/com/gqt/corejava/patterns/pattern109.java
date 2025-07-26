package com.gqt.corejava.patterns;

import java.util.Scanner;

public class pattern109 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i, j, k;
		
		System.out.print("Enter size = ");
		int rows = sc.nextInt();
	
		
		for (i = 1 ; i <= rows; i++ ) 
		{
			for (j = 1 ; j <= rows - i; j++ ) 
			{
				System.out.print("\t");	
			}
			for (k = 1 ; k <= i * 2 - 1; k++ ) 
			{
				if (k == 1 || k == i * 2 - 1) {
					System.out.print(i+"\t");
				}
				else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		
		for (i = rows - 1 ; i > 0; i-- ) 
		{
			for (j = 1 ; j <= rows - i; j++ ) 
			{
				System.out.print("\t");
			}
			for (k = 1 ; k <= i * 2 - 1; k++ ) 
			{
				if (k == 1 || k == i * 2 - 1) {
					System.out.print(i+"\t");
				}
				else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}