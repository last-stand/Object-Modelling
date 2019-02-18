public class BadCandidate extends Candidate {

    private boolean canDoParty = false;

    public BadCandidate(String name, String petName, boolean isSleeping) {
        super(name, new Dragon(petName, isSleeping), isSleeping);
    }

    @Override
    public String askQuestion() {
        return "bad answer";
    }

    public void setCanDoParty(boolean canDoParty) {
        this.canDoParty = true;
    }

    public boolean canDoParty() {
        return this.canDoParty;
    }
}
