package Driver;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return hasLicense == driver.hasLicense && experienceYears == driver.experienceYears && Objects.equals(name, driver.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hasLicense, experienceYears);
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
