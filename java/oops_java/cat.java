package oops_java;
// 1
public class cat extends animal{
    boolean isAlive;
    cat(){
        isAlive = true;
    }
    void eat(){
        System.out.println("The animal is eating");
    }

    int lives = 6;
    void speak(){
        System.out.println("The cat goes *woof*");
    }
    
}
