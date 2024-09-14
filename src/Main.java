public class Main { //изменённый
    public static void main(String[] args) {
        Griffindor[] griffindorStudent = new Griffindor[3];
        griffindorStudent[0] = new Griffindor("Гриффиндор", "Гарри Поттер", 100, 97, 99, 87, 81);
        griffindorStudent[1] = new Griffindor("Гриффиндор", "Гермиона Грейнджер", 92, 89, 81, 71, 82);
        griffindorStudent[2] = new Griffindor("Гриффиндор", "Рон Уизли", 85, 97, 84, 77, 85);
        for (Griffindor numberStudent : griffindorStudent) {
            System.out.println(numberStudent);
        }

homework1
        Hufflepuff[] hufflepuffStudent = new Hufflepuff[3];
        hufflepuffStudent[0] = new Hufflepuff("Пуффендуй", "Захария Смит", 67, 89, 79, 64, 98);
        hufflepuffStudent[1] = new Hufflepuff("Пуффендуй", "Седрик Диггори", 96, 83, 88, 67, 92);
        hufflepuffStudent[2] = new Hufflepuff("Пуффендуй", "Джастин Финч-Флетчли", 85, 79, 84, 73, 94);
        for (Hufflepuff numberStudent : hufflepuffStudent) {
            System.out.println(numberStudent);
        }

        Ravenclaw[] ravenclawStudent = new Ravenclaw[3];
        ravenclawStudent[0] = new Ravenclaw("Когтевран", "Чжоу Чанг", 64, 89, 79, 84, 98, 99);
        ravenclawStudent[1] = new Ravenclaw("Когтевран", "Падма Патил", 86, 83, 88, 87, 92, 84);
        ravenclawStudent[2] = new Ravenclaw("Когтевран", "Маркус Белби", 93, 79, 84, 83, 94, 79);
        for (Ravenclaw numberStudent : ravenclawStudent) {
            System.out.println(numberStudent);
        }

        Slytherin[] slytherinStudent = new Slytherin[3];
        slytherinStudent[0] = new Slytherin("Слизерин", "Драко Малфой", 64, 89, 79, 84, 98, 99, 77);
        slytherinStudent[1] = new Slytherin("Слизерин", "Грэхэм Монтегю", 86, 83, 88, 87, 92, 84, 65);
        slytherinStudent[2] = new Slytherin("Слизерин", "Грегори Гойл", 93, 79, 84, 83, 94, 79, 80);
        for (Slytherin numberStudent : slytherinStudent) {
            System.out.println(numberStudent);
        }
        printEqualGriffindorStudents(griffindorStudent);
        printEqualHufflepuffStudents(hufflepuffStudent);
        printEqualRavenclawStudents(ravenclawStudent);
        printEqualSlytherinStudents(slytherinStudent);
        printEqualHogwartsStudents(hufflepuffStudent, slytherinStudent);
    }

    private static void printEqualGriffindorStudents(Griffindor[] griffindorStudent) {
        Griffindor student1 = griffindorStudent[0];
        Griffindor student2 = griffindorStudent[1];
        int characteristicsStudent1 = student1.getCourage() + student1.getHonor() + student1.getNobility();
        int characteristicsStudent2 = student2.getCourage() + student2.getHonor() + student2.getNobility();
        if (characteristicsStudent1 > characteristicsStudent2) {
            System.out.println("Лучший ученик " + student1.getName());
        } else if (characteristicsStudent1 < characteristicsStudent2) {
            System.out.println("Лучший ученик " + student2.getName());
        } else {
            System.out.println("Студенты равны");
        }
    }

    private static void printEqualHufflepuffStudents(Hufflepuff[] hufflepuffStudent) {
        Hufflepuff student1 = hufflepuffStudent[0];
        Hufflepuff student2 = hufflepuffStudent[1];
        int characteristicsStudent1 = student1.getDiligence() + student1.getHonesty() +
                student1.getLoyalty();
        int characteristicsStudent2 = student2.getDiligence() + student2.getHonesty() +
                student2.getLoyalty();
        if (characteristicsStudent1 > characteristicsStudent2) {
            System.out.println("Лучший ученик " + student1.getName());
        } else if (characteristicsStudent1 < characteristicsStudent2) {
            System.out.println("Лучший ученик " + student2.getName());
        } else {
            System.out.println("Студенты равны");
        }
    }

    private static void printEqualRavenclawStudents(Ravenclaw[] ravenclawStudent) {
        Ravenclaw student1 = ravenclawStudent[0];
        Ravenclaw student2 = ravenclawStudent[1];
        int characteristicsStudent1 = student1.getCleverness() + student1.getWisdom() +
                student1.getCreativity() + student1.getWitness();
        int characteristicsStudent2 = student2.getCleverness() + student2.getWisdom() +
                student2.getCreativity() + student2.getWitness();
        if (characteristicsStudent1 > characteristicsStudent2) {
            System.out.println("Лучший ученик " + student1.getName());
        } else if (characteristicsStudent1 < characteristicsStudent2) {
            System.out.println("Лучший ученик " + student2.getName());
        } else {
            System.out.println("Студенты равны");
        }
    }

    private static void printEqualSlytherinStudents(Slytherin[] slytherinStudent) {
        Slytherin student1 = slytherinStudent[0];
        Slytherin student2 = slytherinStudent[1];
        int characteristicsStudent1 = student1.getAmbition() + student1.getCunning() + student1.getDecisiveness() +
                student1.getIngenuity() + student1.getLustForPower();
        int characteristicsStudent2 = student2.getAmbition() + student2.getCunning() + student2.getDecisiveness() +
                student2.getIngenuity() + student2.getLustForPower();
        if (characteristicsStudent1 > characteristicsStudent2) {
            System.out.println("Лучший ученик " + student1.getName());
        } else if (characteristicsStudent1 < characteristicsStudent2) {
            System.out.println("Лучший ученик " + student2.getName());
        } else {
            System.out.println("Студенты равны");
        }
    }

    private static void printEqualHogwartsStudents(Hufflepuff[] hufflepuffStudent, Slytherin[] slytherinStudent) {
        Hufflepuff student1 = hufflepuffStudent[2];
        Slytherin student2 = slytherinStudent[2];
        int characteristicsStudent1 = student1.getMagicPower() + student1.getTransgressionDistance();
        int characteristicsStudent2 = student2.getMagicPower() + student2.getTransgressionDistance();
        if (characteristicsStudent1 > characteristicsStudent2) {
            System.out.println(student1.getName() + " обладает большей мощностью магии, чем " + student2.getName());
        } else if (characteristicsStudent1 < characteristicsStudent2) {
            System.out.println(student2.getName() + " обладает большей мощностью магии, чем " + student1.getName());
        } else {
            System.out.println("Студенты равны");
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