package notebook.presenter;

import notebook.ui.View;

public class Presenter {

    private View view;

    public Presenter(View view) {
        this.view = view;
        view.setPresenter(this);
    }

    public void addNote(String nextLine) {
        System.out.println("Ok!");
    }

}