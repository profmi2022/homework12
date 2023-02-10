package Driver;

public abstract class Driver {

    protected String name;
    protected boolean hasLicense;
    protected int experienceYears;

    public Driver(String name, boolean hasLicense, int experienceYears) {
        this.name = name;
        this.hasLicense = hasLicense;
        this.experienceYears = experienceYears;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasLicense() {
        return hasLicense;
    }

    public void setHasLicense(boolean hasLicense) {
        this.hasLicense = hasLicense;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public abstract void startMove();
    public abstract void stopMove();
    public abstract void refill();

}
