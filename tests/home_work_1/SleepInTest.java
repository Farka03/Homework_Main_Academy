package home_work_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SleepInTest {

    @Test
    void checkSleep() {
        assertTrue(SleepIn.sleepIn(true, true));
    }
}