
package com.gqt.corejava.patterns;
import java.util.Scanner;
public class pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size:");
		int n = sc.nextInt();
		int m=1;
		for (int i=1;i<=n;i++) {
			for (int j=1;j<=n;j++) {
				System.out.print(m+"  ");
				m++;
			}
			System.out.println();
		}
		sc.close();

	}

}
