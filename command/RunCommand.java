package command;

public class RunCommand implements Command {
    private Player player;
    /**
     * set the player
     * @param player
     */
    public RunCommand(Player player) {
    this.player = player;
    }
/**
 * calls the run method
 */
    public void execute() {
    player.runForward();
    }
}