package Lesson6;

import Lesson6.models.Hero;
import Lesson6.units.Warrior;

public class Worker {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Warrior", 100.0f, 15, 25, 10);
//        warrior.test1();

//        warrior.speak();
//        warrior.move();
//        warrior.attack(123);
//        warrior.getDamage(50);
//
//        Archer archer = new Archer("Archer", 70.0f, 30, 5, 15);
//        archer.getDamage(5);
//        archer.escape();
//
//        Mage mage = new Mage("Mage", 100.0f, 30);
//        mage.attack(123);
//        mage.initFireBall();
//        mage.initFireBall();
//        mage.initFireBall();
//        mage.initFireBall();


//        Titan titan = new Titan("Titan", 1000, 500, 40, 3);
//        titan.speak();
//        titan.attack(50);
//        titan.getDamage(50);
//        titan.move();

        int abc = 15;
        String value = "String";
        boolean myBoolean = true;

        Object[] arrayObj = {warrior, value, abc, myBoolean};

        for (int i = 0; i < arrayObj.length; i++) {
            if (arrayObj[i] instanceof Hero) {
                ((Warrior) arrayObj[i]).test1();
            }
        }

    }
}


