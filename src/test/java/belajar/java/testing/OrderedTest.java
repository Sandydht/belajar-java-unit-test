package belajar.java.testing;

import org.junit.jupiter.api.*;

@TestInstance(value = TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class)
public class OrderedTest {
    private int count = 0;

    @BeforeAll
    public void beforeAll() {
        System.out.println("Before all");
    }

    @AfterAll
    public void afterAll() {
        System.out.println("After all");
    }

    @Test
    @Order(3)
    public void test3() {
        // put your unit test
        count++;
        System.out.println(count);
    }

    @Test
    @Order(2)
    public void test2() {
        // put your unit test
    }

    @Test
    @Order(1)
    public void test1() {
        // put your unit test
    }
}
