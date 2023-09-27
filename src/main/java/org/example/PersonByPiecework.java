package org.example;

public class PersonByPiecework extends Person {

    private float piecework;
    private int salaryInPiecework;
    public PersonByPiecework(){
        super();
    }
    public PersonByPiecework(String surname, String name, String nativeland, float piecework, int salaryInPiecework){
        super(surname, name, nativeland);
        this.piecework=piecework;
        this.salaryInPiecework=salaryInPiecework;
    }
    public float getPiecework() {
        return piecework;
    }

    public void setPiecework(float piecework) {
        this.piecework = piecework;
    }
    public int getSalaryInPiecework() {
        return salaryInPiecework;
    }

    public void setSalaryInPiecework(int salaryInPiecework) {
        this.salaryInPiecework = salaryInPiecework;
    }

    @Override
    public Float takeSalary() {
        return piecework * salaryInPiecework;
    }

    @Override
    public String toString() {
        return "PersonByPiecework{" +
                "piecework=" + piecework +
                ", salaryInPiecework=" + salaryInPiecework +
                '}';
    }
}
