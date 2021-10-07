package Lesson6.units;

import Lesson6.models.Hero;

public class Warrior extends Hero {

    protected int power;
    protected int defence;
//    private String name;

    public Warrior(String name, float health, int power, int defence, float speedMove) {
        super(name, health, speedMove);
        this.power = power;
        this.defence = defence;
        System.out.println("From constr " + name);
    }

    @Override
    public void attack(float value) {
        System.out.println(name + " attack " + (power * 10));
    }

    public void getDamage(int incomeDamage) {
        float tmp = incomeDamage / defence;
        health -= tmp;
        System.out.println(name + " get " + tmp + " damage. HP= " + health);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("something");
    }



    public void test1() {
        System.out.println("From method " + name);
    }


}
