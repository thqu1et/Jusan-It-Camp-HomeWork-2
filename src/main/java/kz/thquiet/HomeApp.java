package kz.thquiet;

import java.util.Scanner;

public class HomeApp {
    static Scanner sc = new Scanner(System.in);
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Hello World!" );
        System.out.println("---------------------------");
        arrayFirstTask();
        System.out.println();
        System.out.println("---------------------------");
        arraySecondTask();
        System.out.println();
        System.out.println("---------------------------");
        arrayThirdTask();
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
}
