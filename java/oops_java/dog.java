package oops_java;
// 1
public class dog extends animal{
    boolean isAlive;
    dog(){
        isAlive = true;
    }
    void eat(){
        System.out.println("The animal is eating");
    }

    int lives = 1;
    void speak(){
        System.out.println("The cat goes *meow*");
    }
    
}
