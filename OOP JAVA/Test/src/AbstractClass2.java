
/*
 
 abstract class ke extends korle abstract class er abstract method gulake 
 define kore dite hobe 
 
 */

public class AbstractClass2 {

	public static void main(String[] args) {

		School s1 = new School();
		s1.personal_info();
	}

}

abstract class Teacher {

	// abstract void personal_info();

	void job_info() {
		System.out.println("Teachers Job Info");
	}

}

class School extends Teacher {
	void personal_info() {
		System.out.println("Teacher Name");
		System.out.println("Teacher Height");
		System.out.println("Teacher weight");

	}
}