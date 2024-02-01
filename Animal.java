import java.time.LocalDate;

/**
 * Animal
 */
public class Animal {
    protected String name;
    protected LocalDate birthDate;
    protected Illness illness;
    protected boolean isVaccinated;

    public Animal(String name, LocalDate birthDate, Illness illness, boolean isVaccinated) {
        this.name = name;
        this.birthDate = birthDate;
        this.illness = illness;
        this.isVaccinated = isVaccinated;
    }

    public Animal() {
        this("Default Name", LocalDate.now(), new Illness(), false);
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Illness getIllness() {
        return illness;
    }

    public String getType() {
        return getClass().getSimpleName();
    }

    public boolean getIsVaccinated() {
        return isVaccinated;
    }

    public void setIsVaccinated(boolean isVaccinated) {
        this.isVaccinated = isVaccinated;
    }

    public void setIllness(Illness illness) {
        this.illness = illness;
    }

    private void wakeUp() {
        System.out.println(getType() + " awoke");
    }

    private void wakeUp(String time) {
        System.out.println(getType() + " woke up  at " + time);
    }

    private void hunt() {
        System.out.println(getType() + " is hunting...");
    }

    private void eat() {
        System.out.println(getType() + " is eating...");
    }

    private void sleep() {
        System.out.println(getType() + " is sleeping...");
    }

    // public void lifeCycle() {
    // wakeUp("07:00");
    // hunt();
    // eat();
    // sleep();
    // }

    // public void go() {
    // System.out.println(getType() + " is walking...");
    // }

    // public void fly() {
    // System.out.println(getType() + " is flying...");
    // }

    // public void swim() {
    // System.out.println(getType() + " is swimming...");
    // }

    @Override
    public String toString() {
        return String.format("Type: %s\tName: %s\tBirth date: %s\tIllness: %s", getType(), name, birthDate, illness);
    }
}