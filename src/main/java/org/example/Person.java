package org.example;

abstract public class Person {
     private String surname;
    private String name;
    private String nativeland;

    public Person(){
    }

    public Person(String surname, String name, String nativeland){
        this.surname=surname;
        this.name=name;
        this.nativeland=nativeland;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getNativeland() {
        return nativeland;
    }

    public void setNativeland(String nativeland) {
        this.nativeland = nativeland;
    }
    public Float takeSalary(){
        return null;
    }

      @Override
      public String toString() {
          return "Person{" +
                  "surname='" + surname + '\'' +
                  ", name='" + name + '\'' +
                  ", nativeland='" + nativeland + '\'' +
                  '}';
      }
}
