import java.util.Scanner;


public class PrimeNumbers {

	public static boolean isPrime(int n){
		if (n < 2)
			return false;
		for (int i = 2; i < n / 2; i++){
			if (n % i == 0)
				return false;
		}
		return true;
	} 
	
	public static void main(String[] args) {
		Scanner s;
		int num;

		s = new Scanner(System.in);
		while (true){
			System.out.println("enter a number:");
			num = s.nextInt();
			if (num < 0)
				break ;
			System.out.println((PrimeNumbers.isPrime(num))? "the input is a prime number." : "the input is not prime number.");
		}

	}

}
