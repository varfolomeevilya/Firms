package org.example;

public class Firms  {

    ArrayList<Person> persons;

    public Firms(){
    }

    public Firms(ArrayList<Person> persons){
       this.persons = persons;
    }

    public Float calcSalary(){
        Float sum=0.0f;
        for(Person person : persons){
            sum+= person.takeSalary();
        }
        return sum;
    }
    
    @Override
    public String toString() {
        return "Firms{" +
                "persons=" + persons +
                '}';
    }
   
}
