package snippet;

public class DuplicateArrayValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=128;
		int b=128;
		System.out.println(a == b);
		
		String c =new String("123");
		String d= new String("123");
		System.out.println(c == d );
		
		
		String s1 =new String("123");
		String s2= new String("123");
		System.out.println(s1.equals(s2) );
	}

}
