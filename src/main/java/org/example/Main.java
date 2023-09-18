package org.example;

public class Main {
    public static void main(String[] args) {

       Firms firms = new Firms();
       firms.setBids(3000);
       firms.setHourly(800);
       firms.setPiecework(5500);
       firms.getTotal(firms);
       System.out.println("Директор");
       Person person= new Person("Boris");
       System.out.println(person.getFio());
       System.out.println("ФИО") ;
       Person person1= new Person("Ivanov");
       Person person2=new Person("Sidorov");
       Person person3=new Person("Petrov");
       firms.setTotal(9300);
       System.out.println(person1.getFio());
       System.out.println(person2.getFio());
       System.out.println(person3.getFio());
       System.out.println("Виды оплаты");
       System.out.println("Ставка" + firms.getBids());
       System.out.println("Почасовой" + firms.getHourly());
       System.out.println("Сдельная" + firms.getPiecework());
       System.out.println("Сумма" + firms.getBids());
       System.out.println("сумма" + firms.getHourly());
       System.out.println("Сумма" + firms.getPiecework());
       System.out.println("Итог" + firms.getTotal(firms));
       System.out.println();

    }
}