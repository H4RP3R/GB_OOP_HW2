/**
 * Nurse
 */
public class Nurse extends ClinicStaff {
    public Nurse(long id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
    }

    public void vaccinate(Animal animal) {
        animal.setIsVaccinated(true);
    }
}