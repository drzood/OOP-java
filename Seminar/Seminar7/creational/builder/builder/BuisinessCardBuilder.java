package creational.builder.builder;

import creational.builder.BuisinessCard;

public abstract class BuisinessCardBuilder {
    private BuisinessCard card;

    private void createCard() {
        card = new BuisinessCard();
    }

    abstract void createName();
    abstract void createSize();
    abstract void createPrice();

    public BuisinessCard build() {
        createCard();
        createName();
        createSize();
        createPrice();
        return card;
    }

    BuisinessCard getCard() {
        return card;
    }
    
}
