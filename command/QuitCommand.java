package command;

public class QuitCommand implements Command {
    private Player player;

    public QuitCommand(Player player) {
        this.player = player;
    }

    public void execute() {
       System.out.println("Gamne Over");
        System.exit(0);
    }
}
