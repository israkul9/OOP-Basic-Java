/*

Encapsulation in Java is a mechanism
of wrapping the data (variables) and code acting
 on the data (methods) together as a single unit.
 In encapsulation, the variables of a class will be
  hidden from other classes, and can be accessed
  only through the methods of their current class.
Therefore, it is also known as data hiding


To achieve encapsulation in Java −

1.Declare the variables of a class as private.

2.Provide public setter and getter methods
 to modify and view the variables values.

 */


public class Encapsulation {

   private String name;
   private int age ;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
