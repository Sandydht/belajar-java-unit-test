package belajar.java.testing;

import belajar.java.testing.resolver.RandomParameterResolver;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

@Extensions(value = {
        @ExtendWith(RandomParameterResolver.class)
})
public class RandomCalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void testRandom(Random random) {
        var a = random.nextInt();
        var b = random.nextInt();
        assertEquals(a + b, calculator.add(a, b));
    }
}
