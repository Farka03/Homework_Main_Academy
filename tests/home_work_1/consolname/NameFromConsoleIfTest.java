package home_work_1.consolname;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameFromConsoleIfTest {

    @Test
    void nameIf() {
        assertNotNull(NameFromConsoleIf.equalsNameIf("Егор"));
    }
}