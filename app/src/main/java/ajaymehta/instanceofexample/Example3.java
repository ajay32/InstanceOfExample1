package ajaymehta.instanceofexample;

/**
 * Created by Avi Hacker on 11/17/2017.
 */

public class Example3 {
}

class Animal2 {
}

class Dog2 extends Animal2 {   //no  inhertance ....

    public static void main(String args[]){

        Dog2 dog2 = null;  // no object creation ..so result shoud be false

        System.out.println(dog2 instanceof Animal2);
    }

}

