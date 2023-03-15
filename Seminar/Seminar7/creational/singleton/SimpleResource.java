package creational.singleton;


public class SimpleResource {
    static SimpleResource simpleResource;

    public static SimpleResource getSimpleResource() {
        if (simpleResource == null) {
            simpleResource = new SimpleResource();
        }
        return simpleResource;
    }
    
}
