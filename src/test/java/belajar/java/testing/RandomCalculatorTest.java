package belajar.java.testing;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Random;

public class RandomCalculatorTest extends AbstractCalculatorTest{
    @Test
    public void testRandom(Random random) {
        var a = random.nextInt();
        var b = random.nextInt();

        var result = calculator.add(a, b);
        var expected = a + b;

        assertEquals(expected, result);
    }

    @RepeatedTest(
            value = 10,
            name = "{displayName} ke {currentRepetition} dari {totalRepetitions}"
    )
    public void testRandomRepeat(Random random) {
        var a = random.nextInt();
        var b = random.nextInt();

        var result = calculator.add(a, b);
        var expected = a + b;

        assertEquals(expected, result);
    }

    @RepeatedTest(
            value = 10,
            name = "{displayName}"
    )
    public void testRandomRepeatInfo(TestInfo testInfo, Random random, RepetitionInfo repetitionInfo) {
        System.out.println(testInfo.getDisplayName() + " ke " + repetitionInfo.getCurrentRepetition() + " dari " + repetitionInfo.getTotalRepetitions());

        var a = random.nextInt();
        var b = random.nextInt();

        var result = calculator.add(a, b);
        var expected = a + b;

        assertEquals(expected, result);
    }

    @DisplayName("Test calculator with parameter")
    @ParameterizedTest(name = "{displayName} with data {0}")
    @ValueSource(ints = {1, 2, 3, 4, 5})
    public void testWithParameter(int value) {
        var result = value + value;
        assertEquals(result, calculator.add(value, value));
    }

    public static List<Integer> parameterSource() {
        return List.of(1, 2, 3, 4, 5);
    }

    @ParameterizedTest
    @MethodSource(value = {"parameterSource"})
    public void testWithMethodSource(Integer value) {
        var result = value + value;
        assertEquals(result, calculator.add(value, value));
    }
}
