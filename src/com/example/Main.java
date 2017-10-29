package com.example;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int wins = 0;
        for (int i = 0; i < 100000; ++i) {
            if (playCraps()) {
                wins++;
            }
        }
        System.out.println(wins);
        System.out.println(Math.round((wins / 100000.0) * 100));
        System.out.println((int)((wins / 100000.0) * 100));
    }

    public static boolean playCraps() {
        int point = 0;
        int roll;
        roll = rollDice();
        if (roll == 2 || roll == 11) {
            return false;
        } else if (roll == 7) {
            return true;
        } else {
            point = roll;
        }
        while (true) {
            roll = rollDice();
            if (roll == 7) {
                return false;
            } else if (roll == point) {
                return true;
            }
        }
    }

    public static int rollDice() {
        Random random = new Random();
        return (random.nextInt(6) + 1) + (random.nextInt(6) + 1);
    }
}
