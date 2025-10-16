package OOPS.Inheritance;

/**
 * @author Shailesh
 */
public class Car extends Vehicle{

    public void drive() {
        System.out.println("Car is driving");
    }
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();  // Inherited method
        car.drive();
    }
}
