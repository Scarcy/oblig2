public class LeapYear {

    public boolean is_divisible_by_4_but_not_100(int year) {
        return year % 4 == 0 && year % 100 != 0;
    }
    public boolean is_divisible_by_400(int year){
        return year % 400 == 0;
    }

    public boolean isLeapYear(int year){
        return is_divisible_by_4_but_not_100(year) || is_divisible_by_400(year);

    }


}
