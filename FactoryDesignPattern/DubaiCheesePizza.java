package FactoryDesignPattern;

// Cheese Pizza for Dubai
class DubaiCheesePizza implements Pizza {
    public void prepare() {
        System.out.println("Preparing Dubai Cheese Pizza");
    }
    public void bake() {
        System.out.println("Baking Dubai Cheese Pizza");
    }
    public void cut() {
        System.out.println("Cutting Dubai Cheese Pizza");
    }
    public void box() {
        System.out.println("Boxing Dubai Cheese Pizza");
    }
}