import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * VeterinaryClinic
 */
public class VeterinaryClinic {
    private Set<ClinicStaff> staff;
    private Set<Animal> patients;

    public VeterinaryClinic() {
        staff = new HashSet<>();
        patients = new HashSet<>();
    }

    public void addStaff(ClinicStaff... cs) {
        staff.addAll(List.of(cs));
    }

    public Set<ClinicStaff> getStaff() {
        return staff;
    }

    public void addPatients(Animal... p) {
        patients.addAll(List.of(p));
    }

    public Set<Animal> getPatients() {
        return patients;
    }

    public Set<Goable> getGoables() {
        Set<Goable> res = new HashSet<>();
        for (Animal animal : getPatients()) {
            if (animal instanceof Goable) {
                res.add((Goable) animal);
            }
        }

        return res;
    }

    public Set<Swimable> getSwimables() {
        Set<Swimable> res = new HashSet<>();
        for (Animal animal : getPatients()) {
            if (animal instanceof Swimable) {
                res.add((Swimable) animal);
            }
        }

        return res;
    }

    public Set<Flyable> getFlyables() {
        Set<Flyable> res = new HashSet<>();
        for (Animal animal : getPatients()) {
            if (animal instanceof Flyable) {
                res.add((Flyable) animal);
            }
        }

        return res;
    }

    public Set<Doctor> getDoctors() {
        Set<Doctor> res = new HashSet<>();
        for (ClinicStaff staff : getStaff()) {
            if (staff instanceof Doctor) {
                res.add((Doctor) staff);
            }
        }

        return res;
    }

    public Set<Nurse> getNurses() {
        Set<Nurse> res = new HashSet<>();
        for (ClinicStaff staff : getStaff()) {
            if (staff instanceof Nurse) {
                res.add((Nurse) staff);
            }
        }

        return res;
    }
}
