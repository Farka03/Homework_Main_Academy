package home_work_1.branching;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ConverterTest {

    @Test
    void bytesOrKylo() {
        Assertions.assertEquals(1048576.0, Converter.choose(1024, 1));
    }
}
