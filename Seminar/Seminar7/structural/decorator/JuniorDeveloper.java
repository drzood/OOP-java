package structural.decorator;

public class JuniorDeveloper implements Developer {

    @Override
    public String makeJob() {
        return printCode();
    }
    
    public String printCode() {
        return "Пишу код.";
    }
}
