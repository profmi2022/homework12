public class Car extends Transport<DriverB> {

    public Car(String brand, String model, Float engineVolume, DriverB driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMove() {
        System.out.println("Автомобиль легковой " + brand + " " + model + " начал движение");
    }

    @Override
    public void stopMove() {
        System.out.println("Автомобиль легковой " + brand + " " + model + " остановился");
    }
    @Override
    public void pitStop() {
        System.out.println("Автомобиль легковой " + brand + model + " заехал на пит-стоп");
    }

    @Override
    public void bestCircleTime() {
        System.out.println("Лучшее время круга автомобиля " + brand + model + " - 100 минут");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость автомобиля " + brand + model + " 120 км/ч");
    }
}
