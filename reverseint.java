package snippet;

public class reverseint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=12345678;
		int reverse=0;
		while(i!=0) {
			int remainder=i%10;
			reverse=reverse*10+remainder;
			i =i/10;
		}
		System.out.println("The reverse of the given number is:"+reverse);

	}

}