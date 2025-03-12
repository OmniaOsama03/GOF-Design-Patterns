package FacadeDesignPattern;

public class Screen
{
    //Moving screen up
    public void up()
    {
        System.out.println("Screen going up");
    }

    //Moving screen down
    public void down()
    {
        System.out.println("Screen going down");
    }

    @Override
    public String toString() {
        return "Theater Screen";
    }
}

