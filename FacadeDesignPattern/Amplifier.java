package FacadeDesignPattern;

public class Amplifier
{
    private Tuner tuner;
    private StreamingPlayer player;

    //Turning on the amplifier
    public void on() {
        System.out.println("Amplifier on.");
    }

    //Turning off the amplifier
    public void off() {
        System.out.println("Amplifier off.");
    }

    //Setting the streaming player for the amplifier
    public void setStreamingPlayer(StreamingPlayer player) {
        this.player = player;
        System.out.println("Amplifier setting Streaming Player to " + player);
    }

    //Setting surround sound mode on the amplifier
    public void setSurroundSound() {
        System.out.println("Amplifier surround sound on");
    }

    //Setting the tuner for the amplifier
    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
        System.out.println("Amplifier setting tuner to " + tuner);
    }

    //Setting the volume level on the amplifier
    public void setVolume(int level) {
        System.out.println("Amplifier setting volume to " + level);
    }

    @Override
    public String toString() {
        return "Top-O-Line Amplifier";
    }
}

