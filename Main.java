import java.time.LocalDate;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        // Cat cat = new Cat("Barsik", LocalDate.of(2017, 05, 01), new
        // Illness("Lichen"));
        // System.out.println(cat.run());
        // System.out.println();

        // Duck duck = new Duck("Donald", LocalDate.of(2021, 05, 06), new Illness());
        // System.out.println(duck.run());
        // System.out.println(duck.fly());
        // System.out.println(duck.swim());
        // System.out.println();

        // Dog dog = new Dog("Sharik", LocalDate.of(2019, 10, 24), new
        // Illness("Distemper"));
        // System.out.println(dog.run());
        // System.out.println();

        // Penguin penguin = new Penguin("Lolo", LocalDate.of(2018, 01, 01), new
        // Illness());
        // System.out.println(penguin.run());
        // System.out.println(penguin.swim());
        // System.out.println();

        // Shark shark = new Shark("Sharp", LocalDate.of(2012, 11, 20), new Illness());
        // System.out.println(shark.swim());
        // System.out.println();

        // Beaver beaver = new Beaver("Justin", LocalDate.of(2015, 02, 07), new
        // Illness());
        // System.out.println(beaver.run());
        // System.out.println(beaver.swim());
        // System.out.println();

        // Parrot parrot = new Parrot("Iago", LocalDate.of(2011, 06, 11), new
        // Illness());
        // System.out.println(parrot.run());
        // System.out.println(parrot.fly());
        // System.out.println();

        Doctor doctor1 = new Doctor(123421, "John", "Smith", 4000);
        System.out.println(doctor1);

        Nurse nurse1 = new Nurse(230451, "Anna", "Williams", 3200);
        System.out.println(nurse1);

        Doctor doctor2 = new Doctor(163424, "Ivan", "Popov", 5000, nurse1);
        System.out.println(doctor2);

        Nurse nurse2 = new Nurse(173914, "Kristina", "Johnson", 3450);
        System.out.println(nurse2);
    }
}