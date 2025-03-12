package AdaptorDesignPattern;

//The DuckAdapter class makes a Duck behave like a Turkey by implementing the Turkey interface.
public class DuckAdapter implements Turkey {
    Duck duck;

    //Constructor takes a Duck object and adapts it to act like a Turkey
    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    //Makes the Duck gobble by calling its quack method
    public void gobble() {
        duck.quack();
    }

    //Makes the Duck fly by calling its fly method
    public void fly() {
        duck.fly();
    }
}
