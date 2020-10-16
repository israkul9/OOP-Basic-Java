
interface Car {
	int x = 10;

	void wheel();

	boolean light_on(int a, int b);

}

interface Driver extends Car {

	int driver_salary(int x);
}

class ABC implements Driver {

	ABC(){
		System.out.println("Under ABC constructor");
	}
	public int driver_salary(int x) {
		
		return x;
	}

	public void wheel() {
		System.out.println("Under Wheel method");
	}

	public boolean light_on(int x, int y) {
		return x > y;
	}

}

public class Interface1 {

	public static void main(String[] args) {
		ABC obj = new ABC();
		obj.wheel();

	}

}
