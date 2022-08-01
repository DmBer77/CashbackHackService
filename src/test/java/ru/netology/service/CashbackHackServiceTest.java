package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnTheMissingAmountForBonusForJunitFour() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int sum = 1900;
        int expected = 100;
        int actual = cashbackHackService.remain(sum);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void shouldReturnTheMissingAmountForBonusForJUnitJupiter() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int sum = 1900;
        int expected = 100;
        int actual = cashbackHackService.remain(sum);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldReturnTheMissingAmountForBonusIfTheActualAmountLessThanOneThousandForJUnitFour() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int sum = 750;
        int expected = 250;
        int actual = cashbackHackService.remain(sum);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void shouldReturnTheMissingAmountForBonusIfTheActualAmountLessThanOneThousandForJunitJupiter() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int sum = 750;
        int expected = 250;
        int actual = cashbackHackService.remain(sum);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldReturnTheMissingAmountForBonusIfTheActualAmountEqualsTheExpectedForJUnitFour() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int sum = 2000;
        int expected = 0;
        int actual = cashbackHackService.remain(sum);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void shouldReturnTheMissingAmountForBonusIfTheActualAmountEqualsTheExpectedForJUnitJupiter() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int sum = 2000;
        int expected = 0;
        int actual = cashbackHackService.remain(sum);

        Assertions.assertEquals(expected, actual);

    }
}