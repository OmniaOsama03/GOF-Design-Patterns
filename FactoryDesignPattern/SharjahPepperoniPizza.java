package FactoryDesignPattern;


// Pepperoni Pizza for Sharjah
class SharjahPepperoniPizza implements Pizza {
    public void prepare() {
        System.out.println("Preparing Sharjah Pepperoni Pizza");
    }
    public void bake() {
        System.out.println("Baking Sharjah Pepperoni Pizza");
    }
    public void cut() {
        System.out.println("Cutting Sharjah Pepperoni Pizza");
    }
    public void box() {
        System.out.println("Boxing Sharjah Pepperoni Pizza");
    }
}