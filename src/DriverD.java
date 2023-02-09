public class DriverD extends Driver {

    public DriverD(String name, boolean hasLicense, int experienceYears) {
        super(name, hasLicense, experienceYears);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель " + name + " начал движение");
    }

    @Override
    public void stopMove() {
        System.out.println("Водитель " + name + " остановился");
    }

    @Override
    public void refill() {
        System.out.println("Водитель " + name + " остановился для дозаправки");
    }
}
