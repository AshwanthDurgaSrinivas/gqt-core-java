
package com.gqt.corejava.patterns;
import java.util.Scanner;
public class pattern108 {

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
				for(int l=1;l<i;l++) {
					System.out.print((p-1)+"\t");
					p--;
				}
				
			}
			
			System.out.println();
		}
		for(int m=1;m<n;m++) {
			for(int o=1;o<=m;o++) {
				if(o==1) {
				System.out.print(" \t");
				}
				else {
					System.out.print(" \t");
				}
			}
			for(int q=1;q<=n-m;q++) {
				System.out.print(q+"\t");
			}
				for(int r=n-m-1;r>=1;r--) {
				System.out.print(r+"\t");
			}
		
			System.out.println();
		}
	}

}
