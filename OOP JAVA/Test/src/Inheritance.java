
class AA {

	void funA() {
		System.out.println("Under FunA method");
	}

}

class BB extends AA {
	void funB() {
		System.out.println("Under FunB method");
	}
}

public class Inheritance {

	public static void main(String[] args) {

		AA a1 = new BB();
		a1.funA();

	}
}
