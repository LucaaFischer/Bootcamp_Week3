package com.btcag.bootcamp;

import java.util.Arrays;
import java.util.Scanner;

public class Main extends Queuelist {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int userInput;
        int toDo = 0;
        Queuelist queuelist = new Queuelist();
        while (toDo != 6) {
            System.out.println("Was möchtest du machen?\n" +
                    " (1) Erstes Element löschen,\n" +
                    " (2) Letztes Element löschen,\n" +
                    " (3) Objekt am Ende einfügen,\n" +
                    " (4) Objekt am Anfang hinzufügen,\n" +
                    " (5) Ein bestimmtes Element auslesen,\n" +
                    " (6) Programm beenden.\n");

            toDo = input.nextInt();

            if (toDo == 1) {
                System.out.println(STR."Das Element \{queuelist.popFirst()} wurde gelöscht");


            } else if (toDo == 2) {
                System.out.println(STR."Das Element \{queuelist.popLast()} wurde gelöscht");

            } else if (toDo == 3) {
                System.out.println("Was möchtest du hinzufügen?");
                userInput = input.nextInt();
                System.out.println(STR."Das Objekt \{queuelist.pushLast(userInput)} wurde der Warteschlange am Ende hinzugefügt!");

            } else if (toDo == 4) {
                System.out.println("Was möchtest du hinzufügen?");
                userInput = input.nextInt();
                System.out.println(STR."Das Objekt \{queuelist.pushFirst(userInput)} wurde der Warteschlange am Anfang hinzugefügt!");

            } else if (toDo == 5) {
                System.out.println("Welches Element willst du auslesen?");
                userInput = input.nextInt();
                System.out.println(STR."Das \{userInput}. Element der Queue ist \{queuelist.getObject(userInput)}");
            }
            System.out.println(STR."Queue: \{Arrays.toString(queuelist.printQueue())}");
        }
    }
}