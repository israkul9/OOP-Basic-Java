abstract class Nishi{

    abstract void fun();

    void hello()
    {

        System.out.println("under hello method");
    }
}

class ECE extends Nishi{
    @Override
    void fun() {
        System.out.println("Under Fun Method");
    }
}