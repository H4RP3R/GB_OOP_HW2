import java.time.LocalDate;

/**
 * Penguin
 */
public class Penguin extends Animal implements Swimable, Goable {
    static double walkSpeed;
    static double swimSpeed;

    static {
        walkSpeed = 0.3;
        swimSpeed = 30;
    }

    public Penguin(String name, LocalDate birthDate, Illness illness) {
        super(name, birthDate, illness);
    }

    @Override
    public double getWalkSpeed() {
        return walkSpeed;
    }

    @Override
    public double getSwimSpeed() {
        return swimSpeed;
    }
}