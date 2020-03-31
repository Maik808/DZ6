package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {

    @ParameterizedTest
    @CsvSource({
    "8,15,13,15,17,20,19,20,7,14,14,18"
    })
        void calculateSum(int one, int two, int three , int four , int five , int six, int seven, int eight , int nine, int ten, int eleven , int twelve  ) {
        StatsService service = new StatsService();
        int[] value = {one,two, three, four, five, six, seven, eight, nine, ten, eleven, twelve };
        int actual = service.calculateSum( value );
        int expected = 180;
        assertEquals(expected, actual );
    }

    @ParameterizedTest
    @CsvSource({
            "8,15,13,15,17,20,19,20,7,14,14,18"
    })
    void averageSum(int one, int two, int three , int four , int five , int six, int seven, int eight , int nine, int ten, int eleven , int twelve) {
        StatsService service = new StatsService();
        int[] value = {one,two, three, four, five, six, seven, eight, nine, ten, eleven, twelve };
        int actual = service.averageSum( value );
        int expected = 15;
        assertEquals(expected, actual );
    }

    @ParameterizedTest
    @CsvSource({
            "8,15,13,15,17,20,19,20,7,14,14,18"
    })
    void findMax(int one, int two, int three , int four , int five , int six, int seven, int eight , int nine, int ten, int eleven , int twelve) {
        StatsService service = new StatsService();
        int[] value = {one,two, three, four, five, six, seven, eight, nine, ten, eleven, twelve };
        int actual = service.findMax( value );
        int expected = 6;
        assertEquals(expected, actual );
    }

    @ParameterizedTest
    @CsvSource({
            "8,15,13,15,17,20,19,20,7,14,14,18"
    })
    void findMin(int one, int two, int three , int four , int five , int six, int seven, int eight , int nine, int ten, int eleven , int twelve) {
        StatsService service = new StatsService();
        int[] value = {one,two, three, four, five, six, seven, eight, nine, ten, eleven, twelve };
        int actual = service.findMin( value );
        int expected = 9;
        assertEquals(expected, actual );
    }

    @ParameterizedTest
    @CsvSource({
            "8,15,13,15,17,20,19,20,7,14,14,18"
    })
    void belowAverage(int one, int two, int three , int four , int five , int six, int seven, int eight , int nine, int ten, int eleven , int twelve) {
        StatsService service = new StatsService();
        int[] value = {one,two, three, four, five, six, seven, eight, nine, ten, eleven, twelve };
        int actual = service.belowAverage( value );
        int expected = 5;
        assertEquals(expected, actual );
    }

    @ParameterizedTest
    @CsvSource({
            "8,15,13,15,17,20,19,20,7,14,14,18"
    })
    void higherAverage(int one, int two, int three , int four , int five , int six, int seven, int eight , int nine, int ten, int eleven , int twelve) {
        StatsService service = new StatsService();
        int[] value = {one,two, three, four, five, six, seven, eight, nine, ten, eleven, twelve };
        int actual = service.higherAverage( value );
        int expected = 5;
        assertEquals(expected, actual );
    }
}