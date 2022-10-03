import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearTest {
    private final LeapYear leap = new LeapYear();
    private final int[] years = {2020,2024,2028,2032,2036,2040, 1884, 1892};
    @Test
    public void testLeapYear(){
        for (int i : years) {
            try {
                Assertions.assertTrue(leap.isLeapYear(i));
                System.out.println(i + " is a leap year!");
            } catch (AssertionError e) {
                System.out.println(e + "\n" + " This is not a leap year: " + i);
                throw new AssertionError(e);
            }
        }

    }

}
