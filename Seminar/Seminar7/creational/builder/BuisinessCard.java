package creational.builder;

import java.util.Arrays;

public class BuisinessCard {
    private int price;
    private int[] size;
    private String name;
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int[] getSize() {
        return size;
    }
    public void setSize(int[] size) {
        this.size = size;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "BuisinessCard [price=" + price + ", size=" + Arrays.toString(size) + ", name=" + name + "]";
    }
    
    
}
