package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=13;
		int fact=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) { //13%1=0, 13%2!=0, 13%3!=0..........13%13=0
				fact++;// fact=1,..............................fact=2
			}
		}if(fact==2) {
			System.out.println("number is prime number");
		}
		else {
			System.out.println("not a prime number");
		}

	}

}
