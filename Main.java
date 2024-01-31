import java.time.LocalDate;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", LocalDate.of(2017, 05, 01), new Illness("Lichen"));
        System.out.println(cat.go());
        System.out.println();

        Duck duck = new Duck("Donald", LocalDate.of(2021, 05, 06), new Illness());
        System.out.println(duck.go());
        System.out.println(duck.fly());
        System.out.println(duck.swim());
        System.out.println();

        Dog dog = new Dog("Sharik", LocalDate.of(2019, 10, 24), new Illness("Distemper"));
        System.out.println(dog.go());
        System.out.println();

        Penguin penguin = new Penguin("Lolo", LocalDate.of(2018, 01, 01), new Illness());
        System.out.println(penguin.go());
        System.out.println(penguin.swim());
        System.out.println();

        Shark shark = new Shark("Sharp", LocalDate.of(2012, 11, 20), new Illness());
        System.out.println(shark.swim());
        System.out.println();

        Beaver beaver = new Beaver("Justin", LocalDate.of(2015, 02, 07), new Illness());
        System.out.println(beaver.go());
        System.out.println(beaver.swim());
        System.out.println();
    }
}