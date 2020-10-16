public class CallByReferanceTest {
    public static void main(String[] args) {

        CallByReferance ob1 = new CallByReferance();
        ob1.name = "Hello";
        System.out.println(ob1.name);
        ob1.change(ob1);
        System.out.println(ob1.name);
    }
}
