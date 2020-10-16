class Tusher{

     Tusher()
    {
        System.out.println("Under Tusher Class");
    }

}

class SEC extends Tusher{

    SEC()
    {
        System.out.println("Under SEC class");
    }
    SEC(int x)
    {
        System.out.println("with one parameter");
    }
}

class Code extends  SEC{

    Code(){
        super(1);
        System.out.println("Under Code class");
    }

}

/// constructor er upor by default ' super ' keyword lekha thake

/// -->   https://www.youtube.com/watch?v=W46hwtsDMK8

/// ---> https://www.youtube.com/watch?v=JTJJ5AR2jbI
// youtube tut link