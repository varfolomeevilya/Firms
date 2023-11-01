package org.example;

public class PersonByPiecework extends Person {
    private double pieceworkSalary;
    private int quantitywork;

    public PersonByPiecework() {
    }

    public PersonByPiecework(String name, String surname, int child, double pieceworkSalary) {
        super(name, surname, child);
        this.pieceworkSalary = pieceworkSalary;
        this.tax = 0.15;
    }

    public double getPieceworkSalary() {
        return pieceworkSalary;
    }

    public void setPieceWorkSalary(double pieceworkSalary) {
        this.pieceworkSalary = pieceworkSalary;
    }

    public int getQuantityWork() {
        return quantitywork;
    }

    public void setQuantityWork(int quantityWork) {
        this.quantitywork = quantityWork;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void quantityAndHours(int quantityWork, int hours){
        this.quantitywork = quantityWork;
        this.workHours = hours;
    }

    @Override
    public double takeSalary() {
        this.salary = this.pieceworkSalary * this.quantitywork;
        return this.salary;
    }

    @Override
    public double takeSalaryTax() {
        if(!super.getOfshor()) {
            if (super.getChild() > 0) {
                this.salaryTax = this.salary - (this.salary * this.tax);
            } else {
                this.tax += 0.05;
                this.salaryTax = this.salaryChild = this.salary - (this.salary * this.tax);
            }
            getBonus();
        } else {
            this.tax = 0;
            this.salaryTax = this.salary;
        }
        return this.salaryTax;
    }

    @Override
    public String toString() {
        return super.toString() + "\t\tсдельная\t\t" + this.salary;
    }

    public String myToStringSalary(){
        return super.toString() + "\t\tсдельная\t\t" + this.salary;
    }

    public String myToStringTax(){
        return super.toString() + "\t\t" + this.tax + "\t\t\t\t" + this.salary  + "\t\t\t" + this.salaryTax;
    }

}
