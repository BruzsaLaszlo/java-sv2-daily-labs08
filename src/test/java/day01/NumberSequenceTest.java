package day01;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NumberSequenceTest {


    @Test
    void closeToAverageTest() {

        var list = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        NumberSequence ns = new NumberSequence(list);

        assertEquals(3, ns.closeToAverage(1).size());

    }

    @Test
    void constructorWithListTest() {

        NumberSequence ns = new NumberSequence(List.of(1, 5, 20, 100));
        assertEquals(4, ns.getNumbers().size());

    }

    @Test
    void constructorWithCountMinMaxTest() {

        final int count = 100;
        final int min = 10;
        final int max = 1000;
        NumberSequence ns = new NumberSequence(count, min, max);

        assertEquals(count, ns.getNumbers().size());
        assertTrue(isMinMaxValid(ns.getNumbers(), min, max));

    }

    private boolean isMinMaxValid(List<Integer> numbers, int min, int max) {

        for (int i : numbers) {
            if (i > max || i < min) {
                return false;
            }
        }
        return true;

    }
}