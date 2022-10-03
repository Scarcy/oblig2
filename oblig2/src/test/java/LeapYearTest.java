import org.junit.jupiter.api.*;

public class LeapYearTest {
    private final LeapYear leap = new LeapYear();
    private static final int[] leap_years = {2021, 2024, 2028, 2032, 2036, 2040, 1884, 1892};

    @Test
    public void testLeapYear(TestInfo testInfo) throws AssertionError {
        for (int i : leap_years) {
            try {
                Assertions.assertTrue(leap.isLeapYear(i));
            } catch (AssertionError e) {
                System.out.println(e.getMessage());
                throw new AssertionError(i);
            }
            System.out.println(i);
        }


    }

}
