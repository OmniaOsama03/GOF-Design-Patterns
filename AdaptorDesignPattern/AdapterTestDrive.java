package AdaptorDesignPattern;

// Main class to test the adapter functionality
public class AdapterTestDrive {
    public static void main(String[] args) {

        //We create a MallardDuck instance
        Duck duck = new MallardDuck();
        //We create a WildTurkey instance
        Turkey turkey = new WildTurkey();

        //We create a TurkeyAdapter, passing in a Turkey to make it behave like a Duck
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        //We create a DuckAdapter, passing in a Duck to make it behave like a Turkey
        Turkey duckAdapter = new DuckAdapter(duck);

        //Display the behavior of the original Turkey
        System.out.println("The Turkey says...");
        testTurkey(turkey);  //Use testTurkey to display Turkey's behavior

        System.out.println("\nThe Duck says...");
        testDuck(duck); //Use testDuck to display Duck's behavior

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter); //Use testDuck with the adapted Turkey to display Duck-like behavior

        System.out.println("\nThe DuckAdapter says...");
        testTurkey(duckAdapter); //Use testTurkey with the adapted Duck to display Turkey-like behavior
    }

    //We created the following methods to test the behavior of Duck and Turkey objects.
    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

    static void testTurkey(Turkey turkey) {
        turkey.gobble();
        turkey.fly();
    }
}
