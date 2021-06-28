package Pratice2021;

public class OnlineLibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="Robin";
		//char []ch =s.toCharArray();
		int i,n;
		char c;
		char c1;
		String z= "";
		String z1="";
		for (i= 0;i<s.length() ;i++) {
			if (s.charAt(i)== 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i)== 'o' || s.charAt(i) == 'u')
			{
				c1=s.charAt(i);
				c1='@';
				c1=(char)c1;
			}
			//z1=z1+c1;
		}
		
	System.out.print(z1);
		
		String s1 ="Arpita";
		
		for (i=0;i<s1.length();i++) {
			c=s1.charAt(i);
			n=219-c;
				c=(char)n;
				
			
			z=z + c;
		}
		System.out.println(z);
		
		
		

	}
// String bin ="101110";
//  int i = Integer.parseInt(bin, 2);
//  System.out.println(i);
//  int  k =46;
//  String j = Integer.toBinaryString(k);
//  System.out.println(j);
//  String o =Integer.toHexString(k);
//  System.out.println(o);
//  String a="2e";
//  int u = Integer.parseInt(a, 16);
//  System.out.println(u);
//  
//
//	}
}
