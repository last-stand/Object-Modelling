public class Candidate extends LivingThing{

    private String name;
    private Pet pet;

    public Candidate(String name, Pet pet, boolean isSleeping) {
        super(isSleeping);
        this.name = name;
        this.pet = pet;
    }

    public String askQuestion() {
        String answer = "answer";
        return answer;
    }

    public Pet getPet() {
        return pet;
    }

    public void setSleeping(boolean willSleep) {
        super.setSleeping(willSleep);
        pet.setSleeping(willSleep);
    }
}
