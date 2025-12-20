package belajar.java.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

public class MockTest {
    @Test
    public void testMock() {
        // Membuat object mock
        List<String> list = Mockito.mock(List.class);

        // Menambah behavior ke mock object
        Mockito.when(list.get(0)).thenReturn("Sandy");

        // Test mock
        Assertions.assertEquals("Sandy", list.get(0));

        // Verify mock
        Mockito.verify(list, Mockito.times(1)).get(0);
    }
}
