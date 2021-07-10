import java.util.Scanner;


public class CountPrimes {

	public static void main(String[] args) {
		Scanner s;
		int		num;
		int		count;
		
		s = new Scanner(System.in);
		System.out.println("enter an integer greater than 2:");
		num = s.nextInt();
		count = 0;
		for (int i = 3; i <= num; i++){
			if (PrimeNumbers.isPrime(i))
				count++;
		}
		System.out.println("There are " + count + " primes between 2 and " + num);
	}

}
