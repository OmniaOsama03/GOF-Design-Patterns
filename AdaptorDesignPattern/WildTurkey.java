package AdaptorDesignPattern;

//The WildTurkey class implements the Turkey interface and provides specific behaviors for gobble and flying.
public class WildTurkey implements Turkey {
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
