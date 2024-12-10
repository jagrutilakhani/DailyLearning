import java.util.Arrays;

public class SwitchStatement {
    public static void main(String[] args) {

     String matchingWord = getWord("C A B");

        System.out.println("C = " + getWord("C") );
        System.out.println("A = " + getWord("A")  );
        System.out.println("B = " + getWord("B") );
    }

    public static String getWord(String charector) {
        switch (charector) {
            case "A" :
                return "Able";

            case "B":
                return "baker";

            case "C":
                return "charector";

            case "D":
                return "dog";

            case "E":
                return "easy";
            default:
                return "The word is not found";
        }
       }
    }