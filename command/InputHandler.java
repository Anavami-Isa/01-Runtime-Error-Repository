package command;

public class InputHandler {
    private HashMap<String, command> commands;

    public inputHandler(Player player) {
        commands = new Hashmap<>();
        RunCommand run = new RunCommand(player);
        JumpCommand jump = new JumpCommand(player);
        FireCommand fire = new FireCommand(player);
        QuitCommand quit = new QuitCommand(player);
        this.commands.put("run", run);
        this.commands.put("jump", run);
        this.commands.put("fire", run);
        this.commands.put("quit", run);
    }

    public void buttonPressed(String button) {
        commands.get(button).execute();
    }
}
