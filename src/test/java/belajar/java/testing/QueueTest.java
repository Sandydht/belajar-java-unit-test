package belajar.java.testing;

import org.junit.jupiter.api.*;

import java.util.LinkedList;
import java.util.Queue;

@DisplayName("A Queue")
public class QueueTest {
    private Queue<String> queue;

    @Nested
    @DisplayName("When new")
    public class WhenNew {
        @BeforeEach
        public void setUp() {
            queue = new LinkedList<>();
        }

        @Test
        @DisplayName("When offer, size must be 1")
        public void addOfferNewData() {
            queue.offer("Sandy");
            Assertions.assertEquals(1, queue.size());
        }

        @Test
        @DisplayName("When offer 2 data, size must be 2")
        public void offerMoreData() {
            queue.offer("Dwi");
            queue.offer("Handoko");
            Assertions.assertEquals(2, queue.size());
        }
    }
}
