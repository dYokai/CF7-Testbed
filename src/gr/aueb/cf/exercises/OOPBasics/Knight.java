package gr.aueb.cf.exercises.OOPBasics;

public class Knight {
    private String name;
    private int health;
    private int attackPower;

    // Constructor
    public Knight(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    // Display stats
    public void displayStats() {
        System.out.println("Knight's stats:");
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Attack Power: " + attackPower);
    }

    // Attack method
    public int attack() {
        System.out.println(name + " attacks with power " + attackPower + "!");
        return attackPower; // The damage dealt to an enemy
    }

    // Take damage method
    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0; // Prevent negative health
        System.out.println(name + " takes " + damage + " damage. Health is now: " + health);
    }
}
