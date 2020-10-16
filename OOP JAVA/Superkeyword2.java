 class E {
    void fun()
    {
        System.out.println("Under fun method");
    }

    void message()
    {
        System.out.println("Under message method");
    }
}

class F extends E{


    void fun()
    {
        // super class er overridden method call dite chaile super keyword
        // lagbe
        super.fun();

        System.out.println("Overridden Fun");

        message();
        // normal method emnitei call deya jabe

    }

}
