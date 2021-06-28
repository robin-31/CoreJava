package Pratice2021;

import java.util.Scanner;

public class Enconding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1= sc.nextLine();
		String s2= sc.nextLine();
		char c1 [] = s1.toCharArray();
		char c2 [] = s2.toCharArray();
//		for (int i=0 ; i< c1.length; i++) {
//			System.out.println(c1[i]);
//		}
		if (s1.length() <= 0 || s2.length() <= 0) {
			System.out.println("INVALID OUTPUT");
		}
		else
		{
			
			for (int i =0; i< c1.length; i++) {
				if (c1[i] == ' ' || c1[i] == '.' ||  c1[i] == ',') {
					
				}
				else
					
					c1[i]= (char)((int)c1[i]+5);
					
			}
			
			
			for (int i =0; i< c2.length; i++) {
				if (c2[i] == ' ' || c2[i] == '.' ||  c2[i] == ',') {
					//break;
				}
				else
					
					c2[i]= (char)((int)c2[i]-5);
					
				}
			System.out.println(c1);	
			System.out.println(c2);	
		}
		//System.out.println(c1);
		
	}

}
