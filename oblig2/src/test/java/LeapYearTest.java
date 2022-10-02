import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearTest {
    private final LeapYear leap = new LeapYear();

    @Test
    public void testLeapYear(){
        Assertions.assertTrue(leap.isLeapYear(2020));
        Assertions.assertTrue(leap.isLeapYear(2024));
        Assertions.assertTrue(leap.isLeapYear(2028));
        Assertions.assertTrue(leap.isLeapYear(2032));
        Assertions.assertTrue(leap.isLeapYear(2036));
        Assertions.assertTrue(leap.isLeapYear(2040));
    }

}
