package notebook.ui.commands;

import notebook.ui.Console;

public class Exit extends Commands {

    public Exit(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Exit";
    }

    @Override
    public void execute() {
        getConsole().finish();        
   }    
}
