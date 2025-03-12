package FactoryDesignPattern;

// Pizza interface, representing the product in the Factory Method pattern
interface Pizza {
    void prepare();
    void bake();
    void cut();
    void box();
}
