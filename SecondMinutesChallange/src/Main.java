import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for (int counter = 1; counter <= 5;counter++){
            System.out.println(counter);
        }
        for (double rate = 2.0; rate <= 5; rate++){
            double intrestAmount = calculateIntrest(10000, rate);
            System.out.println("10000 at " + rate + "% intrest = " + intrestAmount);
        }
        for (double i = 7.5; i <=10; i += 0.25) {
            double intrestAmount = calculateIntrest(850, i);
            if (intrestAmount < 7.5){
                break;
            }
            System.out.println("$850 at at " + i + "% intrest = $" + intrestAmount);
        }
    }

        public static double calculateIntrest(double amount, double intrestRate){
      return (amount * (intrestRate / 100));
        }
        }