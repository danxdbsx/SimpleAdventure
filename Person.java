package SimpleAdventure;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danial
 */
public class Person {
    private String name;
    private int health;
    private int maxHealth = 100;
    
    public Person(String name) {
        this.name = name;
        this.health = maxHealth;
    }
    
    public String toString() {
        return "Name: " + getName() + "\nHealth: " + getHealth() + "\n";
    }
    
    public boolean isAlive() {
        return (getHealth() != 0);
    }
    
    public boolean heal(int boost) {
        boolean result = false;
        if (isAlive()) {
            this.health = Math.min(this.health + boost, maxHealth);
            result = true;
        }
        else
            result = false;
        return result;
    }
    
    public boolean defends(int damage) {
        this.health = Math.max(this.health - damage, 0);
        return isAlive();
    }

    // getters:
    
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
    
    
}
