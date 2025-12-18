package belajar.java.testing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

@DisplayName("Test with TestInfo")
public class InformationTest {
    @Test
    @Tag("cool")
    @DisplayName("This is test one")
    public void testOne(TestInfo testInfo) {
        System.out.println(testInfo.getDisplayName());
        System.out.println(testInfo.getTags());
        System.out.println(testInfo.getTestMethod().orElse(null));
        System.out.println(testInfo.getTestClass().orElse(null));
    }
}
