import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class is_not_leap_year extends Assertions {
    private final LeapYear leap = new LeapYear();

    @ParameterizedTest
    @ValueSource(ints = {1831, 1997, 2001, 2003})
    public void is_not_divisible_by_4(int year) {
        assertFalse(leap.isLeapYear(year));
    }
    @ParameterizedTest
    @ValueSource(ints = {200, 300, 500, 600})
    public void is_divisible_by_100_but_not_400(int year){
        assertFalse(leap.isLeapYear(year));
    }
}