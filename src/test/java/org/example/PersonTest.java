package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person person= new Person("Ivanov");
    @BeforeEach
    void init(){
        person.setFio("Sidorov");

    }
    @Test
    void getFio() {
        assertEquals("Sidorov", person.getFio());
    }

    @Test
    void setFio() {
        person.setFio("Petrov");
        assertEquals("Petrov", person.getFio());
    }

}