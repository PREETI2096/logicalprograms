package com.bridgelabz.logicalprograms;

public class PrimeNumber {

	public static void main(String[] args) {
	System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		boolean isPrime = true;
		for(int i = 2;i <= number/2; i++)
		{
			if (number % i == 0)
			{
				isPrime = false;
				break;
			}
		}
		if(isPrime )
			System.out.println(number+ " is Prime number");
		else
			System.out.println(number+ " is not prime number");
	

	}

}
