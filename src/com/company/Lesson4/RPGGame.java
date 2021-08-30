package com.company.Lesson4;

import java.util.Random;

public class RPGGame {

    public static int bossHealth = 700;
    public static int bossDamage = 50;
    public static String bossDefenceType = "";
    public static int[] heroesHealth = {270, 260, 250, 240, 230};
    public static int[] heroesDamage = {25, 15, 20, 30, 0};
    public static String[] heroesAttackType = {"Physical", "Magical", "Kinetic", "Archer", "Doctor"};
    public static int doctorHill = 0;
    public static int roundCounter = 0;

    public static void main(String[] args) {
        printStatistics();
        while (!isGameOver()) {
            round();
        }
    }

    public static void round() {
        if (bossHealth > 0) {
            changeDefenceType();
            doctorHill();
            bossHits();
        }
        heroesHits();
        printStatistics();
    }

    public static void doctorHill() {
        for (int i = 0; i < heroesHealth.length; i++) {
            if (heroesAttackType[i].equals("Doctor")) {
                int randomHill = new Random().nextInt(100);
                int randomIndex = new Random().nextInt(heroesHealth.length);
                if (heroesHealth[i] < 100) {
                    heroesHealth[i] = heroesHealth[randomIndex] + randomHill;
                }
                System.out.println("Doctor hills hp + " + randomHill);
            }
        }
    }

    public static void changeDefenceType() {
        Random random = new Random();
        int randomIndex = random.nextInt(heroesAttackType.length);
        bossDefenceType = heroesAttackType[randomIndex];
        System.out.println("Boss choose: " + bossDefenceType);
    }

    public static void printStatistics() {
        System.out.println("-------------------------------");
        System.out.println("Round: " + roundCounter);
        roundCounter++;
        System.out.println("Boss health: " + bossHealth);
        for (int i = 0; i < heroesHealth.length; i++) {
            System.out.println(heroesAttackType[i] + " health: " + heroesHealth[i]);
        }
        System.out.println("-------------------------------");
    }

    public static void bossHits() {
        for (int i = 0; i < heroesDamage.length; i++) {
            if (heroesHealth[i] > 0) {
                if (heroesHealth[i] - bossDamage < 0) {
                    heroesHealth[i] = 0;
                } else {
                    heroesHealth[i] = heroesHealth[i] - bossDamage;
                }
            }
        }
    }

    public static void heroesHits() {
        for (int i = 0; i < heroesHealth.length; i++) {
            if (heroesHealth[i] > 0 && bossHealth > 0) {
                if (heroesAttackType[i] == bossDefenceType) {
                    Random random = new Random();
                    int randomValue = random.nextInt(10);
                    heroesDamage[i] = heroesDamage[i] - randomValue;
                } else {
                    bossHealth = bossHealth - heroesDamage[i];
                }

            } else {
                if (bossHealth - heroesDamage[i] < 0) {
                    bossHealth = 0;
                } else {
                    bossHealth = bossHealth - heroesDamage[i];
                }
                if (heroesHealth[i] < 0) {
                    System.out.println(heroesDamage[i] == 0);
                }
            }
        }
    }

    public static boolean isGameOver() {
        if (bossHealth <= 0) {
            System.out.println("Heroes won");
            return true;
        }

        boolean allHeroesDead = true;
        for (int i = 0; i < heroesHealth.length; i++) {
            if (heroesHealth[i] > 0) {
                allHeroesDead = false;
                break;
            }
        }
        if (allHeroesDead) {
            System.out.println("Boss won!!!");
        }
        return allHeroesDead;

    }
}
