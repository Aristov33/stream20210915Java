public class HomeWorkApp {
    public static void main(String [] args) {
        printThreeWords() ;
        checkSumSign() ;
        printColor() ;
        compareNumbers() ;
    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana") ;
        System.out.println("Apple");
    }
        public static void checkSumSign() {
        int a = 10, b = 13, c = 0;
       c = a - b ;
        System.out.println("c = " + c) ;
        if (c >= 0) {
            System.out.println("c не отрицательно");
        }
        if (c < 0) {
            System.out.println("c отрицательно");
        }
       c = b - a ;
        System.out.println("c = " + c);
        if (c >= 0) {
            System.out.println("c не отрицательно");
        }
        if (c < 0) {
            System.out.println("c отрицательно");
        }
    }
    public static void printColor() {
        int value =124;
        if (value <= 0) {
            System.out.println("Красный");
        }
        else if (value > 0 & value <= 100){
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int a = 15, b = 22 ;
        if (a >= b) {
            System.out.println("a>=b");
        }
        else {
            System.out.println("a<b");
        }
    }

}
