package notebook.ui.commands;

import notebook.ui.Console;

public class DelNote extends Commands {

    public DelNote(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Delete an entry";
    }

    @Override
    public void execute() {
        System.out.println("Ok!");        
    }
    
}
