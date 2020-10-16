class Human {
    String name;
    int age;
    double height;

    boolean flag = false;
    Human() {

        flag = true;
      name = "Not Given";
      age = 10;
      height = 0.0;
    }

    // instance variable initialize e this use hoy

    Human(int c  ,int d)
    {
        this();
        System.out.println(flag);
        System.out.println("two parameter constructor");
    }

    Human(String name)
    {
        this(1,1);
        this.name = name;
    }

    void display()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}