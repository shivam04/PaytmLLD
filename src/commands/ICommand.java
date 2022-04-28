package commands;

/**
 * Created by shivam.si on 17/04/22 7:06 pm
 */

public interface ICommand {
    /**
     * @param command
     * @return True if the command received in
     * input can be executed by this class.
     */
    boolean canExecute(String command);

    void execute(String command);
}
