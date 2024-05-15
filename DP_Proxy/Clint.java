public class Clint {
    public static void main(String[] args) {

        ProxyExecutor proxyExecutor = new ProxyExecutor();
        proxyExecutor.execute("mkdir design pattern", "user");
        proxyExecutor.execute("rm -rf", "user");
        proxyExecutor.execute("rm -rf", "admin");
        
    }
}
