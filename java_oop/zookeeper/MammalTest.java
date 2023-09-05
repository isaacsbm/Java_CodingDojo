public class MammalTest {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();
        Bat bat = new Bat();

        System.out.println("Gorilla Class Test: ");
        gorilla.displayEnergy();
        gorilla.throwSomething();
        gorilla.eatBananas();
        gorilla.climb();

        System.out.println("Bat Class Test: ");
        bat.displayEnergy();
        bat.fly();
        bat.eatHumans();
        bat.attackTown();
        bat.displayEnergy();
    }
}