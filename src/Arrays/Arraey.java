package Arrays;

import java.util.Scanner;

public class Arraey {

    private static Scanner sc = new Scanner(System.in);

    public static int[] getInteger() {
        System.out.println("How many nos you are Planning to enter");
        int n = sc.nextInt();
        int[] gotArray = new int[n];
        System.out.println("Enter those integers");
        for (int i = 0; i < n; i++) {
            gotArray[i] = sc.nextInt();
        }
        return gotArray;
    }

    public static void printInteger(int[] arrayy) {
        System.out.println("\n");
        for (int i = 0; i < arrayy.length; i++) {
            System.out.println(arrayy[i]);
        }
    }

    public static int[] sortInteger(int[] arayy) {
        Boolean flag = true;
        int temp;
        while (flag) {
            flag=false;
            for(int i=0; i<arayy.length-1; i++){
                if(arayy[i]<arayy[i+1]){
                    temp=arayy[i];
                    arayy[i]=arayy[i+1];
                    arayy[i+1]=temp;
                    flag=true;
                }
            }
        }
        return arayy;
    }

    public static int[] readIntegers(int count){
        int[] newarray=new int[count];
        System.out.println("Inout all the "+count+" array elements one by one\n");
        for(int i=0; i<count; i++){
            newarray[i]=sc.nextInt();
        }
        return newarray;
    }

    public static int findminelementofthearray(int[] array) {
        int minno = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < minno) {
                minno = array[i];
            }
        }
        return minno;
    }

    public static int[] revarray(int[] array) {
        int temp;
        int length = array.length - 1;
        int hlflen = array.length / 2;
        for (int i = 0; i < hlflen; i++) {
            temp = array[i];
            array[i] = array[length - i];
            array[length - i] = temp;
        }
        return array;
    }
}
