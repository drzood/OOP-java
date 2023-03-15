package structural.decorator;

public class Main {
    public static void main(String[] args) {

        Developer developer = new JuniorDeveloper();
        Developer developer1 = new MiddleDeveloper(developer);
        Developer developer2 = new MiddleDeveloper(developer1);
        System.out.println(developer2.makeJob());
    }
}
