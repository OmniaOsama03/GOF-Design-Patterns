package FactoryDesignPattern;
class DubaiPizzaStore extends PizzaStore
{

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new DubaiCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new DubaiPepperoniPizza();
        }

        return null;
    }
}