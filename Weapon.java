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
public class Weapon extends Item{
    private int damage;
    
    public Weapon() {
    }
    
    public Weapon(String name, double weight, int damage) {
        setName(name);
        setWeight(weight);
        setDamage(damage);
    }
    
    public String toString() {
        return super.toString() + 
                "Damage: " + getDamage() + "\n";
    }
    
    public boolean use(Object target) {
        boolean result = false;
        
        if (target instanceof Person) {
            Person p = (Person)target;
            System.out.println("Attack " + p.getName() + " with " +
                    getName() + " for " + getDamage() + " damage!");
            //p.defends(getDamage());
            if (p.defends(getDamage())) {
                System.out.println(p.getName() + " lives!");
                result = true;
            }
            else {
                System.out.println(p.getName() + " is dead!");
                result = true;
            }
        }
        else {
            result = false;
        }
        
        return result;
    }

    // getter and setter
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    
    
}
