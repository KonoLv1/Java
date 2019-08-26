package app;
import java.io.Console;

public class App {
    public static void main(String[] args) throws Exception {
        Console console = System.console();
        int x = Integer.parseInt(console.readLine());
        System.out.println(x);
    }
}