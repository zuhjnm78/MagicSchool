public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int magicPower, int transgressionDistance, int industriousness, int loyalty, int honesty) {
        super(name, magicPower, transgressionDistance);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    // Getters
    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    // Setters
    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public static void compareStudents(Hufflepuff student1, Hufflepuff student2) {
        int sum1 = student1.getIndustriousness() + student1.getLoyalty() + student1.getHonesty();
        int sum2 = student2.getIndustriousness() + student2.getLoyalty() + student2.getHonesty();

        if (sum1 > sum2) {
            System.out.println(student1.getName() + " лучший Пуффендуец, чем " + student2.getName());
        } else if (sum1 < sum2) {
            System.out.println(student2.getName() + " лучший Пуффендуец, чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " равны по своим свойствам в Пуффендуе.");
        }
    }

    @Override
    public void displayDescription() {
        super.displayDescription();
        System.out.println("Качества Пуффендуя: ");
        System.out.println(" - Трудолюбие: " + industriousness);
        System.out.println(" - Верность: " + loyalty);
        System.out.println(" - Честность: " + honesty);
        System.out.println();
    }
}

