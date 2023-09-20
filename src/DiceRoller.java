import java.util.Random;

public class DiceRoller {
    private static final Random random = new Random();

    public static int rollDice20() {
        return random.nextInt(20) + 1; // Genera un número aleatorio entre 1 y 6 (inclusivo).
    }
    public static int rollDice100() {
        return random.nextInt(100) + 1; // Genera un número aleatorio entre 1 y 6 (inclusivo).
    }
}

