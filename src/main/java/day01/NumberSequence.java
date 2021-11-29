package day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberSequence {

    private List<Integer> numbers;

    public NumberSequence(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public NumberSequence(int count, int min, int max) {
        Random random = new Random();
        numbers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            numbers.add(random.nextInt(min, max + 1));
        }
    }

    public List<Integer> closeToAverage(int value) {
        double average = getAverageOfNumbers();
        List<Integer> result = new ArrayList<>();
        for (int i : numbers) {
            if (Math.abs(i - average) <= value)
                result.add(i);
        }
        return result;
    }

    private double getAverageOfNumbers() {
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return (double) sum / numbers.size();
    }

    public List<Integer> getNumbers() {
        return List.copyOf(numbers);
    }
}
