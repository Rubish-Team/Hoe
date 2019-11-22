package console;

import java.util.Scanner;

public class Console implements ConsoleInterface {
    private Scanner scanner = null;

    Console() {
        scanner = new Scanner(System.in);
    }

    @Override
    public void out(String text) {
        System.out.println(text);
    }
    @Override
    public String in(){
        if(scanner.hasNext())
            return scanner.nextLine();
        return "";
    }
}
