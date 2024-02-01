/**
 * Flyable
 */
public interface Flyable {
    double getFlySpeed();

    default double fly() {
        return getFlySpeed();
    }
}
