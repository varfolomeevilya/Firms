package org.example;

public class StaffMember extends Person {


    private int salary;
    public StaffMember(){
        super();
    }
    public StaffMember(String surname, String name, String nativeland, int salary){
        super(surname, name, nativeland);
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public Float takeSalary() {
        return Float.valueOf(salary);
    }

    @Override
    public String toString() {
        return "StaffMember{" +
                "salary=" + salary +
                '}';
    }
}
