import java.util.Objects;
import java.util.UUID;

/**
 * ClinicStaff
 */
public class ClinicStaff {
    protected String id;
    protected String firstName;
    protected String lastName;
    protected double salary;

    public ClinicStaff(String firstName, String lastName, double salary) {
        id = UUID.randomUUID().toString();
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("ID: %.6s... \t%s %s %s \t %1.2f$", id, this.getClass().getSimpleName(), firstName,
                lastName,
                salary);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        ClinicStaff cs = (ClinicStaff) obj;
        return id.equals(cs.getId()) && firstName.equals(cs.getFirstName()) && lastName.equals(cs.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName);
    }
}
