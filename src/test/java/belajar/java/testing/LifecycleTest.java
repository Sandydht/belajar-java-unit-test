package belajar.java.testing;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class)
public class LifecycleTest {
    private String temp;

    @Test
    @Order(1)
    public void testA() {
        temp = "Sandy Dwi Handoko Trapsilo";
    }

    @Test
    @Order(2)
    public void testB() {
        System.out.println(temp);
    }
}
