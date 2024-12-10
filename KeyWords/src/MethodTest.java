public class MethodTest{
    static void displayHighScorePositio(String playerName, int playerposition) {
        System.out.println(playerName + " managed to get in to position " + playerposition + " on the high score list");
    }

    static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }

    public static void main(String[] arge) {
        int playerPosition = calculateHighScorePosition(1500);
        displayHighScorePositio("hiva", playerPosition);

        playerPosition = calculateHighScorePosition(500);
        displayHighScorePositio("dalia", playerPosition);

        playerPosition = calculateHighScorePosition(300);
        displayHighScorePositio("leon", playerPosition);

        playerPosition = calculateHighScorePosition(50);
        displayHighScorePositio("hanyya", playerPosition);



    }
}