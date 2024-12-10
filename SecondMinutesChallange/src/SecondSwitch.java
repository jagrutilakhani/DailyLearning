public class SecondSwitch  {
    public static void main(String[] args) {
        printWeekDay(0);
        printWeekDay(3);


        String sk = "s";

        String sk1 = new String();



    }
    public static void printDayOfWeek (int day) {
        String dayOfTheWeek;

        switch (day) {
            case 0 -> dayOfTheWeek = "Sunday";
            case 1 -> dayOfTheWeek = "Monday";
            case 2 -> dayOfTheWeek = "Tuesday";
            case 3 -> dayOfTheWeek = "Wednesday";
            case 4 -> dayOfTheWeek = "Thursday";
            case 5 -> dayOfTheWeek = "Friday";
            case 6 -> dayOfTheWeek = "Saturday";
            default -> dayOfTheWeek = "Invalid Day";
        }

        System.out.println(dayOfTheWeek);
    }

    public static void printWeekDay(int day) {
        String printWeekDay;
        if (day == 0) {
            printWeekDay = "sunday";
        }else if (day == 1) {
            printWeekDay = "monday";
        }else if (day == 2) {
            printWeekDay = "tuesday";
        }else if (day == 3) {
            printWeekDay = "wednesday";
        }else if (day == 4) {
            printWeekDay = "thursday";
        }else if (day == 5) {
            printWeekDay = "friday";
        }else if (day == 6){
            printWeekDay = "saturday";
        }else  {
            printWeekDay = "Invalid Day";

        }
        System.out.println(printWeekDay);

    }
}
