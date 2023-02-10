import Bus.Bus;
import Bus.Capacity;
import Car.Car;
import Car.BodyType;
import Driver.Driver;
import Driver.DriverB;
import Driver.DriverC;
import Driver.DriverD;
import Transport.Mechanic;
import Transport.Transport;
import Truck.Truck;
import Truck.Tonnage;
import Exception.DiagnosticException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import Transport.ServiceStation;

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
//        System.out.println("\nДиагностика\n");
//
//        Car car4 = new Car("Москвич", "412", 2f, null, BodyType.CROSSOVER);
//        Truck truck4 = new Truck("DAEWOO", " Caterpillar", 4f, new DriverC("Сидоров", false, 5), Tonnage.TONNAGE_N1);
//
//        try {
//            car1.doDiagnostic();
//        } catch (DiagnosticException e) {
//            e.printStackTrace();
//        }
//
//            bus2.doDiagnostic();
//
//        try {
//            truck3.doDiagnostic();
//        } catch (DiagnosticException e) {
//            e.printStackTrace();
//        }
//        try {
//            car4.doDiagnostic();
//        } catch (DiagnosticException e) {
//            e.printStackTrace();
//        }
//        try {
//            truck4.doDiagnostic();
//        } catch (DiagnosticException e) {
//            e.printStackTrace();
//        }


// Механики

        List<Transport> vehicles = new ArrayList<>();

        vehicles.add(car1);
        vehicles.add(bus3);
        vehicles.add(truck2);

        List<Driver> drivers = new ArrayList<>();

        drivers.add(car1.getDriver());
        drivers.add(car2.getDriver());
        drivers.add(car3.getDriver());
        drivers.add(bus1.getDriver());
        drivers.add(bus2.getDriver());
        drivers.add(bus3.getDriver());
        drivers.add(truck1.getDriver());
        drivers.add(truck2.getDriver());
        drivers.add(truck3.getDriver());

        Mechanic mechanic1 = new Mechanic("Углов Максим Самсонович", "Индезит");
        Mechanic mechanic2 = new Mechanic("Пирогов Сидор Матвеевич", "Сатар");
        Mechanic mechanic3 = new Mechanic("Колесов Захар Петрович", "Бозон");
        Mechanic mechanic4 = new Mechanic("Кирюхин Павел Эдмундович", "Карт");
        Mechanic mechanic5 = new Mechanic("Сеточкин Кирилл Андреевич", "Донал");
        Mechanic mechanic6 = new Mechanic("Штампов Леонид Дмитриевич", "Кирта");

        car1.addMechanic(mechanic2);
        car1.addMechanic(mechanic5);
        bus3.addMechanic(mechanic4);
        bus3.addMechanic(mechanic1);
        truck2.addMechanic(mechanic6);
        truck2.addMechanic(mechanic3);

        for (Transport vehicle : vehicles) {
            System.out.println("\nАвтомобиль: " + vehicle +
                    "\nМеханики: ");
            for (Object mechanic : vehicle.getMechanics()) {
                System.out.println(mechanic);
            }
        }
//Станция техобслуживания
        System.out.println("\nСтанция техобслуживания\n");

        ServiceStation serviceStation = new ServiceStation();

        serviceStation.addVehicle(car1);
        serviceStation.addVehicle(car3);
        serviceStation.addVehicle(bus1);
        serviceStation.addVehicle(truck1);
        serviceStation.addVehicle(truck3);

        System.out.println("\nЗапускаем техобслуживание: \n");

        serviceStation.doInspection();

//Множество водителей
        System.out.println("\nМножество водителей\n");

        Set <Driver> driverSet = new HashSet<Driver>();

        driverSet.add(car1.getDriver());
        driverSet.add(car2.getDriver());
        driverSet.add(car3.getDriver());
        driverSet.add(bus1.getDriver());
        driverSet.add(bus2.getDriver());
        driverSet.add(bus3.getDriver());
        driverSet.add(truck1.getDriver());
        driverSet.add(truck2.getDriver());
        driverSet.add(truck3.getDriver());
        driverSet.add(truck2.getDriver());
        driverSet.add(truck1.getDriver());

        for (Driver driver : driverSet) {
            System.out.println(driver);
        }

    }
}

