package com.modernjava.enhancedswitch;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import com.modernjava.enhancedswitch.DaysInMonth;
import java.time.Month;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DaysInMonthTest {

    @ParameterizedTest
    @MethodSource("input")
    void getDays(Month month, int expectedNoOfDays) {
        int days = DaysInMonth.getDays(month, 2023);
        assertEquals(expectedNoOfDays, days);
    }


    private static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of(Month.FEBRUARY, 28),
                Arguments.of(Month.SEPTEMBER, 30),
                Arguments.of(Month.JANUARY, 31)
        );
    }
}