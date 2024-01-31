import java.time.LocalDate;

/**
 * Dog
 */
public class Dog extends Animal implements Goable {
    static double walkSpeed;

    static {
        walkSpeed = 7.8;
    }

    public Dog(String name, LocalDate birthDate, Illness illness) {
        super(name, birthDate, illness);
    }

    @Override
    public double getWalkSpeed() {
        return walkSpeed;
    }
}
