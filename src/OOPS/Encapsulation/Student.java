package OOPS.Encapsulation;

/**
 * @author Shailesh
 */


// Encapsulation is bundling data (variables) and methods that operate on the data into a single unit (class).
// Encapsulation, a fundamental concept in Object-Oriented Programming (OOP),
// bundles data and code into a cohesive unit, shielding them from external interference and misuse.
// The encapsulation implementation involves declaring variables as private and providing public setter and getter methods for modifying and retrieving variable values.
// This approach renders the fields of a class either read-only or write-only.
public class Student {

    private String name;
    private int age;

    // Getter method
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter method
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
       Student s = new Student();
       s.setName("Shailesh");
       s.setAge(20);
       System.out.println(s.getName());
       System.out.println(s.getAge());
    }
}
