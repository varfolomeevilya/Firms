package org.example;

public class Main {
    public static void main(String[] args) {
        StaffMember staffMember = new StaffMember("Ivanov", "Ivan", "Dmitrievich", 25000);
        PersonByHour person = new PersonByHour("Sidorov", "Andrey", "Balerivich", 20, 20000);
        PersonByPiecework person1 = new PersonByPiecework("Petrov", "Alekcandr", "Viktorovich", 26, 26000);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(staffMember);
        ArrayList<Person> persons1 = new ArrayList<>();
        persons.add(person1);
        persons1.add(person);
        
       Firms firms = new Firms(persons);
      System.out.println(firms.calcSalary())

    }
}
