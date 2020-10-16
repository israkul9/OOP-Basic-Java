
/*
 * method overloading hocche method er name same but signature different
 * signature = parameter list
 * 
 */

 class MethodOverLoading {

	 void fun1() {
		 System.out.println("Method without parameter");
	 }
	 
	 void fun1(int a , int b) {
		 System.out.println( a+b);
	 }
	 
	 void fun1(double a , double b) {
		 System.out.println( a+b);
	 }
	 
	 void fun1(String a , String b) {
		 System.out.println( a+" "+b);
	 }
}
