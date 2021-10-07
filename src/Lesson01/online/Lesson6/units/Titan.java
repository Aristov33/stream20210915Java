package Lesson6.units;

public class Titan extends Warrior {


    public Titan(String name, float health, int power, int defence, float speedMove) {
        super(name, health, power, defence, speedMove);
    }

    @Override
    public void attack(float value){
        System.out.println("Titan big attack");
        super.speak();
    }


}
