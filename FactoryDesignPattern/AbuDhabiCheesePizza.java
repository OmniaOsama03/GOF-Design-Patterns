package FactoryDesignPattern;

// Cheese Pizza for Abu Dhabi
class AbuDhabiCheesePizza implements Pizza {
    public void prepare() {
        System.out.println("Preparing Abu Dhabi Cheese Pizza");
    }
    public void bake() {
        System.out.println("Baking Abu Dhabi Cheese Pizza");
    }
    public void cut() {
        System.out.println("Cutting Abu Dhabi Cheese Pizza");
    }
    public void box() {
        System.out.println("Boxing Abu Dhabi Cheese Pizza");
    }
}