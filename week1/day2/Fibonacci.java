package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		
		int a=-1,b=1,c; 
		
		for(int i=1;i<=5;i++) {   //1<=5 2<=5 3<=5
			c=a+b; // -1+1=0 1+0=1 0+1=1 1+1=2 2+1=3 2+3=5
			System.out.println(c);// 
			a=b;//1 0 1 1 2
			b=c;//0 1 1 2 3
		}

	}

}
