package org.example;

import java.util.ArrayList;

import static org.example.Task01.courseTugr;

public class Firms  {
    private ArrayList<Person> persons;


    public Firms(){
       this.persons= new ArrayList<>();
    }

    public Firms(ArrayList<Person> persons){
       this.persons = persons;
    }
    public void addPerson(Person person){
        persons.add(person);
    }

    @Override
    public String toString() {
        String str = "ФИО\t\t\t\t\tВид оплаты\t\tСумма\n";
        for (int i = 0; i < persons.size(); i++){
            str += persons.get(i).toString() + "\n";
        }
        return str;
    }

    public String myToStringSalary(){
        String str = "ФИО\t\t\t\t\tВид оплаты\t\tСумма\n";
        for (int i = 0; i < persons.size(); i++){
            str += persons.get(i).myToStringSalary() + "\n";
        }
        return str;
    }

    public String myToStringTax(){
        String str = "ФИО\t\t\t\t\tНДС%\t\t\tСумма\t\t\t" + str();
        for (int i = 0; i < persons.size(); i++){
            str += persons.get(i).myToStringTax() + "\n";
        }
        return str;
    }

    private String str (){
        return "Сумма с НДС\n\t\t\t\t\t\t\t\t\t\t\t\t\t(руб/тугрики)\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\tКурс 1/" + courseTugr + "\n";
    }


}
