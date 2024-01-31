/**
 * Goable
 */
public interface Goable {
    double getWalkSpeed();

    default double go() {
        return getWalkSpeed();
    }
}