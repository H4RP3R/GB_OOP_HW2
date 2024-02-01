/**
 * Doctor
 */
public class Doctor extends ClinicStaff {
    private Nurse nurse;

    public Doctor(String firstName, String lastName, double salary) {
        super(firstName, lastName, salary);
    }

    public Doctor(String firstName, String lastName, double salary, Nurse nurse) {
        this(firstName, lastName, salary);
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
