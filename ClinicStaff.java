/**
 * ClinicStaff
 */
public class ClinicStaff {
    protected long id;
    protected String firstName;
    protected String lastName;
    protected double salary;

    public ClinicStaff(long id, String firstName, String lastName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public long getId() {
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
        return String.format("ID: %d \t%s %s %s \t %1.2f$", id, this.getClass().getSimpleName(), firstName, lastName,
                salary);
    }
}