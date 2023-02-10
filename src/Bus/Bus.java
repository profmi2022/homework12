package Bus;
import Exception.DiagnosticException;
import Driver.DriverD;
import Transport.Transport;

public class Bus extends Transport<DriverD> {

    public Bus(String brand, String model, Float engineVolume, DriverD driver, Capacity capacity) {
        super(brand, model, engineVolume, driver);

        this.capacity = capacity;
    }

    @Override
    public void doDiagnostic() {
        System.out.println("Автобус не проходит диагностику");
    }


    private Capacity capacity;

    @Override
    public void printType() {
        if(capacity != null){
            System.out.println(capacity);
        }
        else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", " + capacity;
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

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }
}

