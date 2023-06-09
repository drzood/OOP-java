package notebook.ui;

import java.util.ArrayList;
import java.util.List;

import notebook.ui.commands.AddNote;
import notebook.ui.commands.DelNote;
import notebook.ui.commands.Exit;

public class Menu {
    private List<Option> commands;
    private Console console;
 
    public Menu(Console console) {
        this.console = console;
        commands = new ArrayList<>();
        commands.add(new AddNote(console));
        commands.add(new DelNote(console));
        commands.add(new Exit(console));
    }

    void execute(int num) {
        Option option = commands.get(num - 1);
        option.execute();
    }

    public String printMenu() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < commands.size(); i++) {
            stringBuilder.append(i + 1);
            stringBuilder.append(": ");
            stringBuilder.append(commands.get(i).description());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
