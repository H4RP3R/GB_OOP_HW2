import java.time.LocalDate;

/**
 * Cat
 */
public class Cat extends Animal implements Goable {
    static double walkSpeed;

    static {
        walkSpeed = 5.5;
    }

    public Cat(String name, LocalDate birthDate, Illness illness) {
        super(name, birthDate, illness, false);
    }

    @Override
    public double getWalkSpeed() {
        return walkSpeed;
    }
}
