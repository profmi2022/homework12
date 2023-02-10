package Car;
import Exception.DiagnosticException;
import Driver.DriverB;
import Transport.Transport;

public class Car extends Transport<DriverB> {

    private BodyType bodyType;

    public Car(String brand, String model, Float engineVolume, DriverB driver, BodyType bodyType) {
        super(brand, model, engineVolume, driver);
        this.bodyType = bodyType;
    }

    @Override
    public void doDiagnostic() throws DiagnosticException {
        if(driver == null || ! driver.isHasLicense()) {
            throw new DiagnosticException("Автомобиль " + brand + " " + model +
                    " - Необходимо указать водителя с действующими правами!");
        }
        System.out.println("Диагностика " + brand + " " + model + " выполнена успешно");
    }

    @Override
    public void printType() {
        if(bodyType != null){
            System.out.println(bodyType);
        }
        else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", " + bodyType;
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

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }
}
