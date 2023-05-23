public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

// Getters
    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }
    // Setters


    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
    // Konstructor

    public Gryffindor(String name , int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;

    }
    // Метод для срасравнения двух учеников одного факультета по свойствам.
    public static void compareStudents(Gryffindor student1, Gryffindor student2) {
        int sum1 = student1.getNobility() + student1.getHonor() + student1.getBravery();
        int sum2 = student2.getNobility() + student2.getHonor() + student2.getBravery();

        if (sum1 > sum2) {
            System.out.println(student1.getName() + " лучший Гриффиндорец, чем " + student2.getName());
        } else if (sum1 < sum2) {
            System.out.println(student2.getName() + " лучший Гриффиндорец, чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " равны по своим свойствам в Гриффиндоре");
        }
    }
    @Override
    public void displayDescription() {
        super.displayDescription();
        System.out.println("Качества Гриффиндорца: ");
        System.out.println(" - Благородство: " + nobility);
        System.out.println(" - Честь: " + honor);
        System.out.println(" - Храбрость: " + bravery);
        System.out.println();
    }
}