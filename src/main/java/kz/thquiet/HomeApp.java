package kz.thquiet;

import java.util.Scanner;

public class HomeApp {
    static Scanner sc = new Scanner(System.in);
    public static void main( String[] args ) {
        System.out.println("---------------------------");
        arrayFirstTask();
        System.out.println();
        System.out.println("---------------------------");
        arraySecondTask();
        System.out.println();
        System.out.println("---------------------------");
        arrayThirdTask();
        System.out.println();
        System.out.println("---------------------------");
        arrayFourthTask();
        arrayFifthTask();
        int[] array = {1,5,3,2,11,4,2,5,4,8,9,1};
        System.out.println(arraySixthTask(array));
        arraySeventhTask(array , -3);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void arrayFirstTask(){
        int[] array = {1,1,0,0,1,0,1,1,0,0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            }else if (array[i] == 0){
                array[i] = 1;
            }else {
                System.out.println("This not integer for conditions");
                break;
            }
        }
       for(int arrays : array){
           System.out.print(arrays+" ");
       }
    }

    public static void arraySecondTask(){
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        for(int arrays : array){
            System.out.print(arrays+" ");
        }
    }

    public static void arrayThirdTask(){
        int[] array = {1,5,3,2,11,4,2,5,4,8,9,1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6){
                array[i] = array[i] * 2;
            }
        }
        for(int arrays : array){
            System.out.print(arrays+" ");
        }
    }

    public static void arrayFourthTask(){
        int size = sc.nextInt();
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        if (array.length != array[0].length) {
            System.out.println("Array is not square");
            return;
        }

        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void arrayFifthTask(){
        int[] array = {1,5,3,2,11,4,2,5,4,8,9,1};
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1; j++) {
                int temp ;
                if(array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for(int arrays : array){
            System.out.print(arrays + " ");
        }

        System.out.println(array[1]);
        System.out.println(array[array.length-1]);
    }

    public static boolean arraySixthTask(int[] array){
        int sum  = 0 ;
        int sum2 = 0;
        int middle = array.length/2;
        for (int i = 0; i < middle; i++) {
            sum += array[i];
        }
        for (int i = middle; i < array.length; i++) {
            sum2 += array[i];
        }
        if (sum == sum2){
            return true;
        }else {
            return false;
        }
    }

    public static void arraySeventhTask(int[] array , int n){
        if (n > 0){
            for (int i = 0; i < n; i++) {
                int k = array[array.length-1];
                for (int j = array.length-1; j > 0  ; j--) {
                    array[j] = array[j-1];
                }
                array[0] = k;
            }
        }else{
            for (int i = 0; i > n; i--) {
                int k = array[0];
                for (int j = 1; j < n; j++) {
                    array[j-1] = array[j];
                }
                array[array.length-1] = k;
            }
        }
    }
}
