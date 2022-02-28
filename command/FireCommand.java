package command;

public class FireCommand implements Command {
    private Player player;

    public FireCommand(Player player) {
    this.player = player;
    }

    public void execute() {
    player.fire();
    }
}
