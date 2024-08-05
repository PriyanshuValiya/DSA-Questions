package Greedy.Medium;

// https://www.geeksforgeeks.org/greedy-algorithm-egyptian-fraction

import java.util.*;

public class EgyptianFraction {
    static double num = 0;

    public static void getFractions(double nume, double dimo, ArrayList<Double> arr) {
        if(nume < 1 || dimo > 500) {
            return;
        }

        if(nume < dimo) {
            num = Math.ceil(dimo / nume) + 1;
        }

        nume = (nume * (num - 1)) - (1 * dimo);
        dimo *= (num - 1);

        System.out.println(nume + "/" + dimo);

        getFractions(nume, dimo, arr);
    }

    public static void main(String[] args) {
        ArrayList<Double> arr = new ArrayList<>();
        double nume = 6;
        double dimo = 14;

        System.out.println(nume + "/" + dimo);
        getFractions(nume, dimo, arr);
    }
}
