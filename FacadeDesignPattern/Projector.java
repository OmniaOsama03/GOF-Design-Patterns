package FacadeDesignPattern;
public class Projector
{
    //Turning on projector
    public void on()
    {
        System.out.println("Projector on");
    }

    //Turning off projector
    public void off()
    {
        System.out.println("Projector off");
    }

    //Opening widescreen mode
    public void wideScreenMode()
    {
        System.out.println("Projector in widescreen mode (16x9 aspect ratio)");
    }

    @Override
    public String toString()
    {
        return "Top-O-Line Projector";
    }
}

