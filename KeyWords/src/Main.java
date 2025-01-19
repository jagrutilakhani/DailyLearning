//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int totalScore = calculateScore("Dhoni", 100);
        System.out.println("Total score: " + totalScore);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("player " + playerName + "scored " + score + "points");
        return score * 1000;
    }


    }

