/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ui;

import java.util.ArrayList;
import model.Animal;
import model.Cat;
import model.Dog;
import model.Tree;

/**
 *
 * @author achiko
 */
public class InheritanceMain {

    public static void main(String[] args) {
        
        ArrayList<Animal> happyAnimals = new ArrayList<Animal>();
        
        Dog dog = new Dog("Small dog");
        Cat cat = new Cat("Lovely cat");
        
        
        happyAnimals.add(dog);
        happyAnimals.add(cat);
        
        
        Dog smallDog = (Dog) happyAnimals.get(0);
        smallDog.bark();
        smallDog.eat();
        
        
        Cat lovelyCat = (Cat) happyAnimals.get(1);
        lovelyCat.meow();
        lovelyCat.eat();
        
        
    
        
        
        
        
        
        
        
        
        
    }
}
