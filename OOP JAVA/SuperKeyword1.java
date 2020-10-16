class C{
    int x = 10;
}

class  D extends C{
    int x = 100;
    void fun()
    {
        System.out.println(x);
        // D class er object create kore
        // fun call korle x = 100 ashbe;
        // jodi super class er x = 10 pete chai
        // then (super.x) dite hobe
    }
}