public class Main {

    public static void main(String[] args) {
        GoodCandidate goodCandidate = new GoodCandidate("goodCandidate", "doggy", true);
        BadCandidate badCandidate = new BadCandidate("badCandidate", "dragon", false);
        Party party1 = new Party(badCandidate);
        Party party2 = new Party((Dragon) badCandidate.getPet());

        System.out.println("good candidate answered:  " + goodCandidate.askQuestion());
        System.out.println("is good candidate sleeping:  " + goodCandidate.isSleeping());
        System.out.println("is good candidate's pet sleeping:  " + goodCandidate.getPet().isSleeping());
        goodCandidate.setSleeping(false);
        System.out.println("is good candidate sleeping:  " + goodCandidate.isSleeping());
        System.out.println("is good candidate's pet sleeping:  " + goodCandidate.getPet().isSleeping());
        System.out.println("");
        System.out.println("bad candidate answered:  " + badCandidate.askQuestion());
        System.out.println("bad candidate can do party:  " + badCandidate.canDoParty());
        System.out.println("bad candidate can do party:  " + ((Dragon) badCandidate.getPet()).canDoParty());
        System.out.println("is bad candidate sleeping:  " + badCandidate.isSleeping());
        System.out.println("is bad candidate's pet sleeping:  " + badCandidate.getPet().isSleeping());
    }
}
