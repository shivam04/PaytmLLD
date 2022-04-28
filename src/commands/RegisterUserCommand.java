package commands;

import controller.UserController;

import java.util.List;

/**
 * Created by shivam.si on 17/04/22 7:08 pm
 */

public class RegisterUserCommand implements ICommand{
    private UserController userController = new UserController();
    @Override
    public boolean canExecute(String command) {
        List<String> input = List.of(command.split(" "));
        return input.get(0).equals(CommandKeywords.RegisterUser);
    }

    @Override
    public void execute(String command) {
        userController.registerUser(null, null);
        System.out.println("In Register User Command");
    }
}
