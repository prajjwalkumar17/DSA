import java.util.Scanner;

public class Arr {

    private static Scanner sc = new Scanner(System.in);

    public static int[] getInteger() {
        System.out.println("How many nos you are Planning to sort");
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
            for(int i=0;i<arayy.length-1;i++){
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


}
