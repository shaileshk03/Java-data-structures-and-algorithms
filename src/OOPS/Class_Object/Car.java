package OOPS.Class_Object;

/**
 * @author Shailesh
 */
// Class and Object
public class Car {

    String model;
    String color;
    int year;

    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public static void main(String[] args) {
      Car car = new Car("BMW", "Red", 2019);
      System.out.println(car.model);
    }
}
