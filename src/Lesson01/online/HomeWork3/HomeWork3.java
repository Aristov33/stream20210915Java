package HomeWork3;public class HomeWork3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        invertArray(arr1);
        System.out.println();
        //fullArray();
        changeArray();
        System.out.println();
        fullDiagonal();
        System.out.println();
        initialLen(8,4);
    }

    public static void invertArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
    }
    public static void fullArray() {
        int[] arr = new int[100];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] +" ");
        }
    }
    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
    }
    public static void fullDiagonal() {
        int[][] arr = {{1, 2, 3}, {4, 5, 6},{7, 8, 9}};
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                if (x == y) {
                    arr[x][y] = 1;
                }
                System.out.print(arr[x][y] + " ");
            }
            System.out.println();
        }
    }
    public static void initialLen(int len, int initialValue) {
        int arr[] = new int[len];
        for(int a = 0; a < len; a++) {
            arr[a] = initialValue;
            System.out.print("[" + a +"]" + arr[a] + " ");
        }
    }
}