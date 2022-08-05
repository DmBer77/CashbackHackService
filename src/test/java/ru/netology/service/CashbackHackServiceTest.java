package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnTheMissingAmountForBonus() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int sum = 1900;
        int expected = 100;
        int actual = cashbackHackService.remain(sum);

        Assert.assertEquals (actual, expected);

    }

    @Test
    public void shouldReturnTheMissingAmountForBonusIfTheActualAmountLessThanOneThousand() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int sum = 750;
        int expected = 250;
        int actual = cashbackHackService.remain(sum);

        Assert.assertEquals (actual, expected);

    }

    @Test
    public void shouldReturnTheMissingAmountForBonusIfTheActualAmountEqualsTheExpected() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int sum = 2000;
        int expected = 0;
        int actual = cashbackHackService.remain(sum);

        Assert.assertEquals (actual, expected);

    }
}