package gr.aueb.cf.exercises.OOPBasics;

public class KnightTest {

    public static void main(String[] args) {
        Knight knight = new Knight("Sir Java", 100, 20);

        knight.displayStats();

        knight.setHealth(120);
        knight.setAttackPower(25);

        System.out.println("\nAfter updating stats:");
        knight.displayStats();
    }
}
