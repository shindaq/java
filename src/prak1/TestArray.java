package prak1;

import prak1.prak1;

import java.sql.SQLOutput;
import java.util.Scanner;

import static prak1.prak1.*;

public class TestArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a size of array: ");
        int size = in.nextInt();
        prak1 arr = new prak1(size);
        System.out.println("Array sum by for: " + arr.getArraySumByFor());
        System.out.println("Array average: " + arr.getArrayAvg());
        System.out.println("Array sum by while: " + arr.getArraySumByWhile());
        System.out.printf("Array max value: %d\nArray min Value: %d\n", arr.getArrayMax(), arr.getArrayMin());
        getArgs(args);
        printHarmonicSeries();
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        System.out.printf("A factorial of number %d equals %d\n", n, fact(n));
    }
}