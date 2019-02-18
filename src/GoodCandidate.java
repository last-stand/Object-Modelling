public class GoodCandidate extends Candidate {


    public GoodCandidate(String name, String petName, boolean isSleeping) {
        super(name, new Dog(petName, isSleeping), isSleeping);
    }

    @Override
    public String askQuestion() {
        return "good answer";
    }
}
