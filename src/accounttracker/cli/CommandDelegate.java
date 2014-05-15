package accounttracker.cli;

import accounttracker.usecases.*;

import static accounttracker.cli.CLI.*;

public enum CommandDelegate {
    CREATE(new CreateDebitCommand(request(), receiver(), store())),
    READ(new ReadDebitCommand(request(), receiver(), store())),
    READ_ALL(new ReadDebitsCommand(iterativeReceiver(), store())),
    UPDATE(new UpdateDebitCommand(request(), receiver(), store())),
    DELETE(new DeleteDebitCommand(request(), store()));
    private Command command;

    private CommandDelegate(Command command) {
        this.command = command;
    }

    public void execute() {
        command.execute();
    }
}
