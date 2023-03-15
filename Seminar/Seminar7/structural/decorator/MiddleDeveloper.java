package structural.decorator;

public class MiddleDeveloper extends DeveloperDecorator {

    public MiddleDeveloper(Developer developer) {
        super(developer);
    }

    @Override
    public String makeJob() {
        return super.makeJob() + " " + codeReview();
    }

    public String codeReview() {
        return "Делаю кодревью.";
    }
}
