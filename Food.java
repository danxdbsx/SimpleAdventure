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
public class Food extends Item{
    private int health;
    
    public Food(){
    }
    
    public Food(String name, double weight, int health) {
        setName(name);
        setWeight(weight);
        setHealth(health);
    }
    
    public String toString() {
         return super.toString() + 
                "Health: " + getHealth() + "\n";
    }
    
    public boolean use(Object target) {
        boolean result = false;
        
        if (target instanceof Person) {
            Person p = (Person)target;
            //p.heal(getHealth());
            
            if (p.heal(getHealth())) {
                System.out.println(p.getName() + " ate " + getName() + " for " +
                                    health + " health!");
                result = true;
            }
            else {
                System.out.println(p.getName() + " cannot be healed!");
                result = false;
            }    
        }
        else {
            result = false;
        }
        
        return result;
    }

    
    // getter and setter
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    
    
}
