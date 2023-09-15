package prak1;
import java.util.Arrays;
import java.util.Scanner;

public class prak1 {
    private int size;

    private int[] array;

    public prak1(int size) {
        this.size = size;
        this.array = new int[size];
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an array values: ");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
    }
    public int getArraySumByFor() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum+=array[i];
        }
        return sum;
    }

    public float getArrayAvg() {
        return ((float)getArraySumByFor()/size);
    }

    public int getArraySumByWhile() {
        int sum = 0;
        int i = 0;
        while (i < size) {
            sum+=array[i];
            i++;
        }
        return sum;
    }

    public int getArrayMax() {
        int max = 0;
        int i = 0;
        while (i < size) {
            if (array[i] > max)
                max = array[i];
            i++;
        }
        return max;
    }

    public int getArrayMin() {
        int min = array[0];
        int i = 0;
        while (i < size) {
            if (array[i] < min)
                min = array[i];
            i++;
        }
        return min;
    }

    public static void getArgs(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
        System.out.println();
    }

    public static void printHarmonicSeries() {
        for (int i = 1; i < 11; i++) {
            System.out.printf("%.5f ", 1.0/i);
        }
        System.out.println();
    }

    public static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
