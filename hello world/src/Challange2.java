import java.util.Arrays;

public class Challange2 {
    public static void main(String[] args) {
        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myTotalValue = (myFirstValue +  mySecondValue) * 100.00d;
        System.out.println("MyValueTotal = " + myTotalValue );
        double theReminder = myTotalValue % 40.00d;
        System.out.println("theReminder = " + theReminder);
        boolean isNoReminder = (theReminder ==0 ) ? true : false;
        System.out.println("isNoReminder = " + isNoReminder);
        if (!isNoReminder) {
            System.out.println("Got Some Reminder");
        }

    }
    }

