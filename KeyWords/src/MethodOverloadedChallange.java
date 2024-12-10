import java.util.Arrays;

public class MethodOverloadedChallange {

    public static double convrtToCentemetr(int inches){
           return  inches * 2.54;
    }

    public static double convrtToCentemetr(int feet, int inch){
         // return ((feet * 12) + inch) * 2.54;
         return convrtToCentemetr((feet * 12) + inch) ;
          
    }

    public static void main(String[] args) {
        System.out.println("5feet, 8inch = " + convrtToCentemetr(5, 8) + " cm");
        System.out.println("68inch = " + convrtToCentemetr(68) + "cm");
    }



}
