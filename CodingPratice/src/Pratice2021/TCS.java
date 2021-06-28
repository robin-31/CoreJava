package Pratice2021;

import java.util.Scanner;

public class TCS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int [] arr;
		arr = new int [n];
		int count =0;
		
		for (int i=0; i<n ;i++) {
			arr[i] = sc.nextInt();
		}
		for (int i =0 ; i<n ; i++) {
			if (arr[i] == 0) {
				System.out.println(1);
			}
		}
//		running : for (int i=0 ; i <n-2;i++) {
//			for (int j =i+1; j< n-1;j++) {
//				for (int k=j +1 ; k< n; k++) {
//					if (arr[i]+arr[j]+arr[k] ==0) {
//						count =count +1;
//						continue running;
//					}
//				}
//			}
//		}
		for (int i=0 ; i< n-2 ; i++) {
			if (arr[i]+arr[i+1]+arr[i+2] ==0) {
				count =count +1;
				
			}
			
		}
		if (count== 0) {
			System.out.println(0);
		}
		else
			System.out.println(1);
		

	}

}
