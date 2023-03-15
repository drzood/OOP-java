package structural.decorator;

public class Senior extends DeveloperDecorator {

    public Senior(Developer developer) {
        super(developer);
    }
    
    @Override
    public String makeJob() {
        return super.makeJob() + " " + sendReport();
    }

    String sendReport() {
        return "Составляю отчет.";
    }
}
