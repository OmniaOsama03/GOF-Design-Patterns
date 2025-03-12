package FacadeDesignPattern;

public class TheaterLights
{
    //Turning on theater light
    public void on()
    {
        System.out.println("Theater Ceiling Lights on");
    }

    //Dimming theater lights
    public void dim(int level)
    {
        System.out.println("Theater Ceiling Lights dimming to " + level + "%");
    }

    @Override
    public String toString()
    {
        return "Theater Ceiling Lights";
    }
}

