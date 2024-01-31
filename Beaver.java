import java.time.LocalDate;

/**
 * Beaver
 */
public class Beaver extends Animal implements Goable, Swimable {
    static double walkSpeed;
    static double swimSpeed;

    static {
        walkSpeed = 3;
        swimSpeed = 10;
    }

    public Beaver(String name, LocalDate birthDate, Illness illness) {
        super(name, birthDate, illness);
    }

    @Override
    public double getSwimSpeed() {
        return swimSpeed;
    }

    @Override
    public double getWalkSpeed() {
        return walkSpeed;
    }
}