package command;

public class JumpCommand implements Command {
    private Player player;
    /**
     * sets the player
     * @param player
     */
    public JumpCommand(Player player) {
    this.player = player;
    }
    /**
     * calls the jump method
     */
    public void execute() {
        player.jump();
    }
}
