package devices;

public class CoffeeMachine extends BaseDevice {
    private SortsOfCoffee load = null;
    private StrengthOfCoffee strength = null;

    public void setLoad(SortsOfCoffee load){
        this.load = load;
        System.out.println("Coffee loaded");
    }

    public void setLoad(StrengthOfCoffee load){
        this.strength = load;
        System.out.println("strength Coffee loaded");
    }
}
