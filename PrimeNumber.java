package snippet;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=29;
		boolean flag =false;
		for(int i=2;i<=num/2;i++); {
			if(num%2==0)
			{
				flag=true;
				
			}

			}
	
		if(!flag)
			System.out.println(num + "is a prime number");		
		else
		System.out.println(num +" is not a prime number");
		}
}


	

