public class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String department, String name, int magicPower, int transgressionDistance, int diligence, int loyalty, int honesty) {
        super(department, name, magicPower, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return super.toString() +
                ",\t трудолюбие=" + diligence +
                ",\t верность=" + loyalty +
                ",\t честность=" + honesty;
    }
 homework1

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }
}
