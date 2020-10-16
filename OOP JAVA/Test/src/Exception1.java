
public class Exception1 {

	public static void main(String[] args) {

		int k = 0, x = 5;
		int ar[] = new int[5];
		try {
			System.out.println(ar[100]);
		}

		catch (Exception e) {
		e.printStackTrace();
	System.out.println("-----------------------------\n");
	
	System.out.println(e.toString());
	
	
	System.out.println("-----------------------------\n");
	
	System.out.println(e.getMessage());
		}

	}

}
