public class Slytherin extends Hogwarts{
    private int cunning;
    private int decisiveness;
    private int ambition;
    private int ingenuity;
    private int lustForPower;

    public Slytherin(String department, String name, int magicPower, int transgressionDistance, int cunning, int decisiveness, int ambition, int ingenuity, int lustForPower) {
        super(department, name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.decisiveness = decisiveness;
        this.ambition = ambition;
        this.ingenuity = ingenuity;
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return super.toString() +
                ",\t хитрость=" + cunning +
                ",\t решительность=" + decisiveness +
                ",\t амбициозность=" + ambition +
                ",\t находчивость =" + ingenuity +
                ",\t жажда власти=" + lustForPower;
    }
}
