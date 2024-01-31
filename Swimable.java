/**
 * Swimable
 */
public interface Swimable {

    double getSwimSpeed();

    default double swim() {
        return getSwimSpeed();
    }
}