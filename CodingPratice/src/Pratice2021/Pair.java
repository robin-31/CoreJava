package Pratice2021;

public class Pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int countpve=0;
	    int countnve=0;
	    int countzero=0;
	    double fcountpve=0.000000;
	    int [] arr = new int [] {-4, 3, -9, 0 ,4, 1};
		int n = arr.length;
		System.out.println(n);
		for (int i =0; i<=n-1; i++) {
			System.out.println("inside the loop block");
			if(arr[i]>0) {
				 countpve=countpve+1;
				 System.out.println("inside the if block");
				 System.out.println(arr[i] + "" + countpve);
			}
			 else if (arr[i]<0){
		            countnve=countnve+1;
		            System.out.println("inside the else if block");
		        }
			 else{
				 System.out.println("inside the else block");
		            countzero=countzero+1;
		        }
		}
		System.out.println(countpve + " " +countnve + " " + countzero);
		fcountpve= (n/countpve);
		System.out.format("%.6f", fcountpve);

	}
}
