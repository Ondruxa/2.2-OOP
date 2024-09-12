public class Griffindor extends Hogwarts  {
    private String name;
    private int nobility;
    private int honor;
    private int courage;

    public Griffindor(String department, String name, int magicPower, int transgressionDistance, int nobility, int honor, int courage) {
        super(department, name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    @Override
    public String toString() {
        return super.toString()+
                ",\t благородство=" + nobility +
                ",\t честь=" + honor +
                ",\t храбрость=" + courage;
    }
}
