public class Main {
    public static void main(String[] args) {
        Hogwarts harry = new Hogwarts("Гарри Поттер", 90, 80);
        Hogwarts hermione = new Hogwarts("Гермиона Грейнджер", 95, 85);
        Hogwarts ron = new Hogwarts("Рон Уизли", 80, 75);

        Hogwarts draco = new Hogwarts("Драко Малфой", 85, 90);
        Hogwarts graham = new Hogwarts("Грэхэм Монтегю", 75, 80);
        Hogwarts goyle = new Hogwarts("Грегори Гойл", 80, 70);

        Hogwarts zacharia = new Hogwarts("Захария Смит", 80, 75);
        Hogwarts cedric = new Hogwarts("Седрик Диггори", 85, 90);
        Hogwarts justin = new Hogwarts("Джастин Финч-Флетчли", 75, 80);

        Hogwarts zhou = new Hogwarts("Чжоу Чанг", 90, 85);
        Hogwarts padma = new Hogwarts("Падма Патил", 80, 75);
        Hogwarts marcus = new Hogwarts("Маркус Белби", 85, 90);

        Gryffindor harry1 = new Gryffindor("Гарри Поттер", 90, 80, 85, 90, 95);
        Gryffindor hermione1 = new Gryffindor("Гермиона Грейнджер", 95,85, 80,75,85);
        Gryffindor ron1 = new Gryffindor("Рон Уизли", 80, 85, 90,75,80);

        Slytherin draco1 = new Slytherin("Драко Малфой", 85,90, 75, 80, 85, 90, 85);
        Slytherin graham1 = new Slytherin("Грэхэм Монтегю", 75, 80,80, 85, 80, 75, 75);
        Slytherin goyle1 = new Slytherin("Грегори Гойл", 80, 70, 75, 70,80 ,80,75);

        Hufflepuff zacharia1 = new Hufflepuff("Захария Смит", 80, 75, 85, 80,90);
        Hufflepuff cedric1 = new Hufflepuff("Седрик Диггори", 85, 90, 85, 80, 85);
        Hufflepuff justin1 = new Hufflepuff("Джастин Финч-Флетчли", 75, 80,75,80,85);

        Ravenclaw zhou1 = new Ravenclaw("Чжоу Чанг", 90, 85, 85,80,85,90);
        Ravenclaw padma1 = new Ravenclaw("Падма Патил", 80, 75,80,75,85,80);
        Ravenclaw marcus1 = new Ravenclaw("Маркус Белби", 85, 90,85,85,85,90);

        harry1.displayDescription();
        draco1.displayDescription();
        zacharia1.displayDescription();
        zhou1.displayDescription();

        // Сравнение студентов в Хогвартсе

        Hogwarts.compareStudents(padma, cedric);
        Hogwarts.compareStudents(ron, justin);
        System.out.println();

        // Сравнение студентов в Гриффиндоре

        Gryffindor.compareStudents(harry1, hermione1);
        Gryffindor.compareStudents(ron1, hermione1);
        System.out.println();

        // Сравнение студентов в Слизерине
        Slytherin.compareStudents(draco1, graham1);
        Slytherin.compareStudents(goyle1, draco1);
        System.out.println();

        // Сравнение студентов в Пуффендуй
        Hufflepuff.compareStudents(zacharia1, cedric1);
        Hufflepuff.compareStudents(justin1, zacharia1);
        System.out.println();

        // Сравнение студентов в Когтевране
        Ravenclaw.compareStudents(zhou1, padma1);
        Ravenclaw.compareStudents(marcus1, zhou1);
    }
}