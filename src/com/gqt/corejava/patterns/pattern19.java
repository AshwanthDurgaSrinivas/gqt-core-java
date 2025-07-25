package com.gqt.corejava.patterns;

import java.util.Scanner;

public class pattern19 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size:");
		int n = sc.nextInt();
		int m=1;
		for (int i=n;i>=1;i--) {
			for (int j=1;j<=i;j++) {
				
				System.out.print(m +"\t");
				m++;
			}
			System.out.println();
		}
		sc.close();

	}

}
