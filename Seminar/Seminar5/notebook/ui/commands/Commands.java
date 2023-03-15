package notebook.ui.commands;

import notebook.ui.Console;

import notebook.ui.Option;

public abstract class Commands implements Option {
    
    private Console console;

    public Console getConsole() {
        return console;
    }

    public Commands(notebook.ui.Console console2) {
        this.console = console2;
    }
}
