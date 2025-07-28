/**
 * 
 */
package com.gqt.corejava.patternsnew;

import java.util.Scanner;

/**
 * @author Durga
 * @category patterns
 * @description This is an example for message pattern
 */
public class message {

	/**
	 * @param args
	 * @description This contains source code for the message
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			/*
			 * T
			 */
			for(int j=0;j<n;j++) {
				if(j==(n/2) || i==0 ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * h
			 */
			for(int j=0;j<n;j++) {
				if( j==0 || j==(n-1) || i == n/2) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * A
			 */
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || j==(n-1) || i == n/2) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * N
			 */
			for(int j=0;j<n;j++) {
				if(j==0 ||j==(n-1)||i==j ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * K
			 */
			for(int j=0;j<n;j++) {
				if(i+j==(n/2) || j==0  || i-j == (n/2)) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			System.out.print("		");
			
			/*
			 * Y
			 */
			for(int j=0;j<n;j++) {
				if((i+j==(n-1)&&i<=(n/2))|| (i==j&&i<=(n/2))||(j==(n/2) &&i>=(n/2)) ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * o
			 */
			for(int j=0;j<n;j++) {
				if((j==0&&i!=0) ||(j==(n-1)&&i!=(n-1))||(i==0&&j!=0)||(i==(n-1)&&j!=(n-1)) ) 
				{
					if((j==0&&i==(n-1))||(i==0&&j==(n-1))) {
						System.out.print("  ");
						
					}
					else {
						
					
					System.out.print("# ");
					}
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * U
			 */
			for(int j=0;j<n;j++) {
				if((j==0) ||(j==(n-1)&&i!=(n-1))||(i==(n-1)&&j!=(n-1)) ) 
				{
					if((j==0&&i==(n-1))||(j==(n-1)&&i==(n-1))) {
						System.out.print("  ");
						
					}
					else {
						
					
					System.out.print("# ");
					}
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			System.out.print("		");
			
			/*
			 * G
			 */
			for(int j=0;j<n;j++) {
				if(i==0 || j==0  || (i == (n-1)&& j<=(n/2))||(j==(n/2)&& i>=(n/2))||(i==(n/2)&&j>=(n/2))||(j==(n-1)&&i>=(n/2))) 
					
				{
					if(j==(n-1)&&i==(n/2)||(i==(n-1)&&j==(n/2))||(i==0 && j==0)||(i==(n-1)&& j==0)) {
						System.out.print("  ");
					}
					else {
						
					
					System.out.print("# ");
					}
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * #
			 */
			for(int j=0;j<1;j++) {
				if(i==(n-1)) {
					System.out.print("# ");
				}
			}
			System.out.print("	");
			/*
			 * R
			 */
			for(int j=0;j<n;j++) {
				if((i==0&&j!=(n-1)) || j==0  || (i == (n/2)&&j!=(n-1))||(j==(n-1)&&(i<(n/2)&&i>=1))||(i==j&&i>=(n/2))) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			System.out.print("		");
			/*
			 * N
			 */
			for(int j=0;j<n;j++) {
				if(j==0 ||j==(n-1)||i==j ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * A
			 */
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || j==(n-1) || i == n/2) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * R
			 */
			for(int j=0;j<n;j++) {
				if((i==0&&j!=(n-1)) || j==0  || (i == (n/2)&&j!=(n-1))||(j==(n-1)&&(i<(n/2)&&i>=1))||(i==j&&i>=(n/2))) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * E
			 */
			for(int j=0;j<n;j++) {
				if(i==0 || j==0  || i == (n-1)||i==(n/2)) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * N
			 */
			for(int j=0;j<n;j++) {
				if(j==0 ||j==(n-1)||i==j ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * D
			 */
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || j==(n-1)  || i==(n-1)) 
				{
					if(i==0 && j==(n-1)|| i==(n-1)&& j==(n-1)) {
						System.out.print("  ");
					}
					else {
						System.out.print("# ");
					}
					
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * R
			 */
			for(int j=0;j<n;j++) {
				if((i==0&&j!=(n-1)) || j==0  || (i == (n/2)&&j!=(n-1))||(j==(n-1)&&(i<(n/2)&&i>=1))||(i==j&&i>=(n/2))) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * A
			 */
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || j==(n-1) || i == n/2) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		 ");
			System.out.print("		 ");
			/*
			 * R
			 */
			for(int j=0;j<n;j++) {
				if((i==0&&j!=(n-1)) || j==0  || (i == (n/2)&&j!=(n-1))||(j==(n-1)&&(i<(n/2)&&i>=1))||(i==j&&i>=(n/2))) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * E
			 */
			for(int j=0;j<n;j++) {
				if(i==0 || j==0  || i == (n-1)||i==(n/2)) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * D
			 */
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || j==(n-1)  || i==(n-1)) 
				{
					if(i==0 && j==(n-1)|| i==(n-1)&& j==(n-1)) {
						System.out.print("  ");
					}
					else {
						System.out.print("# ");
					}
					
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * D
			 */
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || j==(n-1)  || i==(n-1)) 
				{
					if(i==0 && j==(n-1)|| i==(n-1)&& j==(n-1)) {
						System.out.print("  ");
					}
					else {
						System.out.print("# ");
					}
					
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * Y
			 */
			for(int j=0;j<n;j++) {
				if((i+j==(n-1)&&i<=(n/2))|| (i==j&&i<=(n/2))||(j==(n/2) &&i>=(n/2)) ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			System.out.print("		");
			/*
			 * S
			 */
			for(int j=0;j<n;j++) {
				if( (j==0&&(i<(n/2)&&i>=1) || (j==(n-1)&&(i>(n/2)&&i<(n-1))) || (i == n/2&&(j>=1&&j<=(n-2)))||(i==(n-1)&&j<=(n-2))) ||(i==0&&j>=1))
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * I
			 */
			for(int j=0;j<n;j++) {
				if(j==(n/2) || i==0  || i == (n-1)) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * R
			 */
			for(int j=0;j<n;j++) {
				if((i==0&&j!=(n-1)) || j==0  || (i == (n/2)&&j!=(n-1))||(j==(n-1)&&(i<(n/2)&&i>=1))||(i==j&&i>=(n/2))) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * *
			 */
			for(int j=0;j<1;j++) {
				if(i==(n-1)) {
					System.out.print("* ");
				}
			}
			System.out.print("		");
			/*
			 * F
			 */
			for(int j=0;j<n;j++) {
				if(i==0 || j==0  || i == (n/2)) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * o
			 */
			for(int j=0;j<n;j++) {
				if((j==0&&i!=0) ||(j==(n-1)&&i!=(n-1))||(i==0&&j!=0)||(i==(n-1)&&j!=(n-1)) ) 
				{
					if((j==0&&i==(n-1))||(i==0&&j==(n-1))) {
						System.out.print("  ");
						
					}
					else {
						
					
					System.out.print("# ");
					}
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * R
			 */
			for(int j=0;j<n;j++) {
				if((i==0&&j!=(n-1)) || j==0  || (i == (n/2)&&j!=(n-1))||(j==(n-1)&&(i<(n/2)&&i>=1))||(i==j&&i>=(n/2))) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			System.out.print("		");
			/*
			 * Y
			 */
			for(int j=0;j<n;j++) {
				if((i+j==(n-1)&&i<=(n/2))|| (i==j&&i<=(n/2))||(j==(n/2) &&i>=(n/2)) ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * o
			 */
			for(int j=0;j<n;j++) {
				if((j==0&&i!=0) ||(j==(n-1)&&i!=(n-1))||(i==0&&j!=0)||(i==(n-1)&&j!=(n-1)) ) 
				{
					if((j==0&&i==(n-1))||(i==0&&j==(n-1))) {
						System.out.print("  ");
						
					}
					else {
						
					
					System.out.print("# ");
					}
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * U
			 */
			for(int j=0;j<n;j++) {
				if((j==0) ||(j==(n-1)&&i!=(n-1))||(i==(n-1)&&j!=(n-1)) ) 
				{
					if((j==0&&i==(n-1))||(j==(n-1)&&i==(n-1))) {
						System.out.print("  ");
						
					}
					else {
						
					
					System.out.print("# ");
					}
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * R
			 */
			for(int j=0;j<n;j++) {
				if((i==0&&j!=(n-1)) || j==0  || (i == (n/2)&&j!=(n-1))||(j==(n-1)&&(i<(n/2)&&i>=1))||(i==j&&i>=(n/2))) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			System.out.print("		");
			/*
			 * c
			 */
			for(int j=0;j<n;j++) {
				if(i==0 || j==0  || i == (n-1)) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * o
			 */
			for(int j=0;j<n;j++) {
				if((j==0&&i!=0) ||(j==(n-1)&&i!=(n-1))||(i==0&&j!=0)||(i==(n-1)&&j!=(n-1)) ) 
				{
					if((j==0&&i==(n-1))||(i==0&&j==(n-1))) {
						System.out.print("  ");
						
					}
					else {
						
					
					System.out.print("# ");
					}
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * N
			 */
			for(int j=0;j<n;j++) {
				if(j==0 ||j==(n-1)||i==j ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * S
			 */
			for(int j=0;j<n;j++) {
				if( (j==0&&(i<(n/2)&&i>=1) || (j==(n-1)&&(i>(n/2)&&i<(n-1))) || (i == n/2&&(j>=1&&j<=(n-2)))||(i==(n-1)&&j<=(n-2))) ||(i==0&&j>=1))
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * T
			 */
			for(int j=0;j<n;j++) {
				if(j==(n/2) || i==0 ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * A
			 */
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || j==(n-1) || i == n/2) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * N
			 */
			for(int j=0;j<n;j++) {
				if(j==0 ||j==(n-1)||i==j ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * T
			 */
			for(int j=0;j<n;j++) {
				if(j==(n/2) || i==0 ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			System.out.print("		");
			/*
			 * G
			 */
			for(int j=0;j<n;j++) {
				if(i==0 || j==0  || (i == (n-1)&& j<=(n/2))||(j==(n/2)&& i>=(n/2))||(i==(n/2)&&j>=(n/2))||(j==(n-1)&&i>=(n/2))) 
					
				{
					if(j==(n-1)&&i==(n/2)||(i==(n-1)&&j==(n/2))||(i==0 && j==0)||(i==(n-1)&& j==0)) {
						System.out.print("  ");
					}
					else {
						
					
					System.out.print("# ");
					}
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * U
			 */
			for(int j=0;j<n;j++) {
				if((j==0) ||(j==(n-1)&&i!=(n-1))||(i==(n-1)&&j!=(n-1)) ) 
				{
					if((j==0&&i==(n-1))||(j==(n-1)&&i==(n-1))) {
						System.out.print("  ");
						
					}
					else {
						
					
					System.out.print("# ");
					}
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * I
			 */
			for(int j=0;j<n;j++) {
				if(j==(n/2) || i==0  || i == (n-1)) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * D
			 */
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || j==(n-1)  || i==(n-1)) 
				{
					if(i==0 && j==(n-1)|| i==(n-1)&& j==(n-1)) {
						System.out.print("  ");
					}
					else {
						System.out.print("# ");
					}
					
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * A
			 */
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || j==(n-1) || i == n/2) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * N
			 */
			for(int j=0;j<n;j++) {
				if(j==0 ||j==(n-1)||i==j ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * c
			 */
			for(int j=0;j<n;j++) {
				if(i==0 || j==0  || i == (n-1)) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * E
			 */
			for(int j=0;j<n;j++) {
				if(i==0 || j==0  || i == (n-1)||i==(n/2)) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			System.out.print("		");
			/*
			 * A
			 */
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || j==(n-1) || i == n/2) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * N
			 */
			for(int j=0;j<n;j++) {
				if(j==0 ||j==(n-1)||i==j ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * D
			 */
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || j==(n-1)  || i==(n-1)) 
				{
					if(i==0 && j==(n-1)|| i==(n-1)&& j==(n-1)) {
						System.out.print("  ");
					}
					else {
						System.out.print("# ");
					}
					
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			System.out.print("		");
			/*
			 * E
			 */
			for(int j=0;j<n;j++) {
				if(i==0 || j==0  || i == (n-1)||i==(n/2)) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * N
			 */
			for(int j=0;j<n;j++) {
				if(j==0 ||j==(n-1)||i==j ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * c
			 */
			for(int j=0;j<n;j++) {
				if(i==0 || j==0  || i == (n-1)) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * o
			 */
			for(int j=0;j<n;j++) {
				if((j==0&&i!=0) ||(j==(n-1)&&i!=(n-1))||(i==0&&j!=0)||(i==(n-1)&&j!=(n-1)) ) 
				{
					if((j==0&&i==(n-1))||(i==0&&j==(n-1))) {
						System.out.print("  ");
						
					}
					else {
						
					
					System.out.print("# ");
					}
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * U
			 */
			for(int j=0;j<n;j++) {
				if((j==0) ||(j==(n-1)&&i!=(n-1))||(i==(n-1)&&j!=(n-1)) ) 
				{
					if((j==0&&i==(n-1))||(j==(n-1)&&i==(n-1))) {
						System.out.print("  ");
						
					}
					else {
						
					
					System.out.print("# ");
					}
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * R
			 */
			for(int j=0;j<n;j++) {
				if((i==0&&j!=(n-1)) || j==0  || (i == (n/2)&&j!=(n-1))||(j==(n-1)&&(i<(n/2)&&i>=1))||(i==j&&i>=(n/2))) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * A
			 */
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || j==(n-1) || i == n/2) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * G
			 */
			for(int j=0;j<n;j++) {
				if(i==0 || j==0  || (i == (n-1)&& j<=(n/2))||(j==(n/2)&& i>=(n/2))||(i==(n/2)&&j>=(n/2))||(j==(n-1)&&i>=(n/2))) 
					
				{
					if(j==(n-1)&&i==(n/2)||(i==(n-1)&&j==(n/2))||(i==0 && j==0)||(i==(n-1)&& j==0)) {
						System.out.print("  ");
					}
					else {
						
					
					System.out.print("# ");
					}
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * E
			 */
			for(int j=0;j<n;j++) {
				if(i==0 || j==0  || i == (n-1)||i==(n/2)) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * M
			 */
			for(int j=0;j<n;j++) {
				if(j==0 ||(j==(n-1)||i==j&&j<=(n/2))||(i+j==(n-1)&&j>=(n/2)) ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * E
			 */
			for(int j=0;j<n;j++) {
				if(i==0 || j==0  || i == (n-1)||i==(n/2)) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * N
			 */
			for(int j=0;j<n;j++) {
				if(j==0 ||j==(n-1)||i==j ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * T
			 */
			for(int j=0;j<n;j++) {
				if(j==(n/2) || i==0 ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			/*
			 * #
			 */
			for(int j=0;j<1;j++) {
				if(i==(n-1)) {
					System.out.print("* ");
				}
			}
			
			System.out.print("		");
			/*
			 * Y
			 */
			for(int j=0;j<n;j++) {
				if((i+j==(n-1)&&i<=(n/2))|| (i==j&&i<=(n/2))||(j==(n/2) &&i>=(n/2)) ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * o
			 */
			for(int j=0;j<n;j++) {
				if((j==0&&i!=0) ||(j==(n-1)&&i!=(n-1))||(i==0&&j!=0)||(i==(n-1)&&j!=(n-1)) ) 
				{
					if((j==0&&i==(n-1))||(i==0&&j==(n-1))) {
						System.out.print("  ");
						
					}
					else {
						
					
					System.out.print("# ");
					}
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * U
			 */
			for(int j=0;j<n;j++) {
				if((j==0) ||(j==(n-1)&&i!=(n-1))||(i==(n-1)&&j!=(n-1)) ) 
				{
					if((j==0&&i==(n-1))||(j==(n-1)&&i==(n-1))) {
						System.out.print("  ");
						
					}
					else {
						
					
					System.out.print("# ");
					}
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * R
			 */
			for(int j=0;j<n;j++) {
				if((i==0&&j!=(n-1)) || j==0  || (i == (n/2)&&j!=(n-1))||(j==(n-1)&&(i<(n/2)&&i>=1))||(i==j&&i>=(n/2))) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			System.out.print("		");
			/*
			 * S
			 */
			for(int j=0;j<n;j++) {
				if( (j==0&&(i<(n/2)&&i>=1) || (j==(n-1)&&(i>(n/2)&&i<(n-1))) || (i == n/2&&(j>=1&&j<=(n-2)))||(i==(n-1)&&j<=(n-2))) ||(i==0&&j>=1))
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * U
			 */
			for(int j=0;j<n;j++) {
				if((j==0) ||(j==(n-1)&&i!=(n-1))||(i==(n-1)&&j!=(n-1)) ) 
				{
					if((j==0&&i==(n-1))||(j==(n-1)&&i==(n-1))) {
						System.out.print("  ");
						
					}
					else {
						
					
					System.out.print("# ");
					}
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * P
			 */
			for(int j=0;j<n;j++) {
				if((i==0&&j!=(n-1)) || j==0  || (i == (n/2)&&j!=(n-1))||(j==(n-1)&&(i<(n/2)&&i>=1))) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * P
			 */
			for(int j=0;j<n;j++) {
				if((i==0&&j!=(n-1)) || j==0  || (i == (n/2)&&j!=(n-1))||(j==(n-1)&&(i<(n/2)&&i>=1))) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * o
			 */
			for(int j=0;j<n;j++) {
				if((j==0&&i!=0) ||(j==(n-1)&&i!=(n-1))||(i==0&&j!=0)||(i==(n-1)&&j!=(n-1)) ) 
				{
					if((j==0&&i==(n-1))||(i==0&&j==(n-1))) {
						System.out.print("  ");
						
					}
					else {
						
					
					System.out.print("# ");
					}
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * R
			 */
			for(int j=0;j<n;j++) {
				if((i==0&&j!=(n-1)) || j==0  || (i == (n/2)&&j!=(n-1))||(j==(n-1)&&(i<(n/2)&&i>=1))||(i==j&&i>=(n/2))) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * T
			 */
			for(int j=0;j<n;j++) {
				if(j==(n/2) || i==0 ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			System.out.print("		");
			/*
			 * T
			 */
			for(int j=0;j<n;j++) {
				if(j==(n/2) || i==0 ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * R
			 */
			for(int j=0;j<n;j++) {
				if((i==0&&j!=(n-1)) || j==0  || (i == (n/2)&&j!=(n-1))||(j==(n-1)&&(i<(n/2)&&i>=1))||(i==j&&i>=(n/2))) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * U
			 */
			for(int j=0;j<n;j++) {
				if((j==0) ||(j==(n-1)&&i!=(n-1))||(i==(n-1)&&j!=(n-1)) ) 
				{
					if((j==0&&i==(n-1))||(j==(n-1)&&i==(n-1))) {
						System.out.print("  ");
						
					}
					else {
						
					
					System.out.print("# ");
					}
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * L
			 */
			for(int j=0;j<n;j++) {
				if(i==(n-1) || j==0 ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * Y
			 */
			for(int j=0;j<n;j++) {
				if((i+j==(n-1)&&i<=(n/2))|| (i==j&&i<=(n/2))||(j==(n/2) &&i>=(n/2)) ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			System.out.print("		");
			/*
			 * M
			 */
			for(int j=0;j<n;j++) {
				if(j==0 ||(j==(n-1)||i==j&&j<=(n/2))||(i+j==(n-1)&&j>=(n/2)) ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * E
			 */
			for(int j=0;j<n;j++) {
				if(i==0 || j==0  || i == (n-1)||i==(n/2)) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * A
			 */
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || j==(n-1) || i == n/2) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * N
			 */
			for(int j=0;j<n;j++) {
				if(j==0 ||j==(n-1)||i==j ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * S
			 */
			for(int j=0;j<n;j++) {
				if( (j==0&&(i<(n/2)&&i>=1) || (j==(n-1)&&(i>(n/2)&&i<(n-1))) || (i == n/2&&(j>=1&&j<=(n-2)))||(i==(n-1)&&j<=(n-2))) ||(i==0&&j>=1))
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			System.out.print("		");
			/*
			 * A
			 */
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || j==(n-1) || i == n/2) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			System.out.print("		");
			/*
			 * L
			 */
			for(int j=0;j<n;j++) {
				if(i==(n-1) || j==0 ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * o
			 */
			for(int j=0;j<n;j++) {
				if((j==0&&i!=0) ||(j==(n-1)&&i!=(n-1))||(i==0&&j!=0)||(i==(n-1)&&j!=(n-1)) ) 
				{
					if((j==0&&i==(n-1))||(i==0&&j==(n-1))) {
						System.out.print("  ");
						
					}
					else {
						
					
					System.out.print("# ");
					}
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * T
			 */
			for(int j=0;j<n;j++) {
				if(j==(n/2) || i==0 ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			System.out.print("		");
			/*
			 * T
			 */
			for(int j=0;j<n;j++) {
				if(j==(n/2) || i==0 ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * o
			 */
			for(int j=0;j<n;j++) {
				if((j==0&&i!=0) ||(j==(n-1)&&i!=(n-1))||(i==0&&j!=0)||(i==(n-1)&&j!=(n-1)) ) 
				{
					if((j==0&&i==(n-1))||(i==0&&j==(n-1))) {
						System.out.print("  ");
						
					}
					else {
						
					
					System.out.print("# ");
					}
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			System.out.print("		");
			/*
			 * M
			 */
			for(int j=0;j<n;j++) {
				if(j==0 ||(j==(n-1)||i==j&&j<=(n/2))||(i+j==(n-1)&&j>=(n/2)) ) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * E
			 */
			for(int j=0;j<n;j++) {
				if(i==0 || j==0  || i == (n-1)||i==(n/2)) 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("		");
			/*
			 * #
			 */
			for(int j=0;j<1;j++) {
				if(i==(n-1)) {
					System.out.print("* ");
				}
			}
			System.out.print("	");
			System.out.println();
			
		}

	}

}
