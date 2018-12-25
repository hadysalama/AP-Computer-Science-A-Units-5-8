// TextLab06st.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the TextLab06 assignment.

import java.text.DecimalFormat;
import java.util.Scanner;

public class TextLab06st
{
	public static void computePrimes(boolean primes[])
	{
		System.out.println("\nCOMPUTING PRIME NUMBERS");
		//initialize all elements to prime
		for(int i = 2; i < primes.length; i++)
		{
			primes[i] = true;
		}
	
		//change all multiples of 2,3,4� to not prime

		for (int j = 2; j < primes.length; j++)
		{
			for (int k = j*2; k < primes.length; k+=j)
			{
				primes[k] = false;
			}
		}
	}

	public static void displayPrimes(boolean primes[])
	{
		System.out.println("\n\nPRIMES BETWEEN 1 AND "+ primes.length);
		System.out.println();

		//print all the prime numbers
		for (int i = 2; i < primes.length; i++)
		{
			if (primes[i] == true)
			{
				System.out.print(i + " ");
			}
			
		}

	}
	
	public static void main(String args[])
	{
		// This main method needs additions for the 100 point version.
		System.out.println("\nTextLab06\n");
		final int MAX = 100;
		boolean primes[];
		primes = new boolean[MAX];
		computePrimes(primes);
		displayPrimes(primes);	
	}



}
