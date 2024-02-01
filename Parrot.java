import java.time.LocalDate;

/**
 * Parrot
 */
public class Parrot extends Animal implements Flyable, Goable {
    static double walkSpeed;
    static double flySpeed;

    static {
        walkSpeed = 2;
        flySpeed = 70.8;
    }

    public Parrot(String name, LocalDate birthDate, Illness illness) {
        super(name, birthDate, illness, false);
    }

    @Override
    public double getWalkSpeed() {
        return walkSpeed;
    }

    @Override
    public double getFlySpeed() {
        return flySpeed;
    }

}
