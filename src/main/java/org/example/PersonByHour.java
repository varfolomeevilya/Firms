package org.example;

public class PersonByHour extends  Person {

    private float hour;
    private int salaryInHour;
    public PersonByHour(){
        super();
    }
    public PersonByHour(String surname, String name, String nativeland, float hour, int salaryInHour){
        super(surname, name, nativeland);
        this.hour=hour;
        this.salaryInHour=salaryInHour;


    }
    public float getHour() {
        return hour;
    }

    public void setHour(float hour) {
        this.hour = hour;
    }
    public int getSalaryInHour() {
        return salaryInHour;
    }

    public void setSalaryInHour(int salaryInHour) {
        this.salaryInHour = salaryInHour;
    }

    @Override
    public Float takeSalary() {
        return hour * salaryInHour;
    }

    @Override
    public String toString() {
        return "PersonByHour{" +
                "hour=" + hour +
                ", salaryInHour=" + salaryInHour +
                '}';
    }
}
