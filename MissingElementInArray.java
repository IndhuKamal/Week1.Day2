package week1.day2;
import java.util.Arrays;

public class MissingElementInArray {
	public static void main(String[] args) {
        int[] arr= {1,2,8,5,7,6,3};
        Arrays.sort(arr);
		System.out.println("Array Elements sorted in Ascending Order");
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=i+1) {
				System.out.println("Missing Element is");
				System.out.println(i+1);
			    break;
			}
			
		}
		
		
	}

}

