import java.util.Arrays;

public class Hello {
    public static void main(String[] ak) {
        System.out.println("hello, Tim");



        if (true) {
            System.out.println("I am not j");
        } else if (true) {
            System.out.println("i am not k");
        } else if (true) {
            System.out.println("i am not L");
        }

        int topScore = 80;
        if (topScore < 100); {
            System.out.println("you got the heigh score");

            int secondTopscore =60;
            if (topScore > secondTopscore && topScore < 100) {
                System.out.println("greater than second top score and less than 100 ");

            }
            if ((topScore < 90) || (secondTopscore <=90)) {
                System.out.println("Eithe or Both Condition are true");

            int newValue = 50;
             if (newValue == 50){
                 System.out.println("This is an error");
             }
            boolean isCar = false;
             if (!isCar) {
                 System.out.println("This is not supposed to happen");
             }


            }

        }
/*
        boolean isAlien = false;
        if (isAlien == true);
        System.out.println("it is not an alien");
        System.out.print("and i am scared of alien");
*/

     String makeOfCar = "walkswagen";
     boolean isDomestic = makeOfCar == "walkswagen" ? false : true;

     if(isDomestic) {
         System.out.println("This car is domestic to our country");
     } else {

         System.out.println("this car is not domestic for our country");



         int ageOfClient = 20;
         String ageTaxt = (ageOfClient >= 18) ? "over Eighteen" : "still Kid";{
             System.out.println("our client is + text eighteen");
         }
      String s = (isDomestic) ? "This car is Domestic" : "This car is not Domestic";

         System.out.println(s);
     }
     double  myFirstValue = 20.00;
     double mySecondValue = 80.00;
     double  SumOf = (myFirstValue + mySecondValue) * 100;
     double finalValue = SumOf % 40;
     boolean totalValue = finalValue == 0.00 ? true :false;
        {
            System.out.println("totalValue" + finalValue);
        }
        if (! totalValue){
            System.out.println("Got Some Reminder");
        }

    }
}
