/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author achiko
 */
public class Animal {
    public String name;
    
    public Animal(String name){
        this.name = name;
    }
    
    public void eat(){
        System.out.println("I can eat: Yum yum");
    }
    
    public void sleep() {
        System.out.println("I can sleep Zzzzzz");
    }
    
    public void whatsYourName(){
        System.out.println("My name is " + name);
    }
}
