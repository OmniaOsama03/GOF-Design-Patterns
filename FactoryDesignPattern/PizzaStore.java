package FactoryDesignPattern;
abstract class PizzaStore
{
        public Pizza orderPizza (String type)
        {
            Pizza pizza = createPizza(type); // Uses the factory method

            if(pizza != null)
            {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
            return pizza;
        }

        //Factory method to be implemented by subclasses
        protected abstract Pizza createPizza(String type);
}
