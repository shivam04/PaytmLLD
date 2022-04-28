import commands.RegisterUserCommand;
import commands.UpdateUserCommand;
import commands.registry.CommandRegistry;
import commands.registry.exception.InvalidCommandException;

/**
 * Created by shivam.si on 17/04/22 7:06 pm
 */

public class Main {
    public static void main(String[] args) {
        CommandRegistry commandRegistry = new CommandRegistry();
        commandRegistry.registerCommand(new RegisterUserCommand());
        commandRegistry.registerCommand(new UpdateUserCommand());
        //while (true) {
            String input = "RegisterUser [phone_number] [password]";
            try {
                commandRegistry.executeCommand(input);
            } catch (InvalidCommandException e) {
                System.out.println("The command you enter is invalid");
            }
        //}
    }
}
