package AdaptorDesignPattern;

//The TurkeyAdapter class makes a Turkey behave like a Duck by implementing the Duck interface.
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    //Constructor takes a Turkey object and adapts it to act like a Duck.
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    //Makes the Turkey "quack" by calling its gobble method
    public void quack() {
        turkey.gobble();
    }

    //Makes the Turkey fly by calling its fly method multiple times (to simulate)
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
