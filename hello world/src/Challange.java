public class Challange {
    public static void main(String[] args) {
        double  myFirstValue = 20.00;
        double mySecondValue = 80.00;
        double  SumOf = (myFirstValue + mySecondValue) * 100;
        double finalValue = SumOf % 40;
        boolean totalValue = finalValue == 0.00 ? true :false;
        {
            System.out.println("totalValue is : " + totalValue);
        }
        if (!totalValue){
            System.out.println("Got Some Reminder");
        }
    }
}
