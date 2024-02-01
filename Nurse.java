/**
 * Nurse
 */
public class Nurse extends ClinicStaff {
    public Nurse(String firstName, String lastName, double salary) {
        super(firstName, lastName, salary);
    }

    public void vaccinate(Animal animal) {
        animal.setIsVaccinated(true);
    }
}