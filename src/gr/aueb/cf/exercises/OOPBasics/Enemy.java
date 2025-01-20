package gr.aueb.cf.exercises.OOPBasics;

public class Enemy extends Knight {

    public Enemy(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    // Unique behavior for Enemy
    public void taunt() {
        System.out.println(getName() + " shouts: 'You'll never defeat me!'");
    }

    @Override
    public void displayStats() {
        System.out.println("Enemy Stats:");
        super.displayStats();
    }
}
