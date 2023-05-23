public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int authority;

    public Slytherin(String name, int magicPower, int transgressionDistance, int cunning, int determination, int ambition,
                     int resourcefulness, int authority) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.authority = authority;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getAuthority() {
        return authority;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setAuthority(int authority) {
        this.authority = authority;
    }

    public static void compareStudents(Slytherin student1, Slytherin student2) {
        int sum1 = student1.getCunning() + student1.getDetermination() + student1.getAmbition() +
                student1.getResourcefulness() + student1.getAuthority();
        int sum2 = student2.getCunning() + student2.getDetermination() + student2.getAmbition() +
                student2.getResourcefulness() + student2.getAuthority();

        if (sum1 > sum2) {
            System.out.println(student1.getName() + " лучший Слизеринец, чем " + student2.getName());
        } else if (sum1 < sum2) {
            System.out.println(student2.getName() + " лучший Слизеринец, чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " равны по своим свойствам в Слизерине.");
        }
    }

    @Override
    public void displayDescription() {
        super.displayDescription();
        System.out.println(" - Хитрость: " + cunning);
        System.out.println(" - Решительность: " + determination);
        System.out.println(" - Амбициозность: " + ambition);
        System.out.println(" - Находчивость: " + resourcefulness);
        System.out.println(" - Жажда власти: " + authority);
        System.out.println();
    }
}
