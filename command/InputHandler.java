package command;

import java.util.HashMap;

public class InputHandler {
    private HashMap<String, Command> commands;

    public InputHandler(Player player) {
       commands = new HashMap<>();
        RunCommand run = new RunCommand(player);
        JumpCommand jump = new JumpCommand(player);
        FireCommand fireCommand = new FireCommand(player);
        QuitCommand quit = new QuitCommand(player);
        this.commands.put("run", run);
        this.commands.put("jump", jump);
        this.commands.put("fire", fireCommand);
        this.commands.put("quit", quit);
    }

    public void buttonPressed(String button) {
    commands.get(button).execute();
    }
}
