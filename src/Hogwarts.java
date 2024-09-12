public class Hogwarts {
    private int magicPower;
    private int transgressionDistance;
    private String department;
    private String name;

    public Hogwarts(String department, String name, int magicPower, int transgressionDistance) {
        this.department = department;
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    @Override
    public String toString() {
        return "Хогвартс, " + "имя - " + name +
                ",\t факультет=" + department +
                ",\t колдовская мощь=" + magicPower +
                ",\t расстояние трансгрессии=" + transgressionDistance;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }
}

