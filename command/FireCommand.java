package command;

public class FireCommand implements Command {
    private Player player;
/**
 * set the player for the this comand
 * @param player
 */
    public FireCommand(Player player) {
    this.player = player;
    }
/**
 * calls the players fire method
 */
    public void execute() {
    player.fire();
    }
}
