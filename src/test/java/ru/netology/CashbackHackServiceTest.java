package ru.netology;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(999);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void testAdd() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1_001);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @Test
    public void testFull() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1_000);
        int expected = 0;

        assertEquals(actual, expected);
    }
}