package home_work_1.consolname;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameFromConsoleSwitchTest {

    @Test
    void nameSwitch() {
        assertNotNull(NameFromConsoleSwitch.equalsSwitch("Егор"));
    }
}