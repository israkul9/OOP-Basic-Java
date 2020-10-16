
/*
 
 class er constructor er upor by default super() likhe deya ache
 
 */
class Burger{
	
	
	int price=10;
	String cheese ;
	
	void beef_patty() {
		System.out.println("Beef Patty");
	}
	
	Burger(int x ){
		this.beef_patty();
		System.out.println(this.price);
	}
	
	
}

class coffee extends Burger{
	coffee(){
		super(1);
		System.out.println("Under coffee class");
	}
}

class Resturant extends coffee{
	Resturant(){
		super(); // super na likhleo likhe deya ache 
		System.out.println("Under resturant");
		this.resturant_name("Titanic");
	}
	void resturant_name(String name) {
		System.out.println("Resturant name is "+name);
	}
}


public class SuperKeyWord2 {

	public static void main(String[] args) {
		
		Resturant r1 = new Resturant();
		
		

	}

}
