//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(" the sum of the digits in number 1234 is " + sumDigits(1234));
        System.out.println(" the sum of the digits in number 4567 is " + sumDigits(4567));
        System.out.println(" the sum of the digits in number 6789is " + sumDigits(6789));


    }

    public static int sumDigits(int number) {
      if (number < 0){
          return -1;
      }
      int sum = 0;
      while (number > 9){
          sum +=(number % 10);
          number = number / 10;

      }
      sum += number;
      return sum;


    }
}

//        int isEven = 5;
//        int evenCounter = 0;
//        int oddCounter = 0;
//        while (isEven <= 20) {
//            if (isEvenNumber(isEven))
//            evenCounter++;{
//                System.out.println(isEven + "_" );
//                oddCounter++;
//            }
//            isEven++;
//            continue;
//        }
//        System.out.println("total odd number found = " + oddCounter);
//        System.out.println("total even number found = " +evenCounter);
//    }
//
//    public static boolean isEvenNumber(int i) {
//        if(i % 2 ==0){
//            return true;
//        }else{
//            return false;
//        }
//
//    }





//        int j = 1;
//        boolean isReady = false;
//        do{
//            if(j > 5){
//                break;
//            }
//            System.out.println(j);
//            j++;
//            isReady = (j > 0);
//        } while(isReady);







        /*int countOfMatches = 0;
        int sumOfMatches = 0;
        for (int loopNumber = 1; loopNumber <= 1000; loopNumber++) {
            if ((loopNumber % 3 == 0) && (loopNumber % 5 == 0)) {
                countOfMatches++;
                sumOfMatches += loopNumber;

                System.out.println("found a match = " + loopNumber);
            }

            if (countOfMatches == 5) {
                break;
            }
        }
        System.out.println("sum = " + sumOfMatches);*/










       /* for (int i = 0; i < 10; i=i+2) {

            if(i >= 6 ) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("jk");*/

      /*  int primeNumberCounter = 0;
        for (int i = 418; i < 1000;i++){

            if(isPrime(i)) {
                System.out.println(i);
                primeNumberCounter = primeNumberCounter + 3;
                if(primeNumberCounter >= 8){

                    break;
                }
            }

        }

        /*System.out.println("856 is " + (isPrime(856) ? "" : "not") + " a prime number");
        System.out.println("419 is " + (isPrime(419) ? "" : "not") + " a prime number");
        System.out.println("457 is " + (isPrime(457) ? "" : "not") + " a prime number");
        System.out.println("398 is " + (isPrime(398) ? "" : "not") + " a prime number");
        System.out.println("492 is " + (isPrime(492) ? "" : "not") + " a prime number");
        System.out.println("567 is " + (isPrime(567) ? "" : "not") + " a prime number");
        System.out.println("699 is " + (isPrime(699) ? "" : "not") + " a prime number");
        System.out.println("1020 is " + (isPrime(1020) ? "" : "not") + " a prime number");
        System.out.println("6999 is " + (isPrime(6999) ? "" : "not") + " a prime number");
        System.out.println("7689 is " + (isPrime(7689) ? "" : "not") + " a prime number");
        System.out.println("6990 is " + (isPrime(6990) ? "" : "not") + " a prime number");*/



    /*public static boolean isPrime(int wholeNumber) {

        for (int divisor = 2; divisor < wholeNumber; divisor++){
            if (wholeNumber % divisor == 0){
                return  false;
            }
        }
        return true;*/


