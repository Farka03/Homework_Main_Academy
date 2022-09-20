package home_work_1.branching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisibilityTest {

    @Test
    void divisible() {
        assertTrue(Divisibility.checkDivisibility(4, 2));
    }
}