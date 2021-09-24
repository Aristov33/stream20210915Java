package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class ClassTest {

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();


    public static void main(String[] args) {

//        String tmp = scanner.next();
//        System.out.println("Hello " + inputUserName("Enter your name"));
//        System.out.println("Hello " + inputUserName("Enter your phone"));
        //       int abc = 150;
        //     System.out.println("Result > " + abc * inputUserNumber("Enter your number:"));
     //   for (int i = 0; i < 10; i++) {
//              System.out.println(random.nextInt() +" "); //[+int;-int]
//              System.out.print(random.nextInt(20) +" | "); //[0;value]
//            System.out.println(random.nextFloat() +" "); //[0;1]
//            System.out.println(random.nextDouble() +" "); //[0;1]
//            System.out.print(randomValue(-20, -10));
//       }
     //   System.out.println("Result random user number: " + randomValue(inputUserNumber("Enter value1"),inputUserNumber("Enter value2")));
     //   welcomeUser();
     //   welcomeUser("Sergey");
     //   int [] myArrayInteger = new int[5];
     //   myArrayInteger[0] = 10;
     //   myArrayInteger[1] = 20;
     //   myArrayInteger[2] = 30;
     //   myArrayInteger[3] = 40;
     //   myArrayInteger[4] = 50;
     //   System.out.println(myArrayInteger[2] + myArrayInteger[4]);
     //   String[] MyStringArray = new String[80];
     //   for (int i = 0; i < MyStringArray.length; i++) {
     //       MyStringArray[i] = "String " + i;
     //   }
    //    for (int i = 0; i < MyStringArray.length; i++) {
    //       System.out.println(MyStringArray[i]);
    //}


    //   public static String inputUserName(String msg) {
    //       System.out.println(msg +" > ");
    //       return scanner.next();
    //   }
    //   public static int inputUserNumber(String msg) {
    //       System.out.println(msg + " > ");
    //       return scanner.nextInt();
     //   int[] test1 = new int[10];
     //   recordDataInArray(test1);
     //   printArray(test1);
     //   int [][] myArray2 = new int[5][4];
      //  myArray2[2][2] = 16;
        studyArray3(10,10);
       }
       public static void studyArray3(int height, int width) {
        String [][] table = new String[height][width];
        for ( int y = 0; y < table.length; y++) {
            for ( int x = 0; x < table[y].length; x++) {
                table[y][x] = "[" + y + "; " + x +"]";
            }
        }
        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table[y].length; x++) {
                System.out.print(table[y][x] + "\t");
            }
            System.out.println();
        }
       }
//    public static int randomValue(int value1, int value2) {
//        if (value2 > value1) {
//            int tmp = value2 - value1;
//            return value1 + random.nextInt(tmp);
 //       } else {
//            System.out.println("Sorry");
//            return -1;
//        }

//    }
 //   public static void welcomeUser() {
 //       System.out.println("Welcome User");
 //   }
 //   public static void welcomeUser(String name) {
//       System.out.println("Welcome " + name);
 //   }
 //   public static void recordDataInArray(int[] inputArray) {
 //       for(int i = 0; i < inputArray.length; i++) {
 //           inputArray[i] = randomValue(-20,20);
//        }
//    }
 //   public static void printArray(int[] inputArray){
//        for (int i = 0; i < inputArray.length; i++) {
//            System.out.println(inputArray[i]);
//        }
//    }
}




