package accounttracker.cli;

import accounttracker.inmemory.InMemoryDebitStore;
import accounttracker.usecases.boundaries.DebitStore;

public class CLI {
    private static DebitStore store = new InMemoryDebitStore();
    private static Request request = new Request();
    private static Receiver receiver = new Receiver();
    private static IterativeReceiver iterativeReceiver = new IterativeReceiver();

    public static void main(String[] args) {
        new CommandScanner().run();
    }

    static DebitStore store() {
        return store;
    }

    static Receiver receiver() {
        return receiver;
    }

    static IterativeReceiver iterativeReceiver() {
        return iterativeReceiver;
    }

    static Request request() {
        return request;
    }
}
