package home_work_1.branching;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AverageNumberTest {

    @Test
    void averageNumber() {
        Assertions.assertEquals(2, AverageNumber.averageNum(1, 2, 3));
    }
}
