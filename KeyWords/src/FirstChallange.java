import java.util.Arrays;

public class FirstChallange {
    public static void main(String[] args) {

        boolean theGameOver = true;
        int newScore = 10000;
        int levelFinish = 8;
        int extraBonus = 200;

        int highScore = calculatScore(theGameOver, newScore, levelFinish, extraBonus);
        System.out.println("the highscore is " + highScore);
          calculatScore(true, 10000, 8, 200);

        System.out.println("the new high score" +
                calculatScore(true, 10000, 8, 200));

        calculatScore(true, 10000, 8, 200);

    }

    public static int calculatScore(boolean theGameOver, int newScore, int levelFinish, int extraBonus ){


        int newFinalScore = newScore;
        if ( theGameOver) {
            newFinalScore += (levelFinish * extraBonus);
            newFinalScore += 1000;
            System.out.println("your final score" +   newFinalScore);
        }

        return newFinalScore;
    }
}
