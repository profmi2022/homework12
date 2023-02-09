public class Truck extends Transport<DriverC> {

    public Truck(String brand, String model, Float engineVolume, DriverC driver, Tonnage tonnage) {
        super(brand, model, engineVolume, driver);

        this.tonnage = tonnage;
    }

    private Tonnage tonnage;

    @Override
    public void printType() {
        if(tonnage != null){
            System.out.println(tonnage);
        }
        else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }

    @Override
    public String toString() {
        return super.toString() +", " + tonnage;
    }

    @Override
    public void startMove() {
        System.out.println("Грузовик " + brand + " " + model + " начал движение");
    }

    @Override
    public void stopMove() {
        System.out.println("Грузовик " + brand + " " + model + " остановился");
    }
    @Override
    public void pitStop() {
        System.out.println("Грузовик " + brand + model + " заехал на пит-стоп");
    }

    @Override
    public void bestCircleTime() {
        System.out.println("Лучшее время круга грузовика " + brand + model + " - 100 минут");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость грузовика " + brand + model + " 120 км/ч");
    }

    public Tonnage getTonnage() {
        return tonnage;
    }

    public void setTonnage(Tonnage tonnage) {
        this.tonnage = tonnage;
    }
}
