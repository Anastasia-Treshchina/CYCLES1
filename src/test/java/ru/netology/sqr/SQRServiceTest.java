package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'how many squares in range 200 to 300', 200, 300, 3",
            "'how many squares in range 200 to 362', 200, 362, 5",
            "'how many squares in range 0 to 300', 0, 300, 8"})
    void shouldHowManySquares(String testName, int startNumber, int lastNumber,
                              int expected) {
        SQRService service = new SQRService();

        int actual = service.howManySquares(startNumber, lastNumber);

        assertEquals(expected, actual);
    }
}