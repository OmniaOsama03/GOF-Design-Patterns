package FacadeDesignPattern;

public class Tuner
{
    //Turning on tuner
    public void on()
    {
        System.out.println("Tuner on");
    }

    //Turning off tuner
    public void off()
    {
        System.out.println("Tuner off");
    }

    //Setting the frequency
    public void setFrequency(double frequency)
    {
        System.out.println("Tuner setting frequency to " + frequency);
    }

    @Override
    public String toString()
    {
        return "Top-O-Line Tuner";
    }
}

