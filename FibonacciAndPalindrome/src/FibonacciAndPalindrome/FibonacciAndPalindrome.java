package FibonacciAndPalindrome;
import java.util.*;

public class FibonacciAndPalindrome {
	
	static void printFibonacci(int n) {
        int num1 = 0, num2 = 1;
        System.out.print("Fibonacci Series up to " + n + " terms: ");
        for (int i = 1; i <= n; ++i) {
            System.out.print(num1 + " ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
        System.out.println();
    }
	
	static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reverseNumber = 0;
        while (number != 0) {
            int remainder = number % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            number /= 10;
        }
        return originalNumber == reverseNumber;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number of terms for Fibonacci series: ");
		int n = scanner.nextInt();
		printFibonacci(n);
		
		System.out.print("Enter a number to check if it's a palindrome: ");
		int number = scanner.nextInt();
		if (isPalindrome(number))
		{
			System.out.println(number + " is a palindrome.");
		}
		else
		{
			System.out.println(number + " is not a palindrome.");
		}
		scanner.close();
	}

}
