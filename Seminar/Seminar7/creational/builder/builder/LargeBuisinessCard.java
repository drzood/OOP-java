package creational.builder.builder;

public class LargeBuisinessCard extends BuisinessCardBuilder {
    @Override
    public void createName() {
        getCard().setName("Большая визитка");
    }

    @Override
    public void createSize() {
        getCard().setSize(new int[]{20, 25});
    }

    @Override
    public void createPrice() {
        getCard().setPrice(150);
    }
}
