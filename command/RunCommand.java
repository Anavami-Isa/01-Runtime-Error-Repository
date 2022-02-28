package command;

public class RunCommand implements Command {
    private Player player;

    public RunCommand(Player player) {
    this.player = player;
    }

    public void execute() {
    player.runForward();
    }
}