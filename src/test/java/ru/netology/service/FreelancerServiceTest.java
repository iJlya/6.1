package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreelancerServiceTest {

    @Test
    public void testCalculate() {
        FreelancerService service = new FreelancerService();

        int actual = service.calculate (10_000, 3_000, 20_000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

}