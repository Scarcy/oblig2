import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class is_leap_year extends Assertions {
    private final LeapYear leap = new LeapYear();

    @ParameterizedTest
    @ValueSource(ints = {2021, 2024, 2028, 2032, 2036, 2040, 1884, 1892})
    public void is_divisible_by_4_but_not_100(int year) {
        assertTrue(leap.isLeapYear(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {2000, 400, 800, 1200, 1600})
    public void is_divisible_by_400(int year) {
        assertTrue(leap.isLeapYear(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {2020, 2024, 2028, 2032, 2036, 2040, 1884, 1892})
    public void is_leapYear(int year) {
        assertTrue(leap.isLeapYear(year));
    }

}
