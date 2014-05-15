package accounttracker.cli;

import accounttracker.usecases.boundaries.DebitNotFoundException;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class CommandScanner {
    private Scanner scanner;
    private boolean exit = false;

    public CommandScanner() {
        scanner = new Scanner(in);
    }

    public void run() {
        while (!exit) runSigle();
    }

    private void runSigle() {
        out.println("Choose a command: create, read, read_all, update, delete, exit");
        String command = scanner.next();
        if (command.equals("exit")) exit = true;
        else executeCommand(command);
    }

    private void executeCommand(String command) {
        try {
            CommandDelegate.valueOf(command.toUpperCase()).execute();
        } catch (IllegalArgumentException ignored) {
            out.println("Unknown command");
        } catch (DebitNotFoundException exception) {
            out.println(String.format("No debit found for id %s", exception.debitId()));
        }
    }
}
