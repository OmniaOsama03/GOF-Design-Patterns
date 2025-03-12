package FactoryDesignPattern;

// Pepperoni Pizza for Dubai
class DubaiPepperoniPizza implements Pizza {
    public void prepare() {
        System.out.println("Preparing Dubai Pepperoni Pizza");
    }
    public void bake() {
        System.out.println("Baking Dubai Pepperoni Pizza");
    }
    public void cut() {
        System.out.println("Cutting Dubai Pepperoni Pizza");
    }
    public void box() {
        System.out.println("Boxing Dubai Pepperoni Pizza");
    }
}