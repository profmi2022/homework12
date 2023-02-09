import Bus.Bus;
import Bus.Capacity;
import Car.Car;
import Car.BodyType;
import Driver.DriverB;
import Driver.DriverC;
import Driver.DriverD;
import Truck.Truck;
import Truck.Tonnage;
import Exception.DiagnosticException;


public class Main {

    public static void main(String[] args) {
// Автобусы
        System.out.println("\nАвтобусы\n");
        Bus bus1 = new Bus("MAN", "Lions", 4f, new DriverD("Павлов", true, 10), Capacity.SMALL);
        Bus bus2 = new Bus("GOLDEN DRAGON", " XML6127JR", 5f, new DriverD("Дорогов", true, 10), Capacity.ESPECIALLY_BIG);
        Bus bus3 = new Bus("Hyundai", " UniverseSpace Luxury", 5f, new DriverD("Руткин", true, 10), Capacity.MIDDLE);

        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);

        bus1.printType();
        bus2.printType();
        bus3.setCapacity(null);
        bus3.printType();

// Легковые автомобили
        System.out.println("\nЛегковые автомобили\n");
        Car car1 = new Car("Lada", "Granta", 1.7f, new DriverB("Иванов", true, 5), BodyType.SEDAN);
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 3.0f, new DriverB("Золотов", true, 5), BodyType.HATCHBACK);
        Car car3 = new Car("BMW", "Z8", 3.0f, new DriverB("Пинков", true, 5), BodyType.CROSSOVER);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
// Грузовики
        System.out.println("\nГрузовики\n");
        Truck truck1 = new Truck("MAN", "Lions", 4f, new DriverC("Ложкин", true, 5), Tonnage.TONNAGE_N3);
        Truck truck2 = new Truck("GOLDEN DRAGON", " XML6127JR", 5f, new DriverC("Федоров", true, 5), Tonnage.TONNAGE_N2);
        Truck truck3 = new Truck("Hyundai", " UniverseSpace Luxury", 5f, new DriverC("Сидоров", true, 5), Tonnage.TONNAGE_N1);

        System.out.println(truck1);
        System.out.println(truck2);
        System.out.println(truck3);

        // Диагностика
        System.out.println("\nДиагностика\n");

        Car car4 = new Car("Москвич", "412", 2f, null, BodyType.CROSSOVER);
        Truck truck4 = new Truck("DAEWOO", " Caterpillar", 4f, new DriverC("Сидоров", false, 5), Tonnage.TONNAGE_N1);

        try {
            car1.doDiagnostic();
        } catch (DiagnosticException e) {
            e.printStackTrace();
        }

            bus2.doDiagnostic();

        try {
            truck3.doDiagnostic();
        } catch (DiagnosticException e) {
            e.printStackTrace();
        }
        try {
            car4.doDiagnostic();
        } catch (DiagnosticException e) {
            e.printStackTrace();
        }
        try {
            truck4.doDiagnostic();
        } catch (DiagnosticException e) {
            e.printStackTrace();
        }
    }
}