package belajar.java.testing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class ConditionTest {
    @Test
    @EnabledOnOs(value = {OS.WINDOWS})
    public void onlyRunOnWindows() {
        // put your unit test
    }

    @Test
    @DisabledOnOs(value = {OS.WINDOWS})
    public void disabledRunOnWindows() {
        // put your unit test
    }

    @Test
    @EnabledOnJre(value = {JRE.JAVA_14})
    public void onlyRunOnJava14() {
        // put your unit test
    }

    @Test
    @DisabledOnJre(value = {JRE.JAVA_14})
    public void disabledRunOnJava14() {
        // put your unit test
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_15)
    public void onlyRunOnJava11To15() {
        // put your unit test
    }

    @Test
    @DisabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_15)
    public void disabledRunOnJava11To15() {
        // put your unit test
    }

    @Test
    @EnabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
    public void enabledOnOracle() {
        // put your unit test
    }

    @Test
    @DisabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
    public void disabledOnOracle() {
        // put your unit test
    }

    @Test
    @EnabledIfSystemProperties({
            @EnabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
    })
    public void enabledOnOracles() {
        // put your unit test
    }

    @Test
    @DisabledIfSystemProperties({
            @DisabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
    })
    public void disabledOnOracles() {
        // put your unit test
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    public void enabledOnProfileDev() {
        // put your unit test
    }

    @Test
    @DisabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    public void disabledOnProfileDev() {
        // put your unit test
    }

    @Test
    @EnabledIfEnvironmentVariables({
            @EnabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    })
    public void enabledOnEnvironmentVariables() {
        // put your unit test
    }

    @Test
    @DisabledIfEnvironmentVariables({
            @DisabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    })
    public void disabledOnEnvironmentVariables() {
        // put your unit test
    }
}
