package org.example;



public class Main {
    public static void main(String[] args) {
     Organization org =new Organization();
     DelEmployee ivanov=new DelEmployee("Иванов",1300, 0);
     DaysEmployee petrov=new DaysEmployee("Петров", 2500, 0);
     HourEmployee sidorov=new HourEmployee("Сидоров",346, 0);

     petrov.setChildren(true);
     sidorov.setOffshore(true);

     org.addEmployee(ivanov);
     org.addEmployee(petrov);
     org.addEmployee(sidorov);

     org.setEmplTime("Иванов", 25);
     org.setEmplTime("Петров", 10);
     org.setEmplTime("Сидоров", 206);

        System.out.println(org.toString());
    }
}