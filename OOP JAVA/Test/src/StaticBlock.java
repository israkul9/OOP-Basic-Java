
// static block sobar agee execute hobe , even before main method

public class StaticBlock {

	static int x;

	static {
		x = 10;

		System.out.println("Static Block 1");
		System.out.println(x);

	}

	static {

		System.out.println("Static Block 2");

	}

	static {

		System.out.println("Static Block 3");

	}

	public static void main(String[] args) {

		System.out.println("Under Main Method");
		// System.out.println(x);

	}

}
