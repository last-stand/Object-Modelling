public class Dragon extends Pet {

    private boolean canDoParty = false;

    public Dragon(String name, boolean isSleeping) {
        super(name, isSleeping);
    }

    public void setCanDoParty(boolean canDoParty) {
        this.canDoParty = true;
    }

    public boolean canDoParty() {
        return this.canDoParty;
    }
}
