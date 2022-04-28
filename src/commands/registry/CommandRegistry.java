package commands.registry;

import commands.ICommand;
import commands.registry.exception.InvalidCommandException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shivam.si on 17/04/22 7:17 pm
 */

public class CommandRegistry {

    private final List<ICommand> commands = new ArrayList<>();

    public void registerCommand(ICommand command) {
        commands.add(command);
    }

    public void executeCommand(String command) {
        for(ICommand c: commands) {
            if(c.canExecute(command)) {
                c.execute(command);
                return;
            }
        }
        throw new InvalidCommandException();
    }
}
