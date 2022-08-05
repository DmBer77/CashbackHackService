package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CashbackHackServiceTest {

    @Test
    void shouldReturnTheMissingAmountForBonus() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int sum = 1900;
        int expected = 100;
        int actual = cashbackHackService.remain(sum);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldReturnTheMissingAmountForBonusIfTheActualAmountLessThanOneThousand() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int sum = 750;
        int expected = 250;
        int actual = cashbackHackService.remain(sum);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldReturnTheMissingAmountForBonusIfTheActualAmountEqualsTheExpected() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int sum = 2000;
        int expected = 0;
        int actual = cashbackHackService.remain(sum);

        Assertions.assertEquals(expected, actual);

    }
}