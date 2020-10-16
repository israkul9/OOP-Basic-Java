
// static method can not be overridden
// main method is also static so it can not be overridden
// final method can not be overridden
class A {
    String name = "Tusher";

    int age = 10;
    void fun()
    {

        System.out.println(name);
        System.out.println(age);
    }
}

 class B extends A{

    String qualification = "";
    void fun()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(qualification);
    }
}
