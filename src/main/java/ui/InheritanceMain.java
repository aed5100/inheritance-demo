/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ui;

import model.Animal;
import model.Dog;
import model.Plant;

/**
 *
 * @author achiko
 */
public class InheritanceMain {

    public static void main(String[] args) {
        
        Animal zebra = new Animal("Stripes");
        
        
        System.out.println("What can Zebra do?");
        zebra.whatsYourName();
        zebra.eat();
        zebra.sleep();

        
        System.out.println("What can a Dog do?");
        Dog schnautzer = new Dog("Jack"); 
        
        schnautzer.whatsYourName();
        schnautzer.eat();
        schnautzer.sleep();
        schnautzer.bark();
        
        Dog mySecondDog = new Dog("Pinkie");
        
        
        Animal thisIsActuallyMySecondDog = mySecondDog; // Converts Dog to Animal
        
        // thisIsActuallyMySecondDog.bark();
        
        Dog thisIsMyDogAgain = (Dog) thisIsActuallyMySecondDog; // Converts Animal back to Dog
        
        thisIsMyDogAgain.bark();
        
        
        
    }
}
