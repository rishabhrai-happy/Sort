package Main;
import bubbles1.Bubble;
import SelectionSort.Selectoin;
import Insretion.Isort;

import java.util.Arrays;
import java.util.Scanner;

public class Main   {
    public static void main(String arg[]){
         Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int[] array = new int[numberOfElements];
        for (int i = 0; i < array.length; i++) {
            array[i]= scanner.nextInt();
        }
        int c=scanner.nextInt();

        Bubble b=new Bubble();
        Selectoin s=new Selectoin();
        Isort I=new Isort();

        if(c==1){
            System.out.println("bublle sort");
            b.sort(array);
        }
        if(c==2){
            System.out.println("selection sort");
            s.ssort(array);
        }
        if(c==3){
            System.out.println("Insertion sort");
            I.Insort(array);
        }





    }
}
