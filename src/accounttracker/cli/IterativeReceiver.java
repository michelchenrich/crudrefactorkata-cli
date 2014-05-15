package accounttracker.cli;

import accounttracker.usecases.boundaries.IterativeDebitReceiver;

import static java.lang.System.out;

public class IterativeReceiver extends Receiver implements IterativeDebitReceiver {
    public void debitStart(String id) {
        out.print(String.format("\tid: %s,", id));
    }

    public void endDebit() {
    }
}
