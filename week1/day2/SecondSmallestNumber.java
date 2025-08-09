package week1.day2;

public class SecondSmallestNumber {

	public static void main(String[] args) {
		int arr[] = {23,45,67,32,89,22};
		int temp=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length-1;j++) {
				if(arr[i]<arr[j] ) {
					temp=arr[i];
					arr[j]=arr[i];
					arr[i]=temp;
					
				}
			}
		}System.out.println("Second smallest number is "+arr[1]);

	}

}
