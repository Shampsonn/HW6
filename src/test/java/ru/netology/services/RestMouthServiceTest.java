package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestMouthServiceTest {
    @Test
    public void calculateTest1() {

        RestMouthService service = new RestMouthService();

        int actual = service.calculate(10_000, 3000, 20_000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void calculateTest2() {

        RestMouthService service = new RestMouthService();

        int actual = service.calculate(100_000, 60_000, 150_000);
        int expected = 2;

        Assertions.assertEquals(expected, actual);

    }

}