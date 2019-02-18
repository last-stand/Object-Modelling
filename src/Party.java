public class Party {
    private BadCandidate badCandidate;
    private Dragon dragon;

    public Party(BadCandidate badCandidate) {
        this.badCandidate = badCandidate;
        this.badCandidate.setCanDoParty(true);
    }

    public Party(Dragon dragon) {
        this.dragon = dragon;
        this.dragon.setCanDoParty(true);
    }

    public Party(BadCandidate badCandidate, Dragon dragon) {
        this.badCandidate = badCandidate;
        this.dragon = dragon;
        this.badCandidate.setCanDoParty(true);
        this.dragon.setCanDoParty(true);
    }
}
