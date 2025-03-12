package FacadeDesignPattern;

public class HomeTheaterFacade
{
    private Amplifier amp;
    private Tuner tuner;
    private StreamingPlayer player;
    private Projector projector;
    private TheaterLights lights;
    private Screen screen;
    private PopcornPopper popper;


    //Initializing all components of the home theater system
    public HomeTheaterFacade(Amplifier amp, Tuner tuner, StreamingPlayer player,
                             Projector projector, TheaterLights lights,
                             Screen screen, PopcornPopper popper)
    {
        this.amp = amp;
        this.tuner = tuner;
        this.player = player;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    //Method to watch a movie
    public void watchMovie(String movie)
    {
        System.out.println("Get ready to watch a movie...");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setStreamingPlayer(player);
        amp.setSurroundSound();
        amp.setVolume(5);
        player.on();
        player.play(movie);
    }

    //Shutting down the home theater after watching a movie
    public void endMovie()
    {
        System.out.println("Shutting movie theater down...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        player.stop();
        player.off();
    }

    //Tuning in to the radio at a specified frequency
    public void listenToRadio(double frequency)
    {
        System.out.println("Tuning in to the radio...");
        tuner.on();
        tuner.setFrequency(frequency);
        amp.on();
        amp.setTuner(tuner);
        amp.setVolume(5);
    }

    //Shutting down the radio system
    public void endRadio()
    {
        System.out.println("Shutting down the radio...");
        tuner.off();
        amp.off();
    }
}

