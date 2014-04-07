public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        car1.color = "blue";
        car1.numberOfDoors = 4;
        car2.color = "red";
        car2.numberOfDoors = 2;

        System.out.println("Color car1 = " + car1.color);
        System.out.println("Color car2 = " + car2.color);
    }
}
