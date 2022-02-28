package command;

import java.util.concurrent.TimeUnit;
import java.util.*;

/**
 * This class executes the fire command
 * @author Anavami Isaa
 */
public class FireCommand {
    private Player player;

    /**
     * This method instantiates the player
     * @param player the player that the fire command will be executed on
     */
    public FireCommand(Player player) {
        this.player = player;
    }

    /**
     * This method executes the fire command
     */
    public void execute() {
        File file = new File("fire.txt");
        Scanner read = new Scanner(file);
        while (read.hasNextLine()) {
            for (int i = 0; i < 3; i++) {
                String data = read.nextLine();
                System.out.println(data);
            }
            sleep(1);
            clear();
        }
    }

    /**
     * This method pauses the actions for a brief peroid of time
     * @param num the amount of time to pause
     */
    private void sleep(int num) {
        try {
            TimeUnit.MILLISECONDS.sleep(num);
        } catch (Exception e) {
            System.out.println("Timmer error");
        }
    }
    
    /**
     * This method clears the print line
     */
    private void clear() {
        System.out.print("\033[H\033[2J");
    }
}
