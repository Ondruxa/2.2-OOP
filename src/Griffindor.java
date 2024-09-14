 homework1
public class Griffindor extends Hogwarts {

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
 homework1
        return super.toString() +

                ",\t благородство=" + nobility +
                ",\t честь=" + honor +
                ",\t храбрость=" + courage;
    }
homework1


    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }


}
