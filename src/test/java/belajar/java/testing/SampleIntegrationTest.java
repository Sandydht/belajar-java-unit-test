package belajar.java.testing;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("integration-test")
public class SampleIntegrationTest {
    @Test
    public void integrationTest1() {
        System.out.println("Integration test 1");
    }

    @Test
    public void integrationTest2() {
        System.out.println("Integration test 2");
    }
}
