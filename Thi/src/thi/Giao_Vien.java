package thi;

import java.io.Serializable;

public class Giao_Vien implements Serializable {

    private String name;
    private String major;
    private double salary;

    public Giao_Vien() {
    }

    public Giao_Vien(String name, String major, double salary) {
        this.name = name;
        this.major = major;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getStatus() {
        if (this.salary > 5000) {
            return "Tốt";
        } else {
            return "Bình thường";
        }

    }

    @Override
    public String toString() {
        return "Thi{" + "name=" + name + ", major=" + major + ", salary=" + salary + '}';
    }

}
