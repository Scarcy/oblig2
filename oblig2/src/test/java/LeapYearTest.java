import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearTest {
    private final LeapYear leap = new LeapYear();
    private final int[] leap_years = {2020,2024,2028,2032,2036,2040, 1884, 1892};
    @Test
    public void testLeapYear(){
        Assertions.assertTrue(leap.isLeapYear(2020));
        Assertions.assertTrue(leap.isLeapYear(2024));
        Assertions.assertTrue(leap.isLeapYear(2028));
        Assertions.assertTrue(leap.isLeapYear(2032));
        Assertions.assertTrue(leap.isLeapYear(2036));
        Assertions.assertTrue(leap.isLeapYear(2040));
        Assertions.assertTrue(leap.isLeapYear(1884));
        Assertions.assertTrue(leap.isLeapYear(1892));

    }

}
