package notebook.ui;

import java.util.Scanner;

import notebook.presenter.Presenter;

    // Menu
    // validator 
    // print - вывод инфы
    // Scanner - чтение инфы
    // switch - выбор действия
    
public class Console implements View {

    private Scanner scanner;
    private Presenter presenter;
    private Menu menu;
    private boolean work;

    @Override
    public void start() {
       scanner = new Scanner(System.in);
       menu = new Menu(this);
       work = true;
       while (work) {
            hello();
            String command = scanner.nextLine();
            if (checkInput(command)) {
                menu.execute(Integer.parseInt(command));
            }
            else System.out.println("Oops...");
            }
    }

    private boolean checkInput(String text) {
        if (text.matches("[0-9]+")) {
            return true;
        } 
        else {
            return false;
        }
    }

    public void finish() {
        work = false;
    }

    public void addNote() {
        System.out.println("Enter the text");
        presenter.addNote(scanner.nextLine());
    }

    private void hello() {
        System.out.println(menu.printMenu());
    }

    public void print(String text) {
        System.out.println(text);
    }
    
    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }
    
}
