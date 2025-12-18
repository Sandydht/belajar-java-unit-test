package belajar.java.testing;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class)
public class OrderedTest {
    @Test
    @Order(2)
    public void test3() {
        // put your unit test
    }

    @Test
    @Order(3)
    public void test2() {
        // put your unit test
    }

    @Test
    @Order(1)
    public void test1() {
        // put your unit test
    }
}
