public class LivingThing {

    private boolean isSleeping;
    private boolean isEating = false;

    public LivingThing(boolean isSleeping) {
        this.isSleeping = isSleeping;
    }

    public boolean isSleeping() {
        return isSleeping;
    }
    public void setSleeping(boolean willSleep) {
       this.isSleeping = willSleep;
    }

}
