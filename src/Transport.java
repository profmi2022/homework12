public abstract class Transport <T extends Driver> implements Competing {

    protected final String brand;
    protected final String model;
    protected Float engineVolume;
    protected T driver;

    @Override
    public String toString() {
        return brand + " " + model +
                ", объем двигателя " + engineVolume +
                ", водитель " + driver.getName();
    }

    public void printInfo(){
        System.out.println("Водитель " + driver.getName() + " управляет автомобилем " + brand + model + " и будет участвовать в заезде");
    }

    public abstract void printType();

    public Transport(String brand, String model, Float engineVolume, T driver) {

        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        setEngineVolume(engineVolume);

        setDriver(driver);

      }

    public void setEngineVolume(Float engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 0f;
        } else {
            this.engineVolume = engineVolume;
        }
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Float getEngineVolume() {
        return engineVolume;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public abstract void startMove();

    public abstract void stopMove();


}

