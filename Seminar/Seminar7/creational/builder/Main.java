package creational.builder;

import creational.builder.builder.BuisinessCardBuilder;
import creational.builder.builder.LargeBuisinessCard;

public class Main {
    public static void main(String[] args) {
        BuisinessCardBuilder builder = new LargeBuisinessCard();

        BuisinessCard card = builder.build();
        System.out.println(card);
    }
}
