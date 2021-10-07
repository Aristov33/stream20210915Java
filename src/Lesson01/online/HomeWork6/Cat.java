package HomeWork6;

public class Cat extends Animal{
    private final int MAX_RUN_LENGTH = 200;
    private final double MAX_JUMP_HEIGTH = 2;
    @Override
    void run(int length) {
        if ((length >= 0) && (length <= MAX_RUN_LENGTH)) System.out.println("run: " + length);
        else System.out.println("run: Неверное действие");
    }

    @Override
    void swim(int length) {
        System.out.println("swim: Неверное действие");
    }

    @Override
    void jump(double height) {
        if ((height >= 0) && (height <= MAX_JUMP_HEIGTH)) System.out.println("jump: "+length );
        else System.out.println("jump: Неверное действие");
    }
}
