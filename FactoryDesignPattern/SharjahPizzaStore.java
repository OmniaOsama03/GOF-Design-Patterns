package FactoryDesignPattern;


class SharjahPizzaStore extends PizzaStore
{

    @Override
    protected Pizza createPizza(String type)
    {
        if (type.equals("cheese")) {
            return new SharjahCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new SharjahPepperoniPizza();
        }

        return null;
    }
}
