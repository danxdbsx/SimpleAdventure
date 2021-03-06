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
public class Item {
    private String name;
    private double weight;
    
    // needed because food and weapon have different list of variables
    public Item(){
    }
    
    public Item(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
    
    public String toString() {
        return "Name: " + getName() + "\nWeight: " + getWeight() + "\n";
    }
    
    public boolean use(Object target) {
        System.out.println("Not usable");
        return false;
    }

    
    // getters and setters:
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    
}
