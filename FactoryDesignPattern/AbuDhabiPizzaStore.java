package FactoryDesignPattern;

class AbuDhabiPizzaStore extends PizzaStore
{

    @Override
    protected Pizza createPizza(String type)
    {
        if (type.equals("cheese")) {
            return new AbuDhabiCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new AbuDhabiPepperoniPizza();
        }

        //If the type isn't valid
        return null;
    }
}
