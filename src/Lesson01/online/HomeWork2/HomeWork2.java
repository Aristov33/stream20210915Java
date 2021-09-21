package HomeWork2;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(taskone(10, 10));
        tasktwo(-4);
        System.out.println(taskthree(0));
        printWordNTimes("Сергей" , 4);
    }

    public static boolean taskone(int a, int b) {
        System.out.println("Задание 3.");
        int c = a + b;
        if (c > 9 && c < 21) return true;
        else return false;
    }

    public static void tasktwo(int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");

        }
    }

    public static boolean taskthree(int a) {
        if (a < 0) return true;
        else return false;
    }

    public static void printWordNTimes(String word, int times) {
        for (int k =1; k < times; k++) {
            System.out.println("[ " + k + " ]" + " "+word);
        }
    }
}



