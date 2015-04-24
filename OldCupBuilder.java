public class OldVirtualCoffeeCup implements VirtualCoffeeCupBuilder {

    private VirtualCoffeeCup cup;

    public OldVirtualCoffeeCup() {
        this.cup = new VirtualCoffeeCup();
    }

    public void buildCupRoast() {
        cup.setCupRoast("Tin Head");
    }

    public VirtualCoffeeCup getVirtualCoffeeCup() {
        return this.cup;
    }
}
