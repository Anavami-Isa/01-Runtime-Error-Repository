package command;

public class QuitCommand implements Command {
    private Player player;

    /**
     * this is the setter for the player method
     * @param player
     */
    public QuitCommand(Player player) {
        this.player = player;
    }
    /**
     * This method infomrs that the game is over and ends the program
     */
    public void execute() {
        System.out.println("Gamne Over");
        System.exit(0);
    }
}
