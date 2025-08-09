package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int num = 34343;
		int temp = num;
		int rev=0;
		while(num!=0) {
			int rem=num%10; //34343%10=3 ,3434%10=4, 343%10=3, 34%10=4 ,3%10=3
			rev=rev*10+rem;//0*10+3=3,3*10+4=34,34*10+3=343, 343*10+4=3434 ,3434*10+3=34343

			num/=10; //remove the last digit as 3434, 343, 34, 3
			
		}
		if(temp==rev) {
			System.out.println("palindrome number");
		}
		else {
			System.out.println("not a palindrome number");
		}
		

	}

}
