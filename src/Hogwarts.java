public class Hogwarts {
    private String name;
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public void displayDescription() {
        System.out.println("Студент: " + name);
        System.out.println("Общие качества: ");
        System.out.println(" - Сила магии: " + magicPower);
        System.out.println(" - Расстояние трансгрессии: " + transgressionDistance);
    }

    public static void compareStudents(Hogwarts student1, Hogwarts student2) {
        if (student1.getMagicPower() > student2.getMagicPower()
                && student1.getTransgressionDistance() > student2.getTransgressionDistance()) {
            System.out.println(student1.getName() +
                    " обладает большей мощностью магии и большем расстоянием трансгресии, чем " + student2.getName());
        } else if (student1.getMagicPower() > student2.getMagicPower()
                && student1.getTransgressionDistance() < student2.getTransgressionDistance()){
            System.out.println(student1.getName() + " обладает большей мощностью магии, " +
                    "но меньменьшим расстоянием трансгресии чем " + student2.getName());
        } else if(student1.getMagicPower() < student2.getMagicPower()
                && student1.getTransgressionDistance() > student2.getTransgressionDistance()){

            System.out.println(student1.getName() + " обладает меньшей мощностью магии, " +
                    "но большим расстоянием трансгресии чем " + student2.getName());
        } else if (student1.getMagicPower() < student2.getMagicPower()
        && student1.getTransgressionDistance() < student2.getTransgressionDistance()){
            System.out.println(student2.getName() +
                    " обладает большей мощностью магии и большем расстоянием трансгресии, чем " + student1.getName());
    } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " равны по своим свойствам в Хогвартсе");
        }


        }

    }



