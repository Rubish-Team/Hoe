package devices;

public class BaseDevice implements Device {
    private boolean state = false;
    private Colours colours = null;

    @Override
    public void on() {
        state = true;
        System.out.println("ON");
    }
        @Override
        public void off(){
        System.out.println("OFF");
        state = false;
    }



}
