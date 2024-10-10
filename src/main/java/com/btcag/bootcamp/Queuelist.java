package com.btcag.bootcamp;

public class Queuelist implements IMethods {
    public int[] queue = new int[5];

    public static void main(String[] args) {

    }

    public int[] doubleArray(int[] name) {
        int[] queueNew = new int[name.length * 2];
        for (int i = 0; i < name.length; i++) {
            queueNew[i] = name[i];
        }
        return queueNew;
    }

    public int popFirst() {
        int temp = queue[0];
        for (int i = 0; i < queue.length - 1; i++) {
            queue[i] = queue[i + 1];

        }
        return temp;
    }

    public int popLast() {
        int temp = 0;
        for (int i = queue.length - 1; i >= 0; i--) {
            if (queue[i] != 0) {
                temp = queue[i];
                queue[i] = 0;
                break;
            }
        }
        return temp;
    }

    public int pushLast(int i) {
        if (queue[queue.length - 1] != 0) {
            queue = doubleArray(queue);
        }
        int temp = -1;
        for (int j = 0; j < queue.length - 1; j++) {
            if (queue[j] == 0) {
                queue[j] = i;
                temp = queue[j + 1];
                break;
            }
        }
        return temp;
    }

    public int pushFirst(int i) {
        if (queue[queue.length - 1] != 0) {
            queue = doubleArray(queue);
        }
        int temp = -1;
        if (queue[0] != 0) {
            for (int j = queue.length - 2; j >= 0; j--) {
                queue[j + 1] = queue[j];
            }
        }
        queue[0] = i;
        temp = queue[0];
        return temp;
    }

    public int getObject(int i) {
        return queue[i];
    }

    public int[] printQueue() {
        return queue;
    }

    public Queuelist() {
    }
}
