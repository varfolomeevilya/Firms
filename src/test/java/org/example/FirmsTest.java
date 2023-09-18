package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirmsTest {
    Firms firms = new Firms(3000, 800, 5500);
    @BeforeEach
    void init(){
        firms.setTotal(9300);
        firms.setBids(3000);
         firms.setHourly(800);
         firms.setPiecework(5500);
    }

    @Test
    void getBids() {
        assertEquals(3000,firms.getBids());
    }

    @Test
    void getTotal() {
        assertEquals(9300, firms.getTotal());
    }

    @Test
    void setTotal() {
        firms.setTotal(9500);
        assertEquals(9500, firms.getTotal());
    }

    @Test
    void setBids() {
        firms.setBids(5000);
        assertEquals(5000, firms.getBids());
    }

    @Test
    void getHourly() {
        assertEquals(800, firms.getHourly());
    }

    @Test
    void setHourly() {
        firms.setHourly(1200);
        assertEquals(1200, firms.getHourly());
    }

    @Test
    void getPiecework() {
        assertEquals(5500, firms.getPiecework());
    }

    @Test
    void setPiecework() {
        firms.setPiecework(7900);
        assertEquals(7900, firms.getPiecework());
    }
}