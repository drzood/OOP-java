package notebook;

import notebook.presenter.Presenter;
import notebook.ui.Console;
import notebook.ui.View;

public class Main {
    public static void main(String[] args) {
        View view = new Console();
        new Presenter(view);
        view.start();
    }
}
