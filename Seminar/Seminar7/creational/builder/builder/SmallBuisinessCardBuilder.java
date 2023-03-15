package creational.builder.builder;

public class SmallBuisinessCardBuilder extends BuisinessCardBuilder {

    @Override
    public void createName() {
        getCard().setName("Маленькая визитка");
    }

    @Override
    public void createSize() {
        getCard().setSize(new int[]{9, 16});
    }

    @Override
    public void createPrice() {
        getCard().setPrice(100);
    }
    
}
