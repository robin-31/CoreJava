package Pratice2021;

import java.util.Arrays;

public class MatrixProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ldiasum=0 , rdiasum =0;
		int [][] arr = { { 1 , 12 , 15 , 1},
						{ 17 , 2 , 2 , 13},
						{ 37 , 3 , 3 , 14},
						{ 4 , 55 , 65 , 4}
		};
		int length = arr.length;
		System.out.println(length);
		for (int i=0 ; i<length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println("\n");
		}
		//sum of diagonal 
		for ( int i=0 ; i<length ; i++) {
			ldiasum+=arr[i][i];
			rdiasum+= arr [i] [length-i-1];
		}
		System.out.println(ldiasum);
		System.out.println(rdiasum);

	}

}
