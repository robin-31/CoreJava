package Pratice2021;

public class Capgemini {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num=405;
//		int strongsum=0;
//		int temp =num;
//		while(num!=0) {
//			int sum=1;
//			int num1=num%10;
//			while(num1!=0) {
//				sum=sum*num1;
//				num1=num1-1;
//			}
//		num=num/10;
//		strongsum =strongsum+sum;
//		}
//		
//		if (strongsum==temp) {
//			System.out.println("number is strong number"  +  " " + strongsum);
//		}
//		else
//			System.out.println("number is not strong number" + strongsum);
//		String s1="ABCD";
//		
//		int n=0;
//		//n= (int)s1;
//		System.out.println(n);
//		int vowelcount=0;
//		int conscount=0;
//		int spacecount=0;
//		String s1="robin sunil manna";
//		char c1[] =s1.toCharArray();
//		for (int i=c1.length-1; i>=0; i--) {
//			System.out.print(c1[i]);
//			
//		}
//		System.out.println("\n");
//		for (int i=0 ; i<c1.length;i++) {
//			if ((c1[i] == 'a') || (c1[i]== 'e') || (c1[i]== 'i') || (c1[i]== 'o') || (c1[i]== 'u') ) {
//				vowelcount=vowelcount+1;
//			}
//			else if (c1[i]==' ') {
//				spacecount=spacecount+1;
//			}
//		}
//		int s=c1.length;
//		conscount=s-vowelcount-spacecount;
//		System.out.println(c1.length);
//		System.out.println(conscount);
//		System.out.println(vowelcount);
//		System.out.println(spacecount);
//		System.out.println(s1);
	
//		String s1="robin manna";
//		char c1[] = s1.toCharArray();
//		for(int i=0; i<c1.length;i++) {
//			if((c1[i]=='r')|| (c1[i]=='a') || (c1[i]==' ')) {
//				c1[i]='@';
//			}
//			
//		}
//		System.out.println(s1);
//		for(int i=0;i<c1.length;i++) {
//			System.out.print(c1[i]);
//		}\
//		int num=54321;
//		int temp=num;
//		int rev=0;
//		while(temp!=0) {
//			
//			int modtemp=temp%10;
//			rev= rev*10 +modtemp;
//			temp=temp/10;
//			
//		}
//		System.out.println(rev);
//		int num=153;
//		int temp=num;
//		int arm=0;
//		while(temp!=0) {
//			int tempmod=temp%10;
//			arm= arm +(tempmod*tempmod*tempmod);
//			temp=temp/10;
//		}
//		if (arm==num) {
//			System.out.println("armstrong");
//		}
//		else
//			System.out.println("not armstrong");
//		int num=0;
//		int fact=1;
//		while(num!=0) {
//			fact=fact*num;
//			num=num-1;
//		}
//		System.out.println(fact);
//		int number=145;
//		int temp=number;
//		int strongnumber=0;
//		while(temp!=0) {
//			int nummod = temp%10;
//			int fact=1;
//			while(nummod!=0) {
//				fact=fact*nummod;
//				nummod=nummod-1;
//			}
//			strongnumber=strongnumber+fact;
//			temp=temp/10;
//		}
//		System.out.println(strongnumber);
//	
//	
//		int count=0;
//		int num=13;
//		if (num ==1 || num==0) {
//			System.out.println("number is not prime");
//		}
//		else {
//			for(int i=2; i<=num/2; i++) {
//				if(num%i==0) {
//					System.out.println("number is not prime");
//					count=count+1;
//					break;
//				}
//				
//			}
//			if(count==0){
//				System.out.println("number is prime");
//			}
//			
//		}
//		
		int num1=1;
		int num2=100;
		for (int i1=num1; num1<=num2;i1++) {
			if (num1 ==1 || num1==0) {
				System.out.println("number is not prime");
			}
			else  {
				for(int i=2; i<=num1/2; i++) {
					if(num1%i==0) {
						//System.out.println("number is not prime");
						//count=count+1;
						break;
					}
					
				}
				
				
			}
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
		


