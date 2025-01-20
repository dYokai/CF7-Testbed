package gr.aueb.cf.exercises.OOPBasics;

public class BattleTest {
    public static void main(String[] args) {
        Knight knight = new Knight("Sir Java", 100,20);
        Enemy enemy = new Enemy("Dark Coder", 99, 21);

        knight.displayStats();
        enemy.displayStats();

        System.out.println("Battle Begins");
        while (knight.getHealth() > 0 && enemy.getHealth() > 0) {
            enemy.takeDamage(knight.attack());

            if (enemy.getHealth() > 0) {
                knight.takeDamage(enemy.attack());
            }
        }
            if (knight.getHealth() > 0) {
                System.out.println("\n" + knight.getName() + " is victorious!");
            } else {
                System.out.println("\n " + enemy.getName() + " is victorious!");
            }
    }
}
