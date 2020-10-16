
// sub class theke super class er variable , method call dite super keyword use hoy

class Abcd {

	int x = 10;

	void fun1() {
		System.out.println("Method fun1");
	}

	void display() {
		System.out.println(x);
	}

}

class Ab extends Abcd {

	int x = 100;

	void display() {
		super.display();
		System.out.println(x);
	}

}

public class SuperKeyWord1 {

	public static void main(String[] args) {

		Ab oo = new Ab();
		oo.display();

	}

}
