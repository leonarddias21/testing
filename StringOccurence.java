package snippet;

public class StringOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=" Malayama";
		int total=s.length();
		int total_afterremove=s.replaceAll("a", "").length();
		int count=total- total_afterremove;
		System.out.println("Number of count occurence:"+count);

	}

}
