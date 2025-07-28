package com.gqt.corejava.patternsnew;

import java.util.Scanner;
/*
- - - - - $
- - - - $ $ $
- - - $ $ $ $ $
- - $ $ $ $ $ $ $
- $ $ $ $ $ $ $ $ $ 
 */

/**
 * @author Durga
 * @category patterns
 * @description This is an example for pyramid pattern
 */
public class NewPattern3 {

	/**
	 * @param args
	 * @description This contains source code for the pattern
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("- ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
