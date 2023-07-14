public class Hangar {
    public static void main(String[] args) {
        Car car = new Car("car", 12345);
        Boat boat = new Boat("boat", 23454321);
        System.out.println(car.doStuff());
        System.out.println(boat.doStuff());
    }
}
