import java.time.LocalDate;

/**
 * Duck
 */
public class Duck extends Animal implements Goable, Flyable, Swimable {
    static double walkSpeed;
    static double flySpeed;
    static double swimSpeed;

    static {
        walkSpeed = 0.7;
        flySpeed = 70;
        swimSpeed = 2.5;
    }

    public Duck(String name, LocalDate birthDate, Illness illness) {
        super(name, birthDate, illness, false);
    }

    @Override
    public double getWalkSpeed() {
        return walkSpeed;
    }

    @Override
    public double getSwimSpeed() {
        return swimSpeed;
    }

    @Override
    public double getFlySpeed() {
        return flySpeed;
    }
}