public class First {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int level = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println("your score was lessthan 5000 bt greaterbthan 10000");
        } else if (score < 1000) {
            System.out.println("your score was less than 1000");

        } else {
            System.out.println("got here");
        }

     }
}
