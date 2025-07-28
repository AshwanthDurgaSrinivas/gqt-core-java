package com.gqt.corejava.patternsnew;

import java.util.Scanner;
/**
 * @author Durga
 * @category patterns
 * @description This is an example for number pattern
 */
public class numbers {

	/**
	 * @param args
	 * @description This contains source code for the numbers
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			/*
			 * 1
			 */
			for(int j=0;j<n;j++) {
				if(j==(n/2)||i==(n-1)||(j+i==(n/2)&&i<=(n/4))) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * 2
			 */
			for(int j=0;j<n;j++) {
				if( j==(n-1)&&(i<(n/2)&&i>0) || (i == n/2&&(j>=1&&j<=(n-2)))||(i==(n-1)&&j>=1)||(i==0&&j<=(n-2))||(j==0&&(i>(n/2)&&i<(n-1))))
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * 3
			 */
			for(int j=0;j<n;j++) {
				if(i==0&&j<(n-1) ||  i == (n-1)&&j>(n-1)||i==(n/2)&&j<=(n-2)||j==(n-1)&&(i<(n-1)&&i>0&&i!=(n/2))||(i==(n-1)&&j<(n-1))) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			
			/*
			 * 4
			 */
			for(int j=0;j<n;j++) {
				if(j==0&&(i<(n/2))||i==(n/2)&&(j>0)||j==(n-1)) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * 5
			 */
			for(int j=0;j<n;j++) {
				if(j==0&&(i<=(n/2))||i==(n/2)&&(j<(n-1))||j==(n-1)&&(i>(n/2)&&i<(n-1))||i==0||(i==(n-1)&&j<(n-1))) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * 6
			 */
			for(int j=0;j<n;j++) {
				if((j==0&&(i<(n-1)&&i>0)) ||i==(n/2)&&(j<(n-1))||j==(n-1)&&(i>(n/2)&&i<(n-1))||(i==0&&j>0)||(i==(n-1)&&(j<(n-1)&&j!=0))) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * 7
			 */
			for(int j=0;j<n;j++) {
				if(i==0||j==(n-1)) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * 8
			 */
			for(int j=0;j<n;j++) {
				if((j==0&&(i<(n-1)&&i>0&&i!=(n/2))) ||i==(n/2)&&(j!=0&&j<(n-1))||j==(n-1)&&(i<(n-1)&&i!=(n/2)&&i!=0)||(i==0&&(j>0&&j<(n-1)))||(i==(n-1)&&(j<(n-1)&&j!=0))) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * 9
			 */
			for(int j=0;j<n;j++) {
				if((j==0&&( i!=0 && i<(n/2))) ||i==(n/2)&&(j>0&&j<=(n-1))||j==(n-1)&&(i<(n-1)&&i!=(n/2)&&i!=0)||(i==0&&(j>0&&j<(n-1)))||(i==(n-1)&&(j<(n-1)&&j!=0))) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * 0
			 */
			for(int j=0;j<n;j++) {
				if((j==0&&(i<(n-1)&&i>0)) ||j==(n-1)&&(i<(n-1)&&i!=0)||(i==0&&(j>0&&j<(n-1)))||(i==(n-1)&&(j<(n-1)&&j!=0))) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			System.out.println();
		}
	}

}
