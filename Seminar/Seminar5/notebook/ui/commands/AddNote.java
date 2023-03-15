package notebook.ui.commands;

import notebook.ui.Console;

public class AddNote extends Commands {

    public AddNote(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Add a new entry";
    }

    @Override
    public void execute() {
        getConsole().addNote();
    }
}
