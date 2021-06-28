package Pratice2021;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		*
//		**
//		***
//		****
//		*****
//		******
//		*******
//		********
//		*********
		int robin =1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of row you want to print");
		int n =sc.nextInt();
//		//System.out.println(n);
//		for (int i=1 ; i<=n ; i++) {
//			for (int j=1;  j<=i; j++) {
//			System.out.print(robin++ + " ");
//			}
//			System.out.print("\n");
//		}
//		*****
//		****
//		***
//		**
//		*
//		for (int i=1 ; i<=n ; i++) {
//			for (int j=n ; j>=i ; j--) {
//				System.out.print("*");
//			}
//			System.out.print("\n");
//		}
//		*
//		**
//		***
//		****
//		*****
//		****
//		***
//		**
//		*
//		
//		for (int i=1 ; i<=n ; i++) {
//			for (int j=1;  j<=i; j++) {
//			System.out.print("*");
//			}
//			System.out.print("\n");
//		}
//		for (int i=2 ; i<=n ; i++) {
//			for (int j=n ; j>=i ; j--) {
//				System.out.print("*");
//			}
//			System.out.print("\n");
//		}
//		
//		System.out.println(String.format("%02d",1));
//		System.out.println(String.format("%02d",999));
//		01 
//		02 03 
//		04 05 06 
//		07 08 09 10 
//		11 12 13 14 15 
//		16 17 18 19 
//		20 21 22 
//		23 24 
//		25 

		for (int i=1 ; i<=n ; i++) {
			for (int j=1;  j<=i; j++) {
			System.out.print(String.format("%02d", robin++) + " ");
			}
			System.out.print("\n");
		}
		for (int i=2 ; i<=n ; i++) {
			for (int j=n ; j>=i ; j--) {
				System.out.print(robin++ + " ");
			}
			System.out.print("\n");
		}
		
		
	}

}
