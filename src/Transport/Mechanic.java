package Transport;

public class Mechanic {

    private String name;
    private String company;

    public Mechanic(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public void service() {
        System.out.println("Механик " + name + " из компании " + company + " проводит техобслуживание");
    }

    public void repair() {
        System.out.println("Механик " + name + " из компании " + company + " проводит ремонт");
    }

    @Override
    public String toString() {
        return "ФИО: " + name +
                ", компания: " + company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

}
