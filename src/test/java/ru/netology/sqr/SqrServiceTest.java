package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SqrServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/SQR.csv")
    public void testSqrService(String nameTest, int min, int max, int expected) {
        SqrService service = new SqrService();
        int actual = service.counter(min, max);
        Assertions.assertEquals(expected, actual);
    }
}
