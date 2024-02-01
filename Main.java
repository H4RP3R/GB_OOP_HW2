import java.time.LocalDate;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", LocalDate.of(2017, 05, 01), new Illness("Lichen"));
        Duck duck = new Duck("Donald", LocalDate.of(2021, 05, 06), new Illness());
        Dog dog = new Dog("Sharik", LocalDate.of(2019, 10, 24), new Illness("Distemper"));
        Penguin penguin = new Penguin("Lolo", LocalDate.of(2018, 01, 01), new Illness());
        Shark shark = new Shark("Sharp", LocalDate.of(2012, 11, 20), new Illness());
        Beaver beaver = new Beaver("Justin", LocalDate.of(2015, 02, 07), new Illness());
        Parrot parrot = new Parrot("Iago", LocalDate.of(2011, 06, 11), new Illness());

        Doctor doctor1 = new Doctor("John", "Smith", 4000);
        Nurse nurse1 = new Nurse("Anna", "Williams", 3200);
        Doctor doctor2 = new Doctor("Ivan", "Popov", 5000, nurse1);
        Nurse nurse2 = new Nurse("Kristina", "Johnson", 3450);

        VeterinaryClinic clinic = new VeterinaryClinic();
        clinic.addStaff(doctor1);
        clinic.addStaff(doctor2);
        clinic.addStaff(nurse1, nurse2);
        clinic.addPatients(cat, duck, dog, penguin, shark, beaver, parrot);

        System.out.println("Goable");
        for (Goable g : clinic.getGoables()) {
            System.out.println(g);
        }
        System.out.println();

        System.out.println("Swimable");
        for (Swimable s : clinic.getSwimables()) {
            System.out.println(s);
        }
        System.out.println();

        System.out.println("Flyable");
        for (Flyable f : clinic.getFlyables()) {
            System.out.println(f);
        }
        System.out.println();

        System.out.println("Doctors");
        for (Doctor d : clinic.getDoctors()) {
            System.out.println(d);
        }
        System.out.println();

        System.out.println("Nurses");
        for (Nurse n : clinic.getNurses()) {
            System.out.println(n);
        }
        System.out.println();

        doctor2.diagnose(penguin, "Lichen");
        doctor2.getNurse().vaccinate(penguin);
        System.out.println(penguin.getIllness());
        System.out.println(penguin.getIsVaccinated());
    }
}
