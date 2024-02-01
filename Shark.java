import java.time.LocalDate;

/**
 * Shark
 */
public class Shark extends Animal implements Swimable {
    static double swimSpeed;

    static {
        swimSpeed = 19;
    }

    public Shark(String name, LocalDate birthDate, Illness illness) {
        super(name, birthDate, illness, false);
    }

    @Override
    public double getSwimSpeed() {
        return swimSpeed;
    }

}
