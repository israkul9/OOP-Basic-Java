import java.util.Scanner;

public class Exception2 {

	public static void main(String[] args) {

		int x = 0;

		System.out.println("Enter value of X : ");
		Scanner sc;
		sc = new Scanner(System.in);
		try {
			x = sc.nextInt();

			if (x > 10) {
				throw new MyException("X cant be greater than 10");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			System.out.println("Program Ends");
		}

	}

}

class MyException extends Exception {

	MyException(String str) {
		super(str);
	}
}