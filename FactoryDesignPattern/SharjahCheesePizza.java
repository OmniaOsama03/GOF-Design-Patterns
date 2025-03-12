package FactoryDesignPattern;

// Cheese Pizza for Sharjah
class SharjahCheesePizza implements Pizza {
    public void prepare() {
        System.out.println("Preparing Sharjah Cheese Pizza");
    }
    public void bake() {
        System.out.println("Baking Sharjah Cheese Pizza");
    }
    public void cut() {
        System.out.println("Cutting Sharjah Cheese Pizza");
    }
    public void box() {
        System.out.println("Boxing Sharjah Cheese Pizza");
    }
}