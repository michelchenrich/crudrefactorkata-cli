package accounttracker.cli;

import accounttracker.usecases.boundaries.DebitRequest;
import accounttracker.usecases.boundaries.IdBasedRequest;
import accounttracker.usecases.boundaries.UpdateDebitRequest;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Request implements IdBasedRequest, DebitRequest, UpdateDebitRequest {
    private Scanner scanner;

    public Request() {
        scanner = new Scanner(in);
    }

    public String id() {
        out.println("Enter the debit's id");
        return scanner.next();
    }

    public double value() {
        out.println("Enter the debit's value");
        double value = scanner.nextDouble();
        scanner.nextLine();
        return value;
    }

    public String description() {
        out.println("Enter the debit's description");
        return scanner.nextLine();
    }
}
