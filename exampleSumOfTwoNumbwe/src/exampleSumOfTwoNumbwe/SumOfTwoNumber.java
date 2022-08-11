package exampleSumOfTwoNumbwe;

import java.util.Scanner;

public class SumOfTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=0;
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter the first number");
		a=Scan.nextInt();
		System.out.println("Enter the Second number");
		b=Scan.nextInt();
		int sum=a+b;
		System.out.println("Sum of two number is: "+sum);
	}

}
