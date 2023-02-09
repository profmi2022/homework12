public class Main {
    public static void main(String[] args) {

        Bus bus1 = new Bus("MAN", "Lions", 4f, new DriverD("Павлов", true, 10));
        Bus bus2 = new Bus("GOLDEN DRAGON", " XML6127JR", 5f, new DriverD("Дорогов", true, 10));
        Bus bus3 = new Bus("Hyundai", " UniverseSpace Luxury", 5f, new DriverD("Руткин", true, 10));

        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);

        Car car1 = new Car("Lada", "Granta", 1.7f, new DriverB("Иванов", true, 5));
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 3.0f, new DriverB("Золотов", true, 5));
        Car car3 = new Car("BMW", "Z8", 3.0f, new DriverB("Пинков", true, 5));

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        Truck truck1 = new Truck("MAN", "Lions", 4f, new DriverC("Ложкин", true, 5));
        Truck truck2 = new Truck("GOLDEN DRAGON", " XML6127JR", 5f, new DriverC("Федоров", true, 5));
        Truck truck3 = new Truck("Hyundai", " UniverseSpace Luxury", 5f, new DriverC("Сидоров", true, 5));

        System.out.println(truck1);
        System.out.println(truck2);
        System.out.println(truck3);

        bus1.printInfo();
        bus2.printInfo();
        bus3.printInfo();
        car1.printInfo();
        car2.printInfo();
        car3.printInfo();
        truck1.printInfo();
        truck2.printInfo();
        truck3.printInfo();

    }
}