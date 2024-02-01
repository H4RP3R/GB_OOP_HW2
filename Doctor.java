/**
 * Doctor
 */
public class Doctor extends ClinicStaff {
    private Nurse nurse;

    public Doctor(long id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
    }

    public Doctor(long id, String firstName, String lastName, double salary, Nurse nurse) {
        this(id, firstName, lastName, salary);
        this.nurse = nurse;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    public void diagnose(Animal animal, String illnessName) {
        Illness illness = new Illness(illnessName);
        animal.setIllness(illness);
    }
}