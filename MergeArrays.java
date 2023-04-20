package snippet;

import java.util.Arrays;

public class MergeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] array1= {10,20,30,40};
		 int[] array2= {9,8,7,6,5};
		 int ar1=array1.length;
		 int ar2=array2.length;
		 int result[]= new int[ar1+ar2];
		 //System.arraycopy(array1, 0, result, 0, ar1);  
		 //System.arraycopy(array2, 0, result, ar1, ar2); 
		 System.out.println(Arrays.toString(result));
		
			
		}
}
