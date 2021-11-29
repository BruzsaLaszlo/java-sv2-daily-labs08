package day01;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberSequenceTest {

    @Test
    void closeToAverageTest() {

        var list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        NumberSequence ns = new NumberSequence(list);

        assertEquals(3, ns.closeToAverage(1).size());

    }

    @Test
    void constructorsTest() {

        NumberSequence ns = new NumberSequence(List.of(1, 5, 20, 100));
        assertEquals(4, ns.getNumbers().size());

        ns = new NumberSequence(10, 10, 100);
        assertEquals(10, ns.getNumbers().size());

    }
}