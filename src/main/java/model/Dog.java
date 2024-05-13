/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author achiko
 */
public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }
    
    public void bark(){
        System.out.println("I'm a dog and I can bark: Wufwuf");
        
    }
}
