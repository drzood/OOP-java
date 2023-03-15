package notebook.ui;

import notebook.presenter.Presenter;

public interface View {
    void setPresenter(Presenter presenter);
    void start();
    void print(String text);
}
