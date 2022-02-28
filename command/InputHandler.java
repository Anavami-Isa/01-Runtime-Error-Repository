package command;

import java.util.HashMap;

public class InputHandler {
    private HashMap<String, Command> commands;
    /**
     * sets up the hashmap for the comanda
     * @param player pass in a player
     */
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
    /**
     * pick which comand to use
     * @param button
     */
    public void buttonPressed(String button) {
    commands.get(button).execute();
    }
}
