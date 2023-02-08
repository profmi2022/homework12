public class Bus extends Transport<DriverD> {

    public Bus(String brand, String model, Float engineVolume, DriverD driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMove() {
        System.out.println("Автобус " + brand + " " + model + " начал движение");
    }

    @Override
    public void stopMove() {
        System.out.println("Автобус " + brand + " " + model + " остановился");
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус " + brand + model + " заехал на пит-стоп");
    }

    @Override
    public void bestCircleTime() {
        System.out.println("Лучшее время круга автобуса " + brand + model + " - 100 минут");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость автобуса " + brand + model + " 120 км/ч");
    }
}
