public class Executor implements TerminalInterface{
    @Override
    public void execute(String command, String user) {
        System.out.println(command + " is executing as " + user + " successfully!");
    }

}
