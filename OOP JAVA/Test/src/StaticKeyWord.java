
class S {

	static int a;

	static void display() {
		
		
		//  a holo method er jonno local variable
		int a = 10;
		System.out.println(a);

		// static method er vetor sob static jinish excess kora jay
		// non static kisu excess kora jabena

		System.out.println(a);
		fun_();
	}

	static void fun_() {
		System.out.println("Under Fun method");
	}

}

public class StaticKeyWord {

	public static void main(String[] args) {

		S.display();
		// class name . method name diye static method access kora jay
		
	}

}
