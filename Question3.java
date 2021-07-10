
public class PrintNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 10; i < 50; i++){
			if (i % 10 == 0)
				System.out.println();
			System.out.print("  " + i);
		}
	}

}
