package FacadeDesignPattern;
public class PopcornPopper
{
    //To turn on popcorn popper
    public void on()
    {
        System.out.println("Popcorn Popper on");
    }

    //To turn off popcorn popper
    public void off()
    {
        System.out.println("Popcorn Popper off");
    }

    //To pop the popcorn
    public void pop()
    {
        System.out.println("Popcorn Popper popping popcorn!");
    }

    @Override
    public String toString()
    {
        return "Popcorn Popper";
    }
}

