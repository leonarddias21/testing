package snippet;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcd";
		String rev="";
		int length=s.length();
		for (int i=length-1;i>=0;i--) {
			
			rev=rev+s.charAt(i);
			}
		{
			System.out.println("Reveserd string:"+rev);
		}

	}

}
