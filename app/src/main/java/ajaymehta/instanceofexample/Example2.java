package ajaymehta.instanceofexample;

/**
 * Created by Avi Hacker on 11/17/2017.
 */

public class Example2 {
}

 class Animal {

}

class Dog extends Animal {   // inhertance .... inherited class object belong to its super (parent) class ...

    public static void main(String args[]){

        Dog dog = new Dog();

        System.out.println(dog instanceof Animal);
    }

}
