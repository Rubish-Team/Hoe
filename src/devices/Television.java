package devices;

public class Television extends BaseDevice {
    private TvProgram choose = null;
    private Sound sound = null;
    public void setProgram (TvProgram choose){
        this.choose = choose;
        System.out.println("You choose this chanel");
        }
    public void setSound(Sound choose){
        this.sound = choose;
        System.out.println("You choose this sound");

    }
}
