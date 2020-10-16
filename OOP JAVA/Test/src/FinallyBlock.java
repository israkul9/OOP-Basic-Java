
public class FinallyBlock {

	public static void main(String[] args) {

		try {

			int a = 100;
			int c = a / 0;
		}

		catch (Exception e) {

			e.printStackTrace();
			
		} finally {
			System.out.println("I am in finally Block");
		}
		//System.out.println("Hello");
	}

}
