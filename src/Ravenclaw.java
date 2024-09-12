public class Ravenclaw extends Hogwarts {

    private int cleverness;
    private int wisdom;
    private int witness;
    private int creativity;

    public Ravenclaw(String department, String name, int magicPower, int transgressionDistance, int cleverness, int wisdom, int witness, int creativity) {
        super(department, name, magicPower, transgressionDistance);
        this.cleverness = cleverness;
        this.wisdom = wisdom;
        this.witness = witness;
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return super.toString() +
                ",\t ум=" + cleverness +
                ",\t мудрость=" + wisdom +
                ",\t остроумие=" + witness +
                ",\t творчество=" + creativity;
    }

    public int getCleverness() {
        return cleverness;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWitness() {
        return witness;
    }

    public int getCreativity() {
        return creativity;
    }
}
