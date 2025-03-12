package FactoryDesignPattern;

class AbuDhabiPepperoniPizza implements Pizza
{
    public void prepare() {
        System.out.println("Preparing Abu Dhabi Pepperoni Pizza");
    }
    public void bake() {
        System.out.println("Baking Abu Dhabi Pepperoni Pizza");
    }
    public void cut() {
        System.out.println("Cutting Abu Dhabi Pepperoni Pizza");
    }
    public void box() {
        System.out.println("Boxing Abu Dhabi Pepperoni Pizza");
    }
}