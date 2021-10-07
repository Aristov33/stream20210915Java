package Lesson6.units;


import Lesson6.models.Hero;

public class Mage extends Hero {

        private int magicPoint;

        private static int costFireBall = 30;

        public Mage(String name, float health, float speedMove) {
            super(name, health, speedMove);
            this.magicPoint = 100;
        }

        @Override
        public void attack(float value){
            System.out.println(name + " wrong attack");
        }

        public void initFireBall() {
            if (magicPoint >= costFireBall) {
                magicPoint -= costFireBall;
                System.out.println(name + " has created FireBall. MagicPoint = " + magicPoint);
            } else {
                System.out.println("Not enought magic point");
            }
        }

        public void getDamage(int incomeDamage) {
            health -= incomeDamage;
            System.out.println(name + " has damage " + incomeDamage + ". HP = " + health);
        }




    }


