package snippet;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, b=1,sum=0;
		//System.out.println(a+""+b);
			
		for(int i=2;i<10;i++) {
			sum=a+b;
			System.out.print(" "+ sum);
			a=b;
			b=sum;
			
		}

	}

}
