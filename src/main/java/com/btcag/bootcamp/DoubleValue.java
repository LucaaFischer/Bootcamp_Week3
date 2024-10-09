package com.btcag.bootcamp;

import com.sun.jdi.Value;

import java.util.Scanner;

public class DoubleValue extends ByRef {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Gib Integer ein: ");
        StartValue i = new StartValue(input.nextInt());

        ByRef.doubleValue(i);
        System.out.print(i.startValue);
    }
}