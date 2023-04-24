package snippet;


public class MaximumNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {50,20,30,40,60};
		int max=a[0];
		for (int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("The maximum no is :"+max);
	}

}
