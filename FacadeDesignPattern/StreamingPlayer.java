package FacadeDesignPattern;

public class StreamingPlayer
{
    //Turning on streaming player
    public void on()
    {
        System.out.println("Streaming Player on");
    }

    //Turning off streaming player
    public void off()
    {
        System.out.println("Streaming Player off");
    }

    //Playing movie
    public void play(String movie)
    {
        System.out.println("Streaming Player playing \"" + movie + "\"");
    }

    //Stopping streaming player
    public void stop()
    {
        System.out.println("Streaming Player stopped");
    }

    @Override
    public String toString() {
        return "Top-O-Line Streaming Player";
    }
}

