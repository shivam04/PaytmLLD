package commands;

import java.util.List;

/**
 * Created by shivam.si on 17/04/22 7:10 pm
 */

public class UpdateUserCommand implements ICommand{
    @Override
    public boolean canExecute(String command) {
        List<String> input = List.of(command.split(" "));
        return input.get(0).equals(CommandKeywords.UpdateUser);
    }

    @Override
    public void execute(String command) {
        System.out.println("In Update User Command");
    }
}
