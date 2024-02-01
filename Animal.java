import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

/**
 * Animal
 */
public class Animal {
    protected String id;
    protected String name;
    protected LocalDate birthDate;
    protected Illness illness;
    protected boolean isVaccinated;

    public Animal(String name, LocalDate birthDate, Illness illness, boolean isVaccinated) {
        id = UUID.randomUUID().toString();
        this.name = name;
        this.birthDate = birthDate;
        this.illness = illness;
        this.isVaccinated = isVaccinated;
    }

    public Animal() {
        this("Default Name", LocalDate.now(), new Illness(), false);
    }

    public String getId() {
        return id;
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

    public void lifeCycle() {
        wakeUp("07:00");
        hunt();
        eat();
        sleep();
    }

    @Override
    public String toString() {
        return String.format("Type: %s\tName: %s\tBirth date: %s\tIllness: %s", getType(), name, birthDate, illness);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Animal a = (Animal) obj;
        return id.equals(a.getId()) && name.equals(a.getName()) && birthDate.equals(a.getBirthDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, birthDate);
    }
}
