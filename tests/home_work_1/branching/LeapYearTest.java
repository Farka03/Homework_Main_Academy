package home_work_1.branching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    @Test
    void leap() {
        assertTrue(LeapYear.leap(2020, 4));
    }
}