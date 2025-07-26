package com.gqt.corejava.patterns;
import java.util.Scanner;
public class pattern107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size:");
		int n =sc.nextInt();
		for(int i =1;i<=n;i++) {
			for (int j=n;j>i;j--) {
				
					System.out.print("\t");
			}
		
			for(int k=1;k<=i;k++) {
				System.out.print(k +"\t");
	
	
				}
			if(i>=2) {
				int p=i;
				for(int k=1;k<i;k++) {
					System.out.print((p-1)+"\t");
					p--;
				}
				
			}
			
			System.out.println();
		}
	}

}
