import java.util.Scanner;

public class LeapYear {
    // a year divisible by 4 but not by 100 or a number divisible by 400 is a leap year
    public static void main(String[] args) {
        int year;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a year to check Leap year");
        year = s.nextInt();
        if (year >= 1582) {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 = 0)) {
                System.out.println("Leap Year");
            }
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}
