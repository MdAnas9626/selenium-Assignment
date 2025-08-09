package week1.day2;
import java.util.*;

public class FindFirstMissingElement {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,7,8};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			if(arr[i+1]!=arr[i]+1) {
				System.out.println("First Missing Element is :"+ (arr[i] + 1));
				break;
			}
		}
	}

}
