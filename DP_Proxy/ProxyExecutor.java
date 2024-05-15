import java.util.ArrayList;
import java.util.List;

public class ProxyExecutor implements TerminalInterface{
    private Executor executor;
    private List<String>Commands;
    
    public ProxyExecutor() {
        executor = new Executor();
        Commands = new ArrayList<>();
        Commands.add("rm -rf");
    }

    @Override
    public void execute(String command, String user) {
        if(Commands.contains(command) && user != "admin") System.out.println("Unable to execute command: " + command);
        else Executor.run(command,user);
    }

}
