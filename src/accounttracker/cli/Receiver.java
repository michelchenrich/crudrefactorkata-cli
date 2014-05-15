package accounttracker.cli;

import accounttracker.usecases.boundaries.CreateDebitReceiver;
import accounttracker.usecases.boundaries.DebitMessageReceiver;
import accounttracker.usecases.boundaries.DebitReceiver;

import static java.lang.System.out;

public class Receiver implements DebitReceiver, DebitMessageReceiver, CreateDebitReceiver {
    public void valueIs(double value) {
        out.print(String.format("\tvalue:\t%.2f,", value));
    }

    public void descriptionIs(String description) {
        out.print(String.format("\tdescription:\t%s\n", description));
    }

    public void valueMustBeGreaterThanZero() {
        out.println("Debit value must be greater than zero");
    }

    public void descriptionMustNotBeEmpty() {
        out.println("Debit description must not be empty");
    }

    public void createdWithId(String id) {
        out.println(String.format("New debit successfully created with id %s", id));
    }
}
