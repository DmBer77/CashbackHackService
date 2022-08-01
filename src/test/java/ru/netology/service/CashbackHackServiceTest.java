package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CashbackHackServiceTest {

    @Test
    void shouldReturnTheMissingSumForBonus() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int sum = 1900;
        int expected = 100;
        int actual = cashbackHackService.remain(sum);

        Assertions.assertEquals(expected, actual);

    }
}