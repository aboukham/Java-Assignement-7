import java.util.Scanner;


public class PerfectNumber {

	private int[]	divisors;
	private int		len;
	
	public int[] getDivisors(){
		return this.divisors;
	}
	
	public void setDivisors(int[] arr){
		this.divisors = arr;
	}
	
	public void findNumberDivisors(int n){
		int j;
		int [] arr;
		
		j = 0;
		arr = new int[n];
		for (int i = 1; i < n; i++){
			if (n % i == 0){
				arr[j] = i;
				j++;
			}
		}
		this.len = j;
		this.divisors = arr;
	}
	
	public void printArray(){
		int [] arr;
		
		arr = this.getDivisors();
		for (int i = 0; i < len; i++){
			System.out.print(" " + arr[i]);
		}
	}
	
	public static void main(String[] args) {
		Scanner			s;
		int				num;
		PerfectNumber	p;
		int				sum;
		
		s = new Scanner(System.in);
		p = new PerfectNumber();
		System.out.println("enter a positive integer:");
		num = s.nextInt();
		p.findNumberDivisors(num);
		sum = 0;
		for (int i = 0; i < p.divisors.length; i++){
			sum += p.divisors[i];
		}
		if (sum == num){
			System.out.println("the input is a perfect number, and its divisors are :");
			p.printArray();
		}else
			System.out.println("the input is not a perfect number.");
	}
}
