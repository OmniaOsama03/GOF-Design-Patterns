package AdaptorDesignPattern;

//The MallardDuck class implements the Duck interface and provides specific behaviors for quacking and flying.
public class MallardDuck implements Duck {
    public void quack() {
        System.out.println("Quack");
    }

    public void fly() {
        System.out.println("I'm flying");
    }
}
