package kz.thquiet;
public class HomeApp {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        System.out.println("---------------------------");
        arrayFirstTask();
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

}
