public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int witty;
    private int creation;

    public Ravenclaw(String name, int magicPower, int transgressionDistance, int intelligence, int wisdom, int witty, int creation) {
        super(name, magicPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.witty = witty;
        this.creation = creation;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreation() {
        return creation;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    public static void compareStudents(Ravenclaw student1, Ravenclaw student2) {
        int sum1 = student1.getIntelligence() + student1.getWisdom() + student1.getWitty() + student1.getCreation();
        int sum2 = student2.getIntelligence() + student2.getWisdom() + student2.getWitty() + student2.getCreation();

        if (sum1 > sum2) {
            System.out.println(student1.getName() + " лучший Когтевранец, чем " + student2.getName());
        } else if (sum1 < sum2) {
            System.out.println(student2.getName() + " лучший Когтевранец, чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " равны по своим свойствам в Когтевране.");
        }
    }

    @Override
    public void displayDescription() {
        super.displayDescription();
        System.out.println("Качества Когтевранца: ");
        System.out.println(" - Умность: " + intelligence);
        System.out.println(" - Мудрость: " + wisdom);
        System.out.println(" - Остроумие: " + witty);
        System.out.println(" - Творчество: " + creation);
        System.out.println();

    }
}
