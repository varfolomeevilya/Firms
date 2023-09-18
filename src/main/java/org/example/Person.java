package org.example;

public class Person extends Firms {
    private String fio;
    public Person(){
        this.fio = "Ivanov";

    }
    public Person(String fio){
        this.fio = fio;

    }
    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

}
