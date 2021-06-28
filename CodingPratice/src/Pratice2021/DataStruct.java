package Pratice2021;

import java.util.Scanner;

public class DataStruct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxsize=10;
		int top=-1;
		int [] arr = new int[maxsize];
		System.out.println("enter number you want to enter into stack");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		if (top == maxsize-1) {
			System.out.println("overflow");
		}
		else {
			top++;
			arr[top]=n;
			System.out.println("item is pushed");
			System.out.println(top);
			
		}
		System.out.println(arr[0]);
		if(top==-1) {
			System.out.println("underflow");
			
		}
		else {
			System.out.println(top);
			top--;
			System.out.println("item is poped");
			System.out.println(top);
		}
		for(int i=0;i<maxsize;i++) {
			System.out.println(arr[i]);
		}
		
		

	}

}
