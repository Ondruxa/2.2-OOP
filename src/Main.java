public class Main {
    public static void main(String[] args) {
        Griffindor[] griffindorStudent = new Griffindor[3];
        griffindorStudent[0] = new Griffindor("Гриффиндор", "Гарри Поттер", 100, 97, 99, 87, 81);
        griffindorStudent[1] = new Griffindor("Гриффиндор", "Гермиона Грейнджер", 92, 89, 81, 71, 82);
        griffindorStudent[2] = new Griffindor("Гриффиндор", "Рон Уизли", 85, 97, 84, 77, 85);
        for (Griffindor numberStudent : griffindorStudent) {
            System.out.println(numberStudent);
        }

        Hufflepuff[] HufflepuffStudent = new Hufflepuff[3];
        HufflepuffStudent[0] = new Hufflepuff("Пуффендуй", "Захария Смит", 67, 89, 79, 64, 98);
        HufflepuffStudent[1] = new Hufflepuff("Пуффендуй", "Седрик Диггори", 96, 83, 88, 67, 92);
        HufflepuffStudent[2] = new Hufflepuff("Пуффендуй", "Джастин Финч-Флетчли", 85, 79, 84, 73, 94);
        for (Hufflepuff numberStudent : HufflepuffStudent) {
            System.out.println(numberStudent);
        }

        Ravenclaw[] ravenclawStudents = new Ravenclaw[3];
        ravenclawStudents[0] = new Ravenclaw("Когтевран", "Чжоу Чанг", 64, 89, 79, 84, 98, 99);
        ravenclawStudents[1] = new Ravenclaw("Когтевран", "Падма Патил", 86, 83, 88, 87, 92, 84);
        ravenclawStudents[2] = new Ravenclaw("Когтевран", "Маркус Белби", 93, 79, 84, 83, 94, 79);
        for (Ravenclaw numberStudent : ravenclawStudents) {
            System.out.println(numberStudent);
        }

        Slytherin[] slytherinStudents = new Slytherin[3];
        slytherinStudents[0] = new Slytherin("Слизерин", "Драко Малфой", 64, 89, 79, 84, 98, 99, 77);
        slytherinStudents[1] = new Slytherin("Слизерин", "Грэхэм Монтегю", 86, 83, 88, 87, 92, 84, 65);
        slytherinStudents[2] = new Slytherin("Слизерин", "Грегори Гойл учатся", 93, 79, 84, 83, 94, 79, 80);
        for (Slytherin numberStudent : slytherinStudents) {
            System.out.println(numberStudent);
        }
    }
}