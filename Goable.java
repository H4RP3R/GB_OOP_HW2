/**
 * Goable
 */
public interface Goable {
    double getWalkSpeed();

    default double run() {
        return getWalkSpeed();
    }
}