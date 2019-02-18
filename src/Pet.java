public class Pet extends LivingThing{

    private String name;

    public Pet(String name, boolean isSleeping) {
        super(isSleeping);
        this.name = name;
    }

}
